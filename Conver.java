package conver;

import java.util.Scanner;

public class Conver {
   
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        
        System.out.print("Introduzca primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        numero2 = sc.nextInt();
        
        ///Creacion de Objeto
        Aritmetica aritmetica = new Aritmetica(int sumar, int restar, int multiplicar, float dividir);
        
        var resultado = aritmetica.sumar();
    }

}
