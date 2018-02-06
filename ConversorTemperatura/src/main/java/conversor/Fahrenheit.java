package conversor;

public class Fahrenheit implements Temperatura {

    public float convertCelsius(float celsius) {
        return celsius*9/5 + 32;
    }
}
