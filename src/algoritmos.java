import java.util.Scanner;

public class algoritmos {

    Scanner sc = new Scanner(System.in);

    // public void repetirQuestao(){
    //     String repetirQuestao = "";
    //     boolean QuetionAgain = true;
    //     System.out.print("Deseja repetir a questão? ");
    //                 repetirQuestao = sc.next();

    //                 switch(repetirQuestao){
    //                     case "s":
    //                         QuetionAgain = true;
    //                     break;
    //                     case "n":
    //                         QuetionAgain = false;
    //                     break;
    //                     default:
    //                     System.out.println("Por favor, digitar apenas 's' ou 'n'.");
    //                 }
    // }
    
    public void calculadora() {
            System.out.println("Digite num1: ");
            float x = sc.nextFloat();
            System.out.println("Digite num2: ");
            float y = sc.nextFloat();
            float soma = x+y;
            float sub = x-y;
            float mult = x*y;
            float div = x/y;

    
            System.out.println("A soma de "+x+" + "+y+" = "+soma);
            System.out.println("A subtração de "+x+" - "+y+" = "+sub);
            System.out.println("A multiplicação de "+x+" x "+y+" = "+mult);
            if(y==0){
                System.out.println("OPERAÇÃO INVÁLIDA: 'Não é definido divisão por 0.'");
            }else{
                System.out.println("A divisão de "+x+" / "+y+" = "+div);                
            }
        

        
    }
    public void ICM(){
        
            System.out.println("Digite seu peso: ");
            float peso = sc.nextFloat();
            System.out.println("Digite sua altura: ");
            float altura = sc.nextFloat();
            float icm = peso/(altura*altura);
            if(icm<18.5){
                System.out.println("ABAIXO DO PESO.");
            }else if (icm<25){
                System.out.println("PESO NORMAL.");
            }else if(icm<30){
                System.out.println("SOBRE PESO.");
            }else if(icm<35){
                System.out.println("OBESO LEVE.");
            }else if(icm<=40){
                System.out.println("OBESO MODERADO.");
            }else if(icm>40){
                System.out.println("OBESO MORBIDO.");
            }

    }

    public void votacaoPOWERGIRLS(){
        int docinho = 0;
        int lindinha = 0;
        int florzinha = 0;
        int finalizar = 1;
        int votacao = 1;


        System.out.println("Qual a sua menina super poderosa preferida?");
        while(finalizar!=0){
            votacao = sc.nextInt();
            switch(votacao){
                case 0:
                    finalizar = 0;
                    break;
                case 1:
                    docinho += 1;
                    break;
                case 2:
                    lindinha += 1;
                    break;
                case 3:
                    florzinha += 1;
                    break;
                default:
                    System.out.println("Os números possiveis são apenas 1,2 e 3.");
            }
        }
        System.out.println("Docinho: "+docinho);
        System.out.println("Lindinha: "+lindinha);
        System.out.println("Florzinha: "+florzinha);
    }

}
    

