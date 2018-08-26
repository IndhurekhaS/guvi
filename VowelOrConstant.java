public class VowelOrConstant {
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter the character:");
		Scanner scan=new Scanner (System.in);
		ch=scan.next().charAt(0);
		scan.close();
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			
		 System.out.println("Vowel:"+ch);
		}
		 else 
		{
			System.out.println("consonant:"+ch);
		}
		
	}

}
