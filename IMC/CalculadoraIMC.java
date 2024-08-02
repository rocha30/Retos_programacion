package IMC;

import java.util.Scanner;

public class CalculadoraIMC {
    
    /*Crea una calculadora
     * de indice de masa corporal 
     */

     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        double peso; 
        
        System.out.println("Ingrese su peso en kg: ");
        peso = in.nextDouble();
        
        double altura; 
        System.out.println("Ingrese su alura en metros: ");
        altura = in.nextDouble();
        

        double IMC; 

        IMC = peso / (altura*altura);
        System.out.println("Su indice de masa corporal es: " + IMC);

        if(IMC<18.5){
            System.out.println("Bajo peso ");
        }
        else if (IMC < 24.9){
            System.out.println("Adecuado");
            
        }
        else if (IMC < 29.9){
            System.out.println("Sobre peso");
        }
        else if (IMC<34.9){
            System.out.println("Obesidad grado 1 ");
        }
        else if (IMC < 39.9){
            System.out.println("Obesidad grado 2");

        }
        else {
            System.out.println("Obesidad grado 4");
        }

        in.close();
    }
     

     
}
