import java.util.Scanner;

public class Bebidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coca-Cola - R$ 5");
        System.out.println("Coca-Cola 0 - R$ 4.50");
        System.out.println("Pepsi - R$ 4,40");
        System.out.println("Guaraná Antarctica - R$ 3,50");
        System.out.println("Fanta Laranja - R$ 4,23");
        System.out.println("Água - R$ 2,50");
        System.out.println("Escolha uma das opções de bebidas");
        Integer opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> System.out.println("O produto escolhido foi: Coca-Cola - R$ 5");
            case 2 -> System.out.println("O produto escolhido foi: Coca-Cola 0 - R$ 4.50");
            case 3 -> System.out.println("O produto escolhido foi: Pepsi - R$ 4.40");
            case 4 -> System.out.println("O produto escolhido foi: Guaraná Antarctica - R$ 3.50");
            case 5 -> System.out.println("O produto escolhido foi: Fanta Laranja - R$ 4.23");
            case 6 -> System.out.println("O produto escolhido foi: Água - R$ 2.50");
            default -> System.out.println("Produto não encontrado");
        }
    }
}
