public class A {
	public static void main(String[]args) {
		int m[][]=new int[4][4];
		int i=0, j=0, aux=2;
		for(i=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				m[i][j]=aux;
				aux=aux*2;
			}
		}
		for(i=0; i<=3; i++) {
			for(j=0; j<=3; j++) {
				System.out.print("[ "+m[i][j]+" ]");
				if(j==3) {
					System.out.print("\n");
				}
			}
		}
	}
}