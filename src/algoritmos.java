import java.util.Scanner;

public class algoritmos {

    Scanner sc = new Scanner(System.in);
    
    // Resolução da 1ª questão da 1ª lista do 1º módulo de lógica de programação
    public void calculadora() {
        System.out.println("");
        System.out.println("QUESTÃO:");
        System.out.println("Digite dois números e este algoritmo te retornará a Soma, subtração, multiplicação e divisão dos mesmos:");
        System.out.println("");
            System.out.print("Digite num1: ");
            float x = sc.nextFloat();
            System.out.print("Digite num2: ");
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
            System.out.println("");
            System.out.println("QUESTÃO:");
            System.out.println("Informe seu peso e sua altura e este algoritmo te retornará o status do seu ICM (índice de massa corporea.)");
            System.out.println("");
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
        System.out.println("");
        System.out.println("QUESTÃO:");
        System.out.println("Vote em [1] para Docinho, [2] para Lindinha e [3] para Florzinha. Pressione [0] quando quiser finalizar a votação.");
        System.out.println("");
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
        if(docinho>lindinha && docinho>florzinha){
            System.out.println("Docinho ganhou.");
        }else if(lindinha>docinho && lindinha>florzinha){
            System.out.println("Lindinha ganhou.");
        }else if(florzinha>docinho && lindinha<florzinha){
            System.out.println("Florzinha ganhou.");
        }else if(docinho==lindinha){
            System.out.println("EMPATE entre Docinho e Lindinha.");
        }else if(docinho==florzinha){
            System.out.println("EMPATE entre Docinho e Florzinha.");
        }else if(florzinha == lindinha){
            System.out.println("EMPATE entre Florzinha e Lindinha.");
        }
    }

    // Resolução da 1ª questão da 2ª lista do 1º módulo de lógica de programação
    public void alunoAvaliacao(){
        System.out.println("");
        System.out.println("QUESTÃO:");
        System.out.println("Digite o nome do aluno e as 3 notas tiradas por ele e este programa te retorna a média e a situação do mesmo, aprovado ou reprovado apenas.");
        System.out.println("");
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
        } while (nota3<0 || nota3>10);
        
        
        float media = ((nota1+nota2+nota3)/3);

        if(media < 7){
            System.out.println(nomeALuno+" possui média "+media+" e está REPROVADO.");
        }else {
            System.out.println(nomeALuno+" possui média "+media+" e está APROVADO.");
        }

    }

    // Resolução da 2ª questão da 2ª lista do 1º módulo de lógica de programação
    public void mesDoAno(){
        System.out.println("");
        System.out.println("QUESTÃO:");
        System.out.println("Digite un número entre 1 e 12 e estre programa te retorna o mês do ano equivalente.");
        System.out.println("");
        int mes = 0;
        do {
            System.out.println("Digite un número entre 1 e 12.");
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
        System.out.println("");
        System.out.println("QUESTÃO:");
        System.out.println("Digite um valor de um produto e este programa te retornará o valor das parcelas dividas em 5x sem juros.");
        System.out.println("");
        float valor = 0;
        float parcela = 0;
        System.out.print("O valor do produto: ");
        valor = sc.nextFloat();
        parcela = valor/5;
        System.out.println("O valor da parcela é de: R$ "+parcela);
     }
     // Resolução da 4ª questão da 2ª lista do 1º módulo de lógica de programação
     public void precificacao(){
            System.out.println("");
            System.out.println("QUESTÃO:");
            System.out.println("Digite um valor e uma margem(%) e este programa lhe mostrará o valor final do produto.");
            System.out.println("");
            float valor = 0;
            int margem = 0;
            System.out.print("Digite o valor de compra: ");
            valor = sc.nextFloat();
            System.out.print("Digite a margem em %: ");
            margem = sc.nextInt();
            float precoFinal = valor+((valor*margem)/100);
            System.out.println("Preço final de R$ "+precoFinal+".");

            
     }
     // Resolução da 5ª questão da 2ª lista do 1º módulo de lógica de programação
     public void consumoMedioDeUmAutomovel(){
        System.out.println("");
        System.out.println("QUESTÃO:");
        System.out.println("Digite a kilometragem rodada e o volume em L de combustível consumida e estre programa te retornará o consumo médio do mesmo.");
        System.out.println("");
        float kilometragem = 0;
        float combustivel = 0;
        System.out.print("Qual a kilometragem rodada? ");
        kilometragem = sc.nextFloat();
        System.out.print("Quantos litros foram consumidos? ");
        combustivel = sc.nextFloat();
        float consumoMedio = kilometragem/combustivel;
        System.out.println("Assim, o consumo médio é de "+consumoMedio+" Km/L.");
     }
}
    

