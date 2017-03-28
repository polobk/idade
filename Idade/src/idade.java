import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int idade;
		double altura;
		double medalt=0;
		int cont = 0;
		double totalal=0;
		int contal=0;
		int cont50 = 0;
		double medialtura =0;
		
		float soma;
		
	
					Scanner leitor = new Scanner (System .in);
		while (cont<=2){
		System.out.println("Digite  a sua idade");		
		idade = leitor.nextInt();
		
		System.out.println("Digite sua altura");
				altura = leitor.nextDouble();
				
			
				if (idade > 50){
										
					cont50++;
				}
				
				
				if (idade >=10 && idade <=20) {
					contal++; // contador 10 e 20
					totalal = totalal + altura;
					
						
					
					
				}
				cont++;
				
							
		}//while
		
		if (contal > 0){
			medialtura = totalal / contal; // contador media altura
			System.out.println("Idade superior a 50 Anos:" + cont50++);
			System.out.println("A Média das alturas das pessoas com idade entre 10 e 20 anos:"+medialtura);
		}
			
		}
		
	}





