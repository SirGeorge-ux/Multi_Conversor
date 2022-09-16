package conver;

public class Decimal extends Aritmetica {
    
   /// ATRIBUTOS
    private char ip1;
    private char mascaraSubred1;
    private char ipBinario;
    private char direccionBradcast;

    /// CONSTRUCTORES
    public Decimal(float op1, float op2, float sumar, float restar, float multiplicar, float dividir) {
        super(op1, op2, sumar, restar, multiplicar, dividir);
    }

    public char getIp1() {
        return ip1;
    }

    public char getMascaraSubred1() {
        return mascaraSubred1;
    }

    public char getIpBinario() {
        return ipBinario;
    }

    public char getDireccionBradcast() {
        return direccionBradcast;
    }

    public void setIp1(char ip1) {
        this.ip1 = ip1;
    }

    public void setMascaraSubred1(char mascaraSubred1) {
        this.mascaraSubred1 = mascaraSubred1;
    }

    public void setIpBinario(char ipBinario) {
        this.ipBinario = ipBinario;
    }

    public void setDireccionBradcast(char direccionBradcast) {
        this.direccionBradcast = direccionBradcast;
    }


}
