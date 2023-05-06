package 基本程序结构;

public class Static_Usage {
    //属于类而不属于对象的静态变量
        static int count = 0;
        int id;

        public Static_Usage() {
            count++;
            id = count;
        }

        public static <Example> void main(String[] args) {
            Static_Usage e1 = new Static_Usage();
            Static_Usage e2 = new Static_Usage();
            Static_Usage e3 = new Static_Usage();
            System.out.println(e1.id); // 1
            System.out.println(e2.id); // 2
            System.out.println(e3.id); // 3
            System.out.println(Static_Usage.count); // 3
        }
    }
