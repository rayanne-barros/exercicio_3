import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Integer idade = input.nextInt();
        if(idade<16) {
            System.out.println("Sem direito a votar");
        } else if(idade == 16 || idade < 18 || idade > 70) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto obrigatório");
        }
    }
}