package 浅拷贝;

public class 浅拷贝 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Alice", new Address("Shanghai", "Nanjing Road"));
        Person p2 = (Person) p1.clone();
        p2.getAddress().setCity("Beijing");
        // p1和p2共享Address对象，所以p1.getAddress().getCity()返回"Beijing"
        System.out.println(p1.getAddress().getCity());

    }
}
