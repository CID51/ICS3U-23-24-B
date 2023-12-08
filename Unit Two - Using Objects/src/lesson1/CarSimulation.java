package lesson1;

public class CarSimulation {
    public static void main(String[] args) {
        Car Jeep = new Car("Mercedes", "T500", 2020, 6000);
        Car Jeep2 = new Car("Jeep", "Jepp", 2023, 9001.01);



        Jeep.drive(100.7);
        Jeep2.printCarInfo();

    }
}
