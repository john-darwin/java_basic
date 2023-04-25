package 接口与内部类;

public class OuterClass {
	    private int x = 10;
	    private static int y = 20;

	    public void print() {
	        System.out.println("OuterClass.x = " + x + ", OuterClass.y = " + y);
	    }

	    /**
	     * 内部类可以访问外部类的成员变量x和y，可以使用OuterClass.this关键字访问外部类的同名成员
	     * @author John13
	     *
	     */
	    public class InnerClass {
	        private int x = 100;

	        public void print() {
	            System.out.println("InnerClass.x = " + x + ", OuterClass.x = " 
	        + OuterClass.this.x);
	        }
	    }

	    /**
	     * 静态内部类static class
	     * 静态内部类，只能访问外部类的静态成员变量y，不能访问外部类的非静态成员变量x。
	     * @author John13
	     *
	     */
	    public static class StaticInnerClass {
	        private int z = 30;

	        public void print() {
	            System.out.println("StaticInnerClass.z = " + z + ", OuterClass.y = " + y);
	        }
	    }

	    public void test() {
	        InnerClass inner = new InnerClass();
	        inner.print();

	        StaticInnerClass staticInner = new StaticInnerClass();
	        staticInner.print();
	    }

	    public static void main(String[] args) {
	        OuterClass outer = new OuterClass();
	        outer.print();

	        OuterClass.InnerClass inner = outer.new InnerClass();
	        inner.print();

	        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
	        staticInner.print();
	    }
	}

