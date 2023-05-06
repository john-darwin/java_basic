package 浅拷贝;


public class Address {
    private String city;
    private String street;

    // 构造方法和其他代码
    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}