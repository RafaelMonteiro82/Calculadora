import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = 0;
        char operador;
        double num2 = 0;
        double resultado = 0;

        Scanner input = new Scanner(System.in);

        String op = JOptionPane.showInputDialog("Digite o operador: +,-,*,/ : ");
        operador = op.charAt(0);

        boolean entradaValida = false; // escudo não coloca qualquer coisa!
        while (!entradaValida) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite o valor 1: ");
                num1 = Double.parseDouble(entrada);
                entradaValida = true; //se chegou aqui deu certo!
            } catch (NumberFormatException e) {
                JOptionPane.showInputDialog(null,"Digite apenas números");

            }

        }

        entradaValida = false;
        while (!entradaValida) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite o valor 2: ");
                num2 = Double.parseDouble(entrada);
                entradaValida = true; //se chegou aqui deu certo!
            } catch (NumberFormatException e) {
                JOptionPane.showInputDialog(null,"Digite apenas números");

            }

        }


        switch (operador) {
            case '+':
                resultado = num1 + num2;
                JOptionPane.showInputDialog("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Entrada inválida!",
                        "Erro de Digitação", JOptionPane.ERROR_MESSAGE);


        }
        ;
    }

}



