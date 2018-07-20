class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a=121;
		int temp=a;
		int [] arr=new int[20];
		int rem,i=0,sum=0;
		while(a!=0){
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if(temp==sum){
			System.out.println("it is a palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}
}
