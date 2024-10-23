/*precisamos do pacote Scanner para conseguir ler 
entradas do usuario, a classe Scanner faz parte do 
pacote "java.util" */
import java.util.Scanner;

// todo programa java deve estar dentro de uma classe.
// No caso ela deve ter o nome do arquivo java
// nesse caso desafio_002_pedir_nome_usuario
public class desafio_002_pedir_nome_usuario{ 
    
    // as chaves marca o inicio e o fim 
    //de algum bloco de execução

    /* O metodo main é sempre por onde a execução de um codigo
     * java começa, a palavra chave 'static' indica que esse
     * metodo pode ser chamado sem necessidade de instancias
     * de uma classe
     * */
    public static void main(String[] args) {
        /*Precisamos criar um objeto da classe scanner 
         * para ler a entrada do usuario
         */
        Scanner scanner = new Scanner(System.in);

        /* Metodo para pedir e receber entradas do usuario
         * é semelhante ao C
         */
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // aqui conseguimos ler uma linha inteira, pouco diferente de C

        // vamos exibir as boas vindas 
        System.out.println("Bem-vindo(a), " + nome + "!!");

        /* É sempre bom fechar objetos para liberar recursos 
         * que tal objeto poderia estar utilizando
         * no caso vamos fechar o scanner
         */
        scanner.close(); 

        }   


}