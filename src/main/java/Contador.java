import exceptions.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int inicio = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int fim = terminal.nextInt();
            //chamando o método contendo a lógica de contagem
            contar(inicio, fim);

        }catch (ParametrosInvalidosException | InputMismatchException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int inicio, int fim ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (fim < inicio){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }


        int contagem = fim - inicio;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+i);
        }
    }
}
