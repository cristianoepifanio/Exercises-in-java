import java.util.Scanner;

public class algoritmos {

    Scanner sc = new Scanner(System.in);
    
    // Resolução da 1ª questão da 1ª lista do 1º módulo de lógica de programação
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

    // Resolução da 2ª questão da 1ª lista do 1º módulo de lógica de programação
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

    // Resolução da 3ª questão da 1ª lista do 1º módulo de lógica de programação
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

    // Resolução da 1ª questão da 2ª lista do 1º módulo de lógica de programação
    public void alunoAvaliacao(){
        String nomeALuno = "";
        float nota1 = -1;
        float nota2 = -1;
        float nota3 = -1;

        System.out.println("Digite o nome do aluno: ");
        nomeALuno = sc.next();
        do {            
            System.out.println("Digite a primeira nota: ");
            nota1 = sc.nextFloat();
        } while (nota1<0 || nota1>10);
        
        do {            
            System.out.println("Digite a segunda nota: ");
            nota2 = sc.nextFloat();
        } while (nota2<0 || nota2>10);
        do {            
            System.out.println("Digite a terceira nota: ");
            nota3 = sc.nextFloat();
        } while (nota3<0 || nota2>10);
        
        
        float media = ((nota1+nota2+nota3)/3);

        if(media < 7){
            System.out.println(nomeALuno+" possui média "+media+" e está REPROVADO.");
        }else {
            System.out.println(nomeALuno+" possui média "+media+" e está APROVADO.");
        }

    }

    // Resolução da 2ª questão da 2ª lista do 1º módulo de lógica de programação
    public void mesDoAno(){
        int mes = 0;
        do {
            System.out.println("Digite un número entre 1 e 12");
            mes = sc.nextInt();
        } while (mes<1 || mes>12);
        switch(mes){
            case 1:
                System.out.println("O mês "+mes+" é Janeiro.");
                break;
            case 2:
                System.out.println("O mês "+mes+" é Fevereiro.");
                break;
            case 3:
                System.out.println("O mês "+mes+" é Março.");
                break;
            case 4:
                System.out.println("O mês "+mes+" é Abril.");
                break;
            case 5:
                System.out.println("O mês "+mes+" é Maio.");
                break;
            case 6:
                System.out.println("O mês "+mes+" é Junho.");
                break;
            case 7:
                System.out.println("O mês "+mes+" é Julho.");
                break;
            case 8:
                System.out.println("O mês "+mes+" é Agosto.");
                break;
            case 9:
                System.out.println("O mês "+mes+" é Setembro.");
                break;
            case 10:
                System.out.println("O mês "+mes+" é Outubro.");
                break;
            case 11:
                System.out.println("O mês "+mes+" é Novembro.");
                break;
            case 12:
                System.out.println("O mês "+mes+" é Dezembro.");
                break;
            
        }
    }
     // Resolução da 3ª questão da 2ª lista do 1º módulo de lógica de programação
     public void parcelas5xSemJuros(){
        
     }
}
    

