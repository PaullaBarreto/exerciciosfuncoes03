package ExerciciosFuncoesTerceiroPrograma;

import java.util.Scanner;

public class ExercicioFuncoesTerceiroPrograma {   

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    double num1 = entrada.nextInt();
    System.out.print("Digite o segundo número: ");
    double num2 = entrada.nextInt();
    System.out.print("Digite o terceiro número: ");
    double num3 = entrada.nextInt();

    double t = soma(num1, num2, num3);
    System.out.println("A soma dos 3 números informado é: "+t);	
}
public static double soma(double n1, double n2, double n3) { 
    return n1+n2+n3;
}

}