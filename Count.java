class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int b=456;
		int rem,count=0;
		while(b!=0){
			rem=b%10;
			count++;
		
			
			b=b/10;
		}
		System.out.println(count);
	}
}
