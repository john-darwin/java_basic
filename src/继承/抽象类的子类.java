package 继承;

public class 抽象类的子类 extends 抽象类{
	  public 抽象类的子类(String name) {
	        super(name);
	    }
	    public void makeSound() {//父类的抽象方法
	        System.out.println("Meow!");
	    }
	    
	    public static void main(String[] args) {
		    抽象类 cat = new 抽象类的子类("Kitty");
		    cat.makeSound(); // 输出结果：Meow!
		    cat.eat(); // 输出结果：Kitty is eating.
		}

}

