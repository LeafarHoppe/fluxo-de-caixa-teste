
import java.util.Scanner;

public class Main {
	
	public void linhas(){
		for(int i = 0; i < 100 * 30; i++){
			System.out.println();
		}
	}
	
	double[] valor = new double[2];
	String[] quen = new String[2];
	int vendas = 0;
	
	double venda;
	
	Scanner scan;
	Scanner scan2;
	Scanner menP;
	int quentinha1 = 0;
	int quentinha2 = 0;
	
	public void Quantidade(int quant){
		
	}
	
	public void MenuPrincipal(){
		linhas();
		menP = new Scanner(System.in);
		System.out.println("Bem-vindo ao programa de caixa!");
		System.out.println("O que deseja fazer?");
		System.out.println("V- processo de vendas");
		System.out.println("M- ver manual");
		System.out.println("Q- sair");
		
		String menuP = menP.next();
		
		if(menuP.equals("v") || menuP.equals("V")){
			Menu();
		}
		if(menuP.equals("m") || menuP.equals("M")){
			manual();
		}
		if(menuP.equals("q") || menuP.equals("Q")){
			System.exit(0);
		}
	}
	
	public void Menu(){
		scan = new Scanner(System.in);
		System.out.println("\n============================");
		System.out.println("Lista de coisas para vender:");
		Quentinha();
		Quentinha2();
		System.out.println(quen[0] + " valor: R$" + valor[0]);
		System.out.println(quen[1] + " valor: R$" + valor[1]);
		System.out.println();
		System.out.println("número de vendas: "+ vendas);
		System.out.println("O que você vendeu? ");
		System.out.println("1- " + quen[0]);
		System.out.println("2- " + quen[1]);
		System.out.println("3- ver o caixa");
		System.out.println("4- sair");
		int valorAloc = scan.nextInt();
		
		if(valorAloc == 1){
			System.out.print("\nquantidade: ");
			int w = scan.nextInt();
			
			venda += valor[0] * w;
			vendas += w;
			quentinha1 += w;
			
			linhas();
			Menu();
		}
		if(valorAloc == 2){
			System.out.print("\nquantidade: ");
			int w = scan.nextInt();
			
			venda += valor[1] * w;
			vendas+= w;
			quentinha2+= w;
			
			linhas();
			Menu();
		}
		if(valorAloc == 3){
			linhas();
			scan2 = new Scanner(System.in);
			System.out.println("=============================================");
			System.out.println("vendas de " + quen[0] + " = " + quentinha1 + "(R$" + (valor[0] * quentinha1)+")");
			System.out.println("vendas de " + quen[1] + " = " + quentinha2 + "(R$" + (valor[1] * quentinha2)+")");
			
			System.out.println("arrecadado no total: R$" + venda);
			System.out.println("\nDeseja voltar pro Menu?");
			
			System.out.println("1 - Sim");
			System.out.println("2 - Sair");
			int gotoMenu = scan2.nextInt();
			if(gotoMenu == 1){
				linhas();
				Menu();
			}
			if(gotoMenu == 2){
				System.exit(0);
			}
		}
		if(valorAloc == 4){
			System.exit(0);
		}
		
	}
	
	public void Quentinha(){
		quen[0] = "Quentinha normal";
		valor[0] = 12.00;
	}
	
	public void Quentinha2(){
		quen[1] = "Quentinha maior";
		valor[1] = 15.00;
	}
	
	public void manual(){
		Scanner manu = new Scanner(System.in);
		linhas();
		System.out.println("---MANUAL---");
		System.out.println("Digite Q para sair do programa através do Menu principal");
		System.out.println("Digite V para ver as informações da venda através do Menu principal");
		System.out.println("\nDigite M para ir ao Menu principal agora");
		String manual = manu.next();
		if(manual.equals("m") || manual.equals("M")){
			MenuPrincipal();
		}
		if(manual.equals("q") || manual.equals("Q")){
			System.exit(0);
		}
		
	}
	
	public Main(){
		MenuPrincipal();
	}

    public static void main(String[] args) {
        new Main();
    }
}