public class Phone implements Printable{

    private Integer age;

    private String color;

    @Override
    public void print() {

    }

    public Phone(Integer age, String color) {
        this.age = age;
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
