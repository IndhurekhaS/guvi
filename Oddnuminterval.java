public class Oddnuminterval {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the intervals:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
		
		scan.close();
	}

}
