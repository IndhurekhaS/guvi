public class Factorialno {
	public static void main(String[] args) {
		int fact=1;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial number is:"+fact);
		scan.close();
	}

}
