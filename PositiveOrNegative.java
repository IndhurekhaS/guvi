public class PositiveOrNegative {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number:");
		Scanner scan=new Scanner (System.in);
		num=scan.nextInt();
		scan.close();
		if(num>0)
		{
			System.out.println("The number is positive:"+num);
		}
		else if(num<0)
		{
			System.out.println("The number is negative:"+num);
		}
		else {
			System.out.println("The number is zero:"+num);
		}
		
	}
}
