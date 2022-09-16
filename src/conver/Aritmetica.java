package conver;

/// Clase calculadora
public class Aritmetica {
    
    protected float op1;
    protected float op2;
    protected float sumar;
    protected float restar;
    protected float multiplicar;
    protected float dividir;

    public Aritmetica(float op1, float op2, float sumar, float restar, float multiplicar, float dividir) {
        this.op1 = op1;
        this.op2 = op2;
        this.sumar = sumar;
        this.restar = restar;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }

    public void setOp1(float op1) {
        this.op1 = op1;
    }

    public void setOp2(float op2) {
        this.op2 = op2;
    }

     /// Métodos Consultores GET ||| Modificadores SET ////////////////////////////////////////
    
    public float getSumar() {
        sumar = op1 + op2;
        return sumar;
    }

    public void setSumar(int sumar) {
        this.sumar = sumar;
    }

    public float getRestar() {
        restar = op1 - op2;
        return restar;
    }

    public void setRestar(float restar) {
        this.restar = restar;
    }

    public float getMultiplicar() {
         multiplicar = op1 * op2;
        return multiplicar;
    }

    public void setMultiplicar(float multiplicar) {
        this.multiplicar = multiplicar;
    }

    public float getDividir() {
         dividir = op1 / op2;
        return dividir;
    }

    public void setDividir(float dividir) {
        this.dividir = dividir;
    }
}
