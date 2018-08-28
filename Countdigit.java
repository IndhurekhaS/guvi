public class Countdigit {
	public static void main(String[] args) {
		int i=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		while(n>0)
		{
			n=n/10;
			i=i+1;
		}
		System.out.println(""+i);
		scan.close();
	}

}
