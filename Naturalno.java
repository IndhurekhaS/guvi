public class Naturalno {
	public static void main(String[] args) {
		int sum=0;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of natural number is:"+sum);
		scan.close();
	}
	

}
