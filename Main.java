/*This program is to do a multiplication between two numbers*/

import java.util.Scanner;

class Main{
  public static void main(String [] args){

    float number1, number2, multi;
  
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Informe o primeiro número da multiplicação: ");
    number1 = keyboard.nextFloat();

    System.out.print("Informe o segundo número da multiplicação: ");
    number2 = keyboard.nextFloat(); 

    multi = number1 * number2;

    System.out.println("A multiplicação entre o primeiro e segundo número é igual a: " + multi);


  }

  


}