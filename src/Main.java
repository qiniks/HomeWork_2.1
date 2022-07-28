public class Main {

    public static Printable createObject(String classname) {
        switch (classname) {
            case "Object1":
                Iphone phone1 = new Iphone(2022, "White", "Iphone 13");
                return phone1;

            case "Object2":
                Samsung phone2 = new Samsung(2021, "Black", "A52");
                return phone2;

            case "Object3":
                Xiaomi phone3 = new Xiaomi(2022, "Blue", "Mi 12");
                return phone3;
        }
        return null;
    }



    public static void main(String[] args) {
        Printable[] print = {createObject("Object1"), createObject("Object2"),
                createObject("Object3")};

        for (Printable printable : print) {
            printable.print();
        }
    }
}