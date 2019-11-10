import java.util.*;
public class Fun��es {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int res;
		while(true) {
			System.out.println("Digite 1 para FATORAR || Digite 2 para TABUADA || Digite 3 para APOSENTAR || Digite 4 para POTENCIALIZAR || Digite 0 para DESLIGAR");
			res=in.nextInt();
			if(res==0) {
				break;
			}
			if(res==1) {
				int n=0;
				System.out.println("Digite um n�mero a ser fatorado:");
				System.out.println(fat(n));
			}
			if(res==2) {
				int n;
				System.out.println("Digite o n�mero a ser tabuado:");
				n=in.nextInt();
				tab(n);
			}
			if(res==3) {
				int id;
				String sexo;
				System.out.println("Digite sua idade:");
				id=in.nextInt();
				System.out.println("Digite seu g�nero:");
				sexo=in.next();
				System.out.println(apo(id, sexo));
			}
			if(res==4) {
				int base, exp;
				System.out.println("Digite uma base:");  
				base=in.nextInt();    
				System.out.println("Digite seu expoente:");  
				exp=in.nextInt();  
				System.out.println(pot(base, exp));
			}
		}
	}
	
	//FATORIAL
	public static int fat(int v1) {
		Scanner in=new Scanner(System.in);
		int n, i=1, f=1; 
		n=in.nextInt();
		while (i<=n) {
			f=f*i;
			i++;
		}
		return f;
	}
	
	//TABUADA
	public static void tab(int  n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
	
	//APOSENTADORIA
	public static int apo(int v1, String v2) {
		int r=0;
		if(v2.equals("Homem") || v2.equals("homem")) {
			r=60-v1;
		}
		else if(v2.equals("Mulher") || v2.equals("mulher")) {
			r=55-v1;
		}
		return r;
	}
	
	//POT�NCIA
	public static int pot(int v1, int v2) {
		Scanner in=new Scanner(System.in);
		int x, i; 
		i=1;  
		x=v1;
		while (i!=v2) {  
			v1=v1*x;  
			i++;  
		}
		return v1;
	}
}














