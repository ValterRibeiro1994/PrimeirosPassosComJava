import java.util.Scanner;

public class desafio_003_somando_dois_numeros{

    public static void main(String[] args){

        System.out.print("Digite um Número 1: ");
        Scanner criar_entrada = new Scanner(System.in);
        int numero1 = criar_entrada.nextInt();

        System.out.print("Digite Número 2: ");
        int numero2 = criar_entrada.nextInt();

        int somar = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + somar);

        criar_entrada.close();
    }
    
}
