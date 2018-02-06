package conversor;

public class TemperatureMain {

    static Temperatura temp;
    public static void printTable( Temperatura temp){
        for (int i = 0; i<=100; i+=5){
            System.out.println(i + "\t\t" + temp.convertCelsius(i));
        }
    }

    public static void main( String[] args){
        temp = new Fahrenheit();
        System.out.println("Tabla de Fahrenheit");
        System.out.println("Celsius\tFahrenheit");
        printTable(temp);
        temp = new Reamur();
        System.out.println("Tabla de Reamur");
        System.out.println("Celsius\tReamur");
        printTable(temp);
    }

    /* *
    *   1.- No ha hecho falta modificar más que la nueva clase con su conversor
    *   2.- Para incluir una cuarta escala bastaría con que esa nueva escala implemente la interfaz de temperatura
    *   Y utilizando la referencia de la temperatura inicial, podríamos imprimir sus tablas
    *   Podríamos incluso crear funciones para no tener que desde el main hacer el print de qué escala se va a imprimir
    * */
}
