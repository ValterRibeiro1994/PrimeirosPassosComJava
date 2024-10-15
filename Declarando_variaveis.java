public class Declarando_variaveis {

    public static void main(){
        /*
         * Existem varios tipos de dados em JAVA
         * String - armazena TEXTOS
         * int - lida com NUMEROS INTEIROS, sem casas decimais
         * float - recebe apenas NUMEROS DE PONTO FLUTUANTE, com casas decimais
         * char - mantem apenas CARACTERES UNICOS, uma letra apenas cercada com aspas simples
         * boolean - apenas TRUE/FALSE
         * 
         * Para criar variaveis devemos especificar o tipo e atribuir um valor
         * sintaxe:
         * tipoDedado nomeDavariavel = valor;
         * onde tipoDedado pode ser qualquer um dos tipos acima - String, int e etc.
         * nomeDavariavel é o nome que ela vai receber é obvio
         * o sinal de igual( = ) atribui o valor a variavel
         * e valor é o que voce vai guardar nela
         * 
         */

        // vamos declarar uma variavel para armazenar um nome
        String nome = "Valter Tertuliano"; // observe a letra maiuscula e o ponto virgula
        
        // vamos supor que queremos declarar uma idade pro nome acima
        int idade = 30;

        // agora vamos verificar se a pessoa é maior de idade
        boolean maioridade = idade < 18;

        // exibir maioridade
        System.out.println(maioridade); // vai retornar false

        //podemos trocar o valor de uma variavel tambem
        idade = 15;

        System.out.println(idade);

        // podemos declarar constantes --> variaveis que não queremos alterar
        // usando "final" antes de declarar o tipo de dado
        final char letra = 'V';

        // para definir pontos flutuantes com 2 casas decimais usamos f no final do valor
        float casaDecimal = 3.99f;

        // podemos concatenar variaveis de texto 
        System.out.println(nome + " " + idade);

        // podemos realizar operações com variaveis e etc.
        int num1 = 5;
        int num2 = 5;
        int soma = num1 + num2;
        System.out.println(" A soma de " + num1 + " + " + num2 + " é " + soma);


    }
    
}