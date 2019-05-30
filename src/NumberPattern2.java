
public class NumberPattern2 {

	public static void main(String[] args) {
		int line=10;
		
		for (int i=1; i<=line;i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println("");
		}
		
	}

}
