package 继承;

class 子类 extends 父类 {

	private String breed;

    public 子类(String name, String breed) {
        super(name); // 调用父类的构造方法，
        //构造方法使用super关键字调用了父类的构造方法来初始化从父类继承而来的成员变量name。
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        super.makeSound(); // 在子类中调用父类被覆盖的方法
        //使用super关键字来调用父类中被覆盖的makeSound()方法，并在子类中添加了新的行为。
        System.out.println("Dog is barking.");
    }

    public void printInfo() {
        System.out.println("Name: " + super.name); // 访问父类中的成员变量
        System.out.println("Breed: " + this.breed);
        super.makeSound(); // 调用父类的成员方法
        this.makeSound();
    }
    
    public static void main(String[] args) {
    	 子类 dog = new 子类("Buddy", "Golden Retriever");
         dog.printInfo();
    }
}


