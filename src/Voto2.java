import java.util.Scanner;

public class Voto2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Integer idade = input.nextInt();
       String direitoDoVoto = idade < 16 ? "Sem direito a votar" : ((idade == 16) || (idade < 18) || (idade > 70)) ? "Voto facultativo" : "Voto Obrigatório";
        System.out.println(direitoDoVoto);
    }
}
