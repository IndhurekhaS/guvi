public class LargestNumber {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a>b && a>c )
		{
			System.out.println("The largest number is:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("The largest number is:"+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("The largest number is:"+c);
		}
		else
		{
			System.out.println("");
		}
		scan.close();
		
	}

}
