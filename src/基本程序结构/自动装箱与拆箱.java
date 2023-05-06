package 基本程序结构;

public class 自动装箱与拆箱 {

    /**
     * Java把该内容自动封装在转换过程中
     */
    public static void bin(){
        int num=7;
        Integer num_bin=Integer.valueOf(num);
        System.out.println(num_bin);

        double dou=8;
        Double dou_bin=Double.valueOf(dou);
        System.out.println(dou_bin);

        char str='h';
        Character str_bin=Character.valueOf(str);
        System.out.println(str_bin);

    }

    public static void main(String[] args) {
        bin();

        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        System.out.println(i1==i2);
        System.out.println(i3==i4);
    }
}
