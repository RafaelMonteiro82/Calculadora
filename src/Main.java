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
        while (true) {
            String op = JOptionPane.showInputDialog("Digite o operador: + , - , * , / : ");
            operador = op.charAt(0);

            boolean entradaValida = false; // escudo não coloca qualquer coisa!
            while (!entradaValida) {
                try {
                    String entrada = JOptionPane.showInputDialog("Digite o valor 1: ");
                    num1 = Double.parseDouble(entrada);
                    entradaValida = true; //se chegou aqui deu certo!
                } catch (NumberFormatException e) {
                    JOptionPane.showInputDialog(null, "Digite apenas números");

                }

            }

            entradaValida = false;
            while (!entradaValida) {
                try {
                    String entrada = JOptionPane.showInputDialog("Digite o valor 2: ");
                    num2 = Double.parseDouble(entrada);
                    entradaValida = true; //se chegou aqui deu certo!
                } catch (NumberFormatException e) {
                    JOptionPane.showInputDialog(null, "Digite apenas números");

                }

            }


            switch (operador) {
                case '+':
                    resultado = Operacoes.somar(num1, num2);
                    break;
                case '-':
                    resultado = Operacoes.subtrair(num1, num2);
                    break;
                case '*':
                    resultado = Operacoes.multiplicar(num1, num2);
                    break;
                case '/':
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                        continue; // Volta para o início do while(true)
                    }
                    resultado = Operacoes.dividir(num1, num2);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    continue; // Pula a exibição do resultado e reinicia
            } // Chave que fecha o switch (O default ficou dentro!)

            // 5. Mostrar o Resultado (Dentro do while principal)
            JOptionPane.showMessageDialog(null, "O Resultado é: " + resultado, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}










