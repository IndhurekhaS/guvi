public class public class Armstrongno {
	public static void main(String[] args) {
		int temp,d=0,a;
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter the numbers");
		int n=scn.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			d=d+(a*a*a);
			
		}
		if(temp==d)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		scn.close();
	}
}
