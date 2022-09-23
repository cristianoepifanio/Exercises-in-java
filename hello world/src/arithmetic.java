//  Faça um algoritmo que vai pedir dois números e depois apresentar os resultados para as operações de soma, subtração, multiplicação e divisão destes números.
/**
 * arithmetic
 */
import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        float x;
        float y;
        System.out.println("Digite um número: ");
        x = Float.parseFloat(num1.nextLine());
        System.out.println("Digite outro número: ");
        y = Float.parseFloat(num2.nextLine());
        System.out.println("A soma entre os números "+x+" e "+y+" é "+(x+y));
        System.out.println("A soubtração entre os números "+x+" e "+y+" é "+(x-y));
        System.out.println("A multiplicação entre os números "+x+" e "+y+" é "+(x*y));
        if (y == 0) {
            System.out.println("Não é possível divisão por 0.");
        } else {
            System.out.println("A divisão entre os números "+x+" e "+y+" é "+(x/y));   
        }

        num1.close();
        num2.close();
    }
}
