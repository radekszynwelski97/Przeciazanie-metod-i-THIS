public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("A4" , "Audi" , "Czerwony" , 2014 , 4 , "Chrome" ,
                "Sportage");
        Car car1 = new Car("M5" , "BMW" , "Czarny" , 2010 , 3 , "Białe" ,
                "Cabrio");
        Car car2 = new Car("Kia" , "Sportage" , "Żółty" , 2010 , 3 , "White" ,
                "SUV");
        Car car3 = new Car("Fiat" , "Punto" , "Zielony" , 2005 , 4 , "Zielony" );
        Car car4 = new Car("Mazda ","Villa" , "Żółty" , 2010 , 3, "Zielony" ,
                "Chojnice" );
        Car car5 = new Car("Mazda ","Villa" , "Żółty" , 2010 , 3, "Zielony" ,
                "Auto małe" , "Chojnice");

        car.pintInfo();
        car1.pintInfo();
        car2.pintInfo();
        car3.pintInfo();
        car5.pintInfo();

    }
}
