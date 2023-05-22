package reto1;

import java.util.Scanner;

public class Reto1 {
     
    public static double Calcular_IMC (double masa, double altura){
        double imc = masa / (altura * altura);
        return imc;
    }
    
    public static String Calcular_riesgo (double imc, int edad){
        String riesgo = "";
        if (edad < 45 && imc <22){
            riesgo = "Bajo";
        }
        if ((edad >= 45 && imc <22) || (edad < 45 && imc >= 22)){
            riesgo = "Medio";   
        }
        if (edad >= 45 && imc >=22){
            riesgo = "Alto";
        }
        
        return riesgo;
    }
   
    public static boolean validacion (double masa, double altura, int edad){
        
        if ((masa < 0 || masa > 150)||(altura < 0.1 || altura > 2.5)||(edad < 0 || edad > 110)){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] entrada = sc.nextLine().split(" ");
        
        double masa = Double.parseDouble(entrada[0]);
        double altura = Double.parseDouble(entrada[1]);
        int edad = Integer.parseInt(entrada[2]);
        
        double imc = Calcular_IMC(masa,altura);
        String riesgo = Calcular_riesgo(imc,edad);
        boolean validar = validacion(masa,altura,edad);
        
        if (validar == true){
            System.out.println(String.format("%.1f", imc) + " " + riesgo);
        }else{
            System.out.println("ERROR");
        }
        
    }
    
}
