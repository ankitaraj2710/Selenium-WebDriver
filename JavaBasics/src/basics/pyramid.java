package basics;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int k=3;
		for(int i=3;i<=5;i++) {
			
			for(int j=3;j<=i;j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
				
			}
			System.out.println("");
		}
	}

}
