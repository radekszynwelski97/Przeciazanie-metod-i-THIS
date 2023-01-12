public class Car {

    String model ;
    String brand ;
    String color ;
    int year ;
    int numberOfWheel;
    String wheelColor;
    String type;

    String city ;

    public Car(String model, String brand, String color, int year, int numberOfWheel, String wheelColor, String type) {
        this(model,brand,color,year,numberOfWheel,wheelColor);
        this.type = type;
        System.out.println("Konstruktor 1 ");

    }

    public Car(String model, String brand, String color, int year, int numberOfWheel, String wheelColor) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.numberOfWheel = numberOfWheel;
        this.wheelColor = wheelColor;
        System.out.println("Konstruktor 2 ");
    }

    void pintInfo(){
        String info = model + " " + brand + " " + color + " " + year + " " + numberOfWheel + " " + wheelColor;
        System.out.println(info);
    }

    public Car(String model, String brand, String color, int year, int numberOfWheel, String wheelColor, String type, String city ) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.numberOfWheel = numberOfWheel;
        this.wheelColor = wheelColor;
        this.type = type;
        this.city = city;

        System.out.println("Konstruktor 3");

    }
}




