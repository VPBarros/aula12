import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("digite quantas pessoas participa da pesquisa?");
        // Logica de programção Vetor
		//programa para ler um numero,depois nome(palavra sem espaço)idade e altura de pessoa.
		//Depois mostrar na tela a altura Media das pessoas mostrar a porcentagem de pessoas com menos de 16 anos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[]nome = new String[N];
		int[]idades = new int[N];
		double[]alturas = new double [N];
		
		for (int i=0; i<N; i++) {
			nome[i]= sc.next();
			idades[i]= sc.nextInt();
			alturas[i]= sc.nextDouble();
		}
		double soma =0.0;
		for(int i=0; i<N; i++){
			soma = soma + alturas[i];
		}
		double media = soma /N;
		System.out.printf("Altura media: %.2f%n" ,media); 
		int cont = 0;
		for(int i=0; i<N; i++){
			if (idades[i] < 16) {
				cont = cont + 1;
				
		}
		}
		double x =(double)cont * 100.0 / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",x );
  
		sc.close();
    }
}
