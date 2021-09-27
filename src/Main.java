public class Main {

    String language;

    //parametresiz constructor
    Main() {
        this.language = "Java";
    }

    //parametreli constructor
    Main(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("Program dili: " + this.language);
    }

    public static void main(String[] args) {

        Main obj = new Main();
        Main obj1 = new Main("C#");

        obj.getName();
        obj1.getName();

    }
}
