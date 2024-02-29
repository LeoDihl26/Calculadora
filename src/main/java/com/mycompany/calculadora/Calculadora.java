/*
 * CRIE UM MENU DE UMA CALCULADORA QUE SOME, SUBTRAIA, MULTIPLIQUE E DIVIDA, MOSTRANDO O RESULTADO DO CALCULO NO FINAL.
 */

package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double num1,num2;
        
        System.out.println("primeiro número:"); num1 = teclado.nextDouble();
        System.out.println("segundo número:");num2 = teclado.nextDouble();
        System.out.println("resultado:");  //resultado = teclado.nextDouble();        
        
        System.out.println(num1 % num2);
        
        //Adição System.out.println(num1 + num2);
        //Subtração System.out.println(num1 - num2);
        //Multiplicação System.out.println(num1 * num2);
        //Divisão System.out.println(num1 / num2);
        //Porcentagem System.out.println(num1 % num2);
        
        
        
        
        
        
        
      
        
       
        
        
        
        
        
        
        
        
    }
}
