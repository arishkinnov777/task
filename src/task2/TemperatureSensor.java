package task2;

public class TemperatureSensor {
    private String name;
    private int minTemperature;
    private int maxTemperature;

    public TemperatureSensor(String name, int minTemperature, int maxTemperature) {
        this.name = name;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public String getName() {
        return name;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

}
