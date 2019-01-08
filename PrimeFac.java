import java.util.Scanner;

public class PrimeFac {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter any prime number you want to have prime factorization of:");
		int NUM = keyboard.nextInt();
		new PrimeFac(NUM);
		
		keyboard.close();

	}

	public PrimeFac(int prime) {

		StringBuilder sb = new StringBuilder();
		String number = helper(prime, 2, sb);
		System.out.print(sb.toString() + "= "+ prime);
	}
	
	public String helper(int prime, int fac, StringBuilder sb) 
	{
		if(prime <= 1)
		{
			return "";
		}
		if(prime % fac == 0)
		{
			prime = prime/fac;
			sb.append(fac + " ");
			System.out.println("Prime: " + prime + " Fac: " + fac);
			helper(prime, fac, sb);
		}
		else
		{
			if(prime == fac)
			{
				return "";
			}
			helper(prime, fac+1, sb);
		}
		
		
		/*for(int i = 2; i< prime; i++) {
	         while(prime % i == 0) {
	            System.out.println(i+" ");
	            prime = prime/i;
	         }
	      }
	      if(prime >2) {
	         System.out.println(prime);
	      }
	      */
		return null;
	      
		
	}

}
