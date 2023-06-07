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
            System.out.println("");
            System.out.print("Digite o módulo: ");
            int modulo = scanner.nextInt();
            System.out.print("Qual Lista? ");
            int lista = scanner.nextInt();
            System.out.print("Qual questão? ");
            int questao = scanner.nextInt();

            while(QuetionAgain==true){ 
            if (modulo==1 && lista==1 && questao==1){
                
                // Resolução da 1ª questão da 1ª lista do 1º módulo de lógica de programação
                    answer.calculadora();

            }else if (modulo==1 && lista==1 && questao==2){
                
                // Resolução da 2ª questão da 1ª lista do 1º módulo de lógica de programação
                    answer.ICM();
                    
            }else if (modulo==1 && lista==1 && questao==3){
                
                // Resolução da 3ª questão da 1ª lista do 1º módulo de lógica de programação
                    answer.votacaoPOWERGIRLS();
                    
            }else if (modulo==1 && lista==2 && questao==1){
                
                // Resolução da 1ª questão da 2ª lista do 1º módulo de lógica de programação
                    answer.alunoAvaliacao();
                    
            }else if (modulo==1 && lista==2 && questao==2){
                
                // Resolução da 2ª questão da 2ª lista do 1º módulo de lógica de programação
                    answer.mesDoAno();
                    
            }else if (modulo==1 && lista==2 && questao==3){
                
                // Resolução da 3ª questão da 2ª lista do 1º módulo de lógica de programação
                    answer.parcelas5xSemJuros();
                    
            }else if (modulo==1 && lista==2 && questao==4){
                
                // Resolução da 4ª questão da 2ª lista do 1º módulo de lógica de programação
                    answer.precificacao();
                    
            }else if (modulo==1 && lista==2 && questao==5){
                
                // Resolução da 5ª questão da 2ª lista do 1º módulo de lógica de programação
                    answer.consumoMedioDeUmAutomovel();
                    
            }else{
                System.out.println("Desculpe, não temos essa questão.");
            }   
                
                // To repeat the running quetion
            System.out.println("");
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
                    
                    // to asking to repeat any another question
                    System.out.print("Deseja testar outra questão? (s/n) ");
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
