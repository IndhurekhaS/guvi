public class AlphabetOrNot {
	public static void main(String[] args) {
		char ch;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the alphabet:");
		ch=scan.next().charAt(0);
		scan.close();
		if(ch >='a' && ch<= 'z'||ch >='A' && ch <='Z')
		{
			System.out.println("The Alphabet is:"+ch);
		}
		else
		{
			System.out.println("Not a alphabet");
		}
	}

}
