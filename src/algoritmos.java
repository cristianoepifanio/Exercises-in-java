import java.util.Scanner;

public class algoritmos {

    public void calculadora() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite num1: ");
            float x = sc.nextFloat();
            System.out.println("Digite num2: ");
            float y = sc.nextFloat();
            float soma = x+y;
            float sub = x-y;
            float mult = x*y;
    
            System.out.println("A soma de "+x+" + "+y+" = "+soma);
            System.out.println("A subtração de "+x+" + "+y+" = "+sub);
            System.out.println("A multiplicação de "+x+" + "+y+" = "+mult);
        }

        
    }
    public void ICM(){
        Scanner sc2 = new Scanner(System.in);
            System.out.println("Digite seu peso: ");
            float peso = sc2.nextFloat();
            System.out.println("Digite sua altura: ");
            float altura = sc2.nextFloat();
            float icm = peso/(altura*altura);
            if(icm<=18.5){
                System.out.println("ABAIXO DO PESO.");
            }
        

    }

}
    

