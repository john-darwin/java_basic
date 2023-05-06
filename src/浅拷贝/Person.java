package 浅拷贝;

public class Person implements Cloneable {
    private String name;
    private Address address;

    // 构造方法和其他代码
    public Address getAddress() {
        return address;
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}