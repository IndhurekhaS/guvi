public class Multipleoffive {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
		}
		
		scan.close();
	}

}
