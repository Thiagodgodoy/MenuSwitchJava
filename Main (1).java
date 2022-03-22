import java.util.Locale;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
		int questao;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		do {
      System.out.println("_______________________________________________________________");
			System.out.println("Informa qual questão deseja desenvolver: ");
			System.out.println("");
			System.out.println("1 - Cálculo Triângulo, circulo, quadrado, retângulo, trapézio ");
			System.out.println("2 - Ler duas Peças e Calcular o valor total da Nota ");
			System.out.println("3 - DIFERENCA = (A * B - C * D). ");
			System.out.println("4 - Cálculo de Almoço");
			System.out.println("5 - Compra de Bolsa");
			System.out.println("0 - Sair");
					
			questao = sc.nextInt();
			
			if (questao == 0) {
				System.out.println("\nAté Logo!");
				sc.close();			
			}
			
			switch (questao){
	        case 1:
	    		  System.out.println("Digite o valor de A: ");
            float valA = sc.nextFloat();
            System.out.println("Digite o valor de B: ");
            float valB = sc.nextFloat();
            System.out.println("Digite o valor de C: ");
            float valC = sc.nextFloat();        
            float tRet = (valA * valB)/2;
            System.out.printf("A area do triângulo retângulo é igual a: %.2f%n", tRet);
            double pi = 3.14159;
            float aCir = (float)pi* (valC * valC);
            System.out.printf("A area do circulo de raio C é igual a: %.2f%n", aCir);
            float aTrap = ((valA + valB) * valC)/2;
            System.out.printf("A area do trapezio é igual a: %.2f%n", aTrap);
            float aQuad = valB * valB;
            System.out.printf("A area do quadrado é igual a: %.2f%n", aQuad);
            float aReta = valA * valB;
            System.out.printf("A area do retangulo é igual a: %.2f%n", aReta);          
	    		break;	    		
	        case 2:
  	    		System.out.println("Digite a quantidade da peça 1: ");
            int qt1 = sc.nextInt();
            System.out.println("Digite o valor unitario da peça 1: ");
            double val1 = sc.nextDouble();
            System.out.println("Digite a quantidade da peça 2: ");  
            int qt2 = sc.nextInt();
            System.out.println("Digite o valor unitario da peça 2: ");
            double val2 = sc.nextDouble();
            double valTotal = (qt1 * val1) + (qt2 * val2);
            System.out.printf("O valor total a ser pago é igual a: R$ %.2f%n", valTotal);
          break;	            
	        case 3:
  	    		System.out.println("Digite o valor de A: ");
            int A = sc.nextInt();
            System.out.println("Digite o valor de B: ");
            int B = sc.nextInt();
            System.out.println("Digite o valor de C: ");
            int C = sc.nextInt();
            System.out.println("Digite o valor de D: ");
            int D = sc.nextInt();
            int diferenca = ((A * B) - (C * D));
            System.out.println("A diferença do produto de A e B pelo produto de C e D é igual a: " + diferenca);
	    		break;	    		
	        case 4:
	            System.out.println("Digite o peso em quilos: ");
		          double peso = sc.nextDouble();
		          double resul = peso*23;
		          System.out.printf("O valor do prato ficou: R$ %.2f%n", resul);
          break;	            
	        case 5:	        	           
	            System.out.println("Digite a opção de pagamento da bolsa: ");
          		System.out.println("1- A vista ");
          		System.out.println("2- Parcelado ");
          		System.out.println("3- Parcelado em 10 c/ juros ");
          		int opcaoPag = sc.nextInt();		
          			if (opcaoPag < 1){				
          			System.out.println("Opção Inválida!!");			
              }	else if (opcaoPag == 1){			
          			System.out.print("Digite o valor do produto: R$");
          			double valor = sc.nextDouble();			
          			double resultado = (double) valor*0.20 + valor;
                System.out.printf("O valor total a ser pago é de: R$ %.2f%n", resultado);
              } else if (opcaoPag == 2){
          			System.out.print("Digite o valor do produto: R$");
          			double valor = sc.nextDouble();			
          			double resultado = valor/3;
                System.out.printf("O valor divido em 3x será de: R$%.2f%n", resultado);
                
              } else if (opcaoPag == 3){
          			System.out.print("Digite o valor do produto: R$");
          			Double valor = sc.nextDouble();        		
          			double resultado =(valor*0.5) + valor;
          			double finalResut = (double) resultado / 10;
                System.out.printf("O valor divido em 10x (com juros) será de: R$%.2f%n", resultado);
                }	else {System.out.println("Valor informado não existe");
              }	
	            break;	        
			}			
		} while (questao != 0);		
		sc.close();		
	}
}