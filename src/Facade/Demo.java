package Facade;

public class Demo {
    public static void main(String[] args) {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        carEngineFacade.startEngine();
        System.out.println("<------------------------------------------------------------------>");
        carEngineFacade.stopEngine();
    }
}
