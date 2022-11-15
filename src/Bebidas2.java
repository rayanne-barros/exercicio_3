import java.util.Scanner;

public class Bebidas2 {
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
        if (opcao == 1) {
            System.out.println("O produto escolhido foi: Coca-Cola - R$ 5");
        } else if(opcao == 2) {
            System.out.println("O produto escolhido foi: Coca-Cola 0 - R$ 4.50");
        } else if (opcao == 3) {
            System.out.println("O produto escolhido foi: Pepsi - R$ 4.40");
        } else if (opcao == 4) {
            System.out.println("O produto escolhido foi: Guaraná Antarctica - R$ 3.50");
        } else if (opcao == 5) {
            System.out.println("O produto escolhido foi: Fanta Laranja - R$ 4.23");
        } else if (opcao == 6) {
            System.out.println("O produto escolhido foi: Água - R$ 2.50");
        } else {
            System.out.println("Produto não encontrado");
        }
    }
}
