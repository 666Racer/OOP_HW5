package OOP_HW5.Data;

public class CupOfTea extends HotDrink {
    protected int temperature;

    public int getTemperature() { //getter для
        return temperature;
    }

    public CupOfTea(String name, int volume, int temperature) { //конструктор
        super(name, volume);
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "cup of Tea {" +
                "name = " + name +
                ", volume = " + volume +
                ", temperature = " + temperature +
                '}';
    }
}
