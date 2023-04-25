package 继承;

public abstract class 抽象类 {
	private String name;
    public 抽象类(String name) {
        this.name = name;
    }
    public abstract void makeSound();//抽象方法由子类实现
    public void eat() {
        System.out.println(name + " is eating.");
    }

}
