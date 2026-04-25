import java.sql.SQLOutput;
import java.util.Scanner;

public class baseMain {

    public static void main(String[] args){


    Scanner input = new Scanner(System.in);


        System.out.print("Qual forma de operação deseja? sinais or ptbr: ");
        String formaOp = input.nextLine();

        if (formaOp.equals("sinais")) {
            System.out.print("Informe o primeiro numero: ");
            int num1 = input.nextInt();

            System.out.print("Informe o segundo numero: ");
            int num2 = input.nextInt();

            System.out.print("Informe a operação +, -, x or / :  ");
            String op = input.next();

            switch (op){
                case "+":
                    System.out.printf("O resultado é = %d ", num1 + num2);
                    break;

                case "-":
                    System.out.printf("O resultado é: %d ", num1 - num2);
                    break;

                case "x":
                    System.out.printf("O resultado é: %d ", num1 * num2);
                    break;

                case "/":
                    System.out.printf("O resultado é: %.2f ",(double) num1 / num2);
                    break;

                default:
                    System.out.println("Operação invalida.");
            }


        } else if (formaOp.equals("ptbr")) {
            System.out.print("Informe o primeiro numero: ");
            int num1 = input.nextInt();

            System.out.print("Informe o segundo numero: ");
            int num2 = input.nextInt();


            System.out.print("Informe a operação: some, menos, vezes, divida:  ");
            String op = input.next();

            switch (op){
                case "some":
                    System.out.printf("O resultado é = %d ", num1 + num2);
                    break;

                case "menos":
                    System.out.printf("O resultado é: %d ", num1 - num2);
                    break;

                case "vezes":
                    System.out.printf("O resultado é: %d ", num1 * num2);
                    break;

                case "divida":
                    System.out.printf("O resultado é: %.2f ",(double) num1 / num2);
                    break;

                default:
                    System.out.println("Operação invalida.");
            }


        }else{
            System.out.println("Tente novamente...");
        }







    }




}
