public class Iphone extends Phone{

    private String model;

    public Iphone(Integer age, String color) {
        super(age, color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Iphone Iphone 13 2022 White ");
    }

    public Iphone(Integer age, String color, String model){
        super(age, color);
        this.model = model;
    }
}

