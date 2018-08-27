public class LeapyrOrNot {
	public static void main(String[] args) {
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year:");
		year=scan.nextInt();
		if(year%4==0 && year%100!=0)
		{
			System.out.println("Leap year");
		}
		else if(year%100==0 && year%400==0)
		{
			System.out.println(" Leap year");
		}
	    else if(year%400==0)
	   {
		System.out.println("Leap year");
	   }
	   else
	   {
		System.out.println("not a leap year");
	   }
		scan.close();
}
}

