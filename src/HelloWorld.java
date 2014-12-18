public class HelloWorld {

	public static void main(String[] args) {
		
		int sum = 0;

		for (int k = 0; k < 10; k++) {
		
			if( k%2 == 0 )
			    System.out.println( k +  ": Good-bye World!");  
			else
				System.out.println( k + ": Good-bye World");
		
			sum = sum + k;		//assignment
		}
		
		System.out.println("The total is " + sum );
	}

}
