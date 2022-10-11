package web.model;

public class Car {

    private String name;
    private String color;
    private int series;

    public Car() {

    }

    public Car(String name, String color, int series) {
        this.name = name;
        this.series = series;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
