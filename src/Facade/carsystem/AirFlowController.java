package Facade.carsystem;

public class AirFlowController {
    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        System.out.println("Воздух подан!");
    }

    public void off() {
        System.out.println("Выключаем контроль подачи воздуха");
    }
}
