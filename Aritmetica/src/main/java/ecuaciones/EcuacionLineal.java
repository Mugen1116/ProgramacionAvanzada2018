package ecuaciones;

public class EcuacionLineal {

    public float getX() { return x; }

    public float getA() { return a; }

    public float getB() { return b; }

    public void setX(float x) { this.x = x; }

    public void setA(float a) { this.a = a; }

    public void setB(float b) { this.b = b; }

    private float x, a, b;

    EcuacionLineal(){
        super();
    }

    public float solve(){
        return  (-b)/a;
    }





}
