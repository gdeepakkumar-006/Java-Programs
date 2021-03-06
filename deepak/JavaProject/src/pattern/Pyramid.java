package pattern;

 
public class Pyramid {
		static void pyramid() {
 		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
	}

 			static void hallowpyramid() {
	 		int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=i;j<=n;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<i;j++) {
					if(i==n||j==1) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				for(int j=1;j<=i;j++) {
					if(i==n||j==i) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			 
		}

		static void increasingtriangle() {
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		
		static void hallowincreasingtriangle() {
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					if(i==n||j==1||j==i) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		
		
		static void decreasingtriangle() {
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=i;j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		

		static void hallowdecreasingtriangle() {
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=i;j<=n;j++) {
					if(i==1||j==i||j==n) 
					{
					System.out.print("*");
					} 
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		
		
		static void invertedpyramid() {
	 		int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int j=i;j<n;j++) {
					System.out.print("*");
				}
				for(int j=i;j<=n;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			 
		}
		
		
		static void hallowinvertedpyramid() {
	 		int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int j=i;j<n;j++) {
					if(i==1||j==i) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				for(int j=i;j<=n;j++) {
					if(i==1||j==n) {
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			 
		}
		
		
		static void cross()
		{
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i==j||i+j==n+1) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}

		

public static void main(String[] args) {
	System.out.println("====================");
	pyramid();
	
	System.out.println("====================");
	hallowpyramid(); 
	
	System.out.println("====================");
	increasingtriangle();
	
	System.out.println("====================");
	hallowincreasingtriangle();
	
	
	System.out.println("====================");
	decreasingtriangle();
	
	System.out.println("====================");
	hallowdecreasingtriangle();
	
	System.out.println("====================");
	invertedpyramid();
	
	System.out.println("====================");
	hallowinvertedpyramid();
	
	System.out.println("====================");
	cross();
 }
 
	
}


