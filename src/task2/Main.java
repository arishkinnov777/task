package task2;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor("Казань", 10, 35);
        System.out.println("город " + sensor.getName());
        System.out.println("минимальная температура летом " + sensor.getMinTemperature() + " градусов");
        System.out.println("максимальная температура летом " + sensor.getMaxTemperature() + " градусов");
    }
}
