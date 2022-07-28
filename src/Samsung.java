public class Samsung extends Phone{

    private String model;

    public Samsung(Integer age, String color) {
        super(age, color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Samsung(Integer age, String color, String model) {
        super(age, color);
        this.model = model;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Samsung 2022 White A52 ");
    }
}
