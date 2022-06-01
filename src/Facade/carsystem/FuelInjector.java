package Facade.carsystem;

public class FuelInjector {
    private FuelPump fuelPump = new FuelPump();

    public void on(){
        System.out.println("Включили инжектор");
    }

    public void inject() {
        fuelPump.pump();
        System.out.println("Пошел впрыск топлива");
    }

    public void off() {
        System.out.println("Выключили инжектор");
    }
}
