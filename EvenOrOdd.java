public class EvenOrOdd {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number:");
		Scanner scan=new Scanner (System.in);
		num=scan.nextInt();
		scan.close();
		if(num<0)
		{
			System.out.println("Invalid input:"+num);
		}
		else if(num%2==0)
		{
			System.out.println("even:"+num);
		}
		else if(num%2!=0)
		{
			System.out.println("odd:"+num);
		}
		
		else
		{
			System.out.println("");
		}
	}

}
