public class Armstrongintervals {
	public static void main(String[] args) {
		int d;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the interval:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		for(int i=a;i<=b;i++)
		  {
			  int  sum=0;
			   int num=i;
		        while(num>0)
		        {
		            d=num % 10;
		            num=num/10;
		            sum=sum+d*d*d;
		        }

		        if(sum == i)
		        {
		           System.out.println(i);
		        }
		        scan.close();
		  }
	
		}
	}
