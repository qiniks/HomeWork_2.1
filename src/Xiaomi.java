public class Xiaomi extends Phone{

    private String model;

    public Xiaomi(Integer age, String color) {
        super(age, color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Xiaomi(Integer age, String color, String model) {
        super(age, color);
        this.model = model;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Xiaomi 2022 Blue Mi 12");
    }
}
