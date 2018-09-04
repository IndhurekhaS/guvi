public class Palindrom {
	public static void main(String args[])
	{
		int number,remainder,reverse=0;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		number=n;
		while(n>0)
		{
			remainder=n%10; 
			reverse = reverse * 10 + remainder;
			n=n/10;
		}
		if(number==reverse)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		scan.close();
		
	}

}
