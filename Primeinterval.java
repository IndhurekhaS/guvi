public class Primeinterval {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the interval:");
		int a=scan.nextInt();
		int b=scan.nextInt();
	        while (a<b) {
	       	 boolean flag = false;
	            for(int i = 2; i <= a/2; i++) {
	                if(a%i==0) {
	                    flag = true;
	                    break;
	                }
	            }

	            if (!flag)
	                System.out.print(a+" ");
	                a++;
	        }
	        scan.close();
}
}
