package pattern;

public class Pluspattern {

	public static void main(String[] args) {
		int i=4 , j=4;
		
		for(i=0;i<=4;i++) {
			for(j=0;j<=4;j++) {
				if(j==4||i==2) {
					System.out.print("* ");}
				 
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

	}
