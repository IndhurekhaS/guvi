public class Primenumber {
	public static void main(String[] args) {
		boolean flag=false;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
			
			
		}
		if(n>=0&&n<3)
		{
			System.out.println("Neither prime nor composite");
		}
		else if(!flag)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
		scan.close();
	}

}
