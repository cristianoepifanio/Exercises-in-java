import java.util.Scanner;

public class Main{
    /**
     * @param args
     */
    public static void main(String[] args) {

        // OBJECTS
        Scanner scanner = new Scanner(System.in);
        algoritmos answer = new algoritmos();
        // VARIABLES
        boolean QuetionsAgain = true; //repeat any of all the question
        boolean QuetionAgain = true;  //repeat the running quetion
        String repetir = "";
        String repetirQuestao = "";

        
        
        
        while (QuetionsAgain == true){
            QuetionAgain = true;
            QuetionsAgain = true;
            System.out.print("Digite o módulo: ");
            int modulo = scanner.nextInt();
            System.out.print("Qual Lista? ");
            int lista = scanner.nextInt();
            System.out.print("Qual questão? ");
            int questao = scanner.nextInt();

            if (modulo==1 && lista==1 && questao==1){
                // Resuloção da 1ª questão da 1ª lista do 1º módulo de lógica de programação
                while(QuetionAgain==true){ 
                    answer.calculadora();
                    // answer.repetirQuestao();

                    // // To repeat the running quetion
                    System.out.print("Deseja repetir a questão? ");
                        repetirQuestao = scanner.next();
                        
                        

                    switch(repetirQuestao){
                        case "s":
                        QuetionAgain = true;
                        break;
                        case "n":
                        QuetionAgain = false;
                        break;
                        default:
                        System.out.println("Por favor, digitar apenas 's' ou 'n'.");
                    }
                    
                }        
            }
            if (modulo==1 && lista==1 && questao==2){
                // Resuloção da 2ª questão da 1ª lista do 1º módulo de lógica de programação
                while(QuetionAgain==true){ 
                    answer.ICM();
                    // answer.repetirQuestao();
                    // // To repeat the running quetion
                    System.out.print("Deseja repetir a questão? ");
                    repetirQuestao = scanner.next();

                    switch(repetirQuestao){
                        case "s":
                            QuetionAgain = true;
                            break;
                        case "n":
                            QuetionAgain = false;
                            break;
                        default:
                            while(repetirQuestao!="s"||repetirQuestao!="n" ){
                                System.out.println("Por favor, digitar apenas 's' ou 'n'.");
                            }
                    }
                    
                }        
            }

            // to asking to repeat any other question
            System.out.print("Deseja testar outra questão? (s/n)");
            repetir = scanner.next();
            switch(repetir){
                case "s":
                QuetionsAgain = true;
                break;
                case "n":
                QuetionsAgain = false;
                break;
                default:
                System.out.println("Por favor, digitar apenas 's' ou 'n'.");
                
            }
        }
   }
}