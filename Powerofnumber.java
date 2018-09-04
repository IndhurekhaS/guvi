public class Powerofnumber {
	public static void main(String args[])
	{
	long result=1,p,n;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number:");
	n= scan.nextLong();
	System.out.println("Enter the power:");
	 p=scan.nextLong();
	if(n>=0&&p==0)
	{
	 result=1;
	}
	else if(n==0&&p>=0)
	{
		result=0;
	}
	else
	{
		for(int i=1;i<=p;i++)
		{
			result=result*n;
		}
		System.out.println("The power of number is:"+result);
	}
	
	scan.close();
	
}
}
	

