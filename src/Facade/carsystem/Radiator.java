package Facade.carsystem;

public class Radiator {
    public void on(){
        System.out.println("Радиатор включен");
    }

    public void off(){
        System.out.println("Радиатор выключен");
    }

    public void setSpeed(Integer speed){
        System.out.println("Режим работы радиатора изменен. Скорость: " + speed);
    }
}
