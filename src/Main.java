import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite x: ");
        float x = scanner.nextFloat();
        System.out.println("Digite y: ");
        float y = scanner.nextFloat();
        System.out.println("A soma entre "+x+" e "+y+" é de: "+(x+y));
        System.out.println("A subtração entre "+x+" e "+y+" é de: "+(x-y));
        System.out.println("A multiplicação entre "+x+" e "+y+" é de: "+(x*y));
    }
}