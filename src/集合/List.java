package 集合;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    /*
    List接口的两种实现方式的随机查找的速度对比
     */
    public static void randomaccess(){
        ArrayList<Integer> arrayList = new ArrayList<Integer> ();
        
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int index = (int)(Math.random() * 100000);
            int element = arrayList.get(index);
        }
        long endTime = System.nanoTime();

        System.out.println("Time taken by ArrayList: " + (endTime - startTime) + " ns");

        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int index = (int)(Math.random() * 100000);
            int element = linkedList.get(index);
        }
        endTime = System.nanoTime();

        System.out.println("Time taken by LinkedList: " + (endTime - startTime) + " ns");

    }



    public static void main(String[] args) {
        randomaccess();

    }

}
