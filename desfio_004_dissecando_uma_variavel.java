import java.util.Scanner;

public class desfio_004_dissecando_uma_variavel {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite algo: ");
            String input = scanner.nextLine();
    
            // Verificar se é um número
            boolean isNumeric = input.chars().allMatch(Character::isDigit);
            System.out.println("Número: " + isNumeric);
    
            // Verificar se é uma letra
            boolean isAlpha = input.chars().allMatch(Character::isLetter);
            System.out.println("Letra: " + isAlpha);
    
            // Verificar se está em minúsculo
            boolean isLowerCase = input.equals(input.toLowerCase());
            System.out.println("Minúsculo: " + isLowerCase);
    
            // Verificar se está em maiúsculo
            boolean isUpperCase = input.equals(input.toUpperCase());
            System.out.println("Maiúsculo: " + isUpperCase);
    
            // Verificar se é alfanumérico
            boolean isAlnum = input.chars().allMatch(Character::isLetterOrDigit);
            System.out.println("Número e letra: " + isAlnum);
    
            // Verificar se é um número decimal
            boolean isDecimal;
            try {
                Double.parseDouble(input);
                isDecimal = true;
            } catch (NumberFormatException e) {
                isDecimal = false;
            }
            System.out.println("Ponto flutuante (decimal): " + isDecimal);
    
            // Verificar se está dentro da faixa ASCII
            boolean isAscii = input.chars().allMatch(ch -> ch >= 0 && ch <= 127);
            System.out.println("ASCII: " + isAscii);
    
            // Verificar se é um identificador válido
            boolean isIdentifier = Character.isJavaIdentifierStart(input.charAt(0)) &&
                                   input.chars().skip(1).allMatch(Character::isJavaIdentifierPart);
            System.out.println("Identificador válido: " + isIdentifier);
    
            // Verificar se é composto apenas de espaços em branco
            boolean isBlank = input.isBlank();
            System.out.println("Espaço em branco: " + isBlank);
    
            // Verificar se todos os caracteres são imprimíveis
            boolean isPrintable = input.chars().allMatch(Character::isLetterOrDigit);
            System.out.println("Imprimível: " + isPrintable);
    
            // Verificar se a string está em formato de título
            boolean isTitle = input.length() > 0 && 
                              Character.isUpperCase(input.charAt(0)) && 
                              input.substring(1).equals(input.substring(1).toLowerCase());
            System.out.println("Título: " + isTitle);

            scanner.close();
        
          
        }

    }
    