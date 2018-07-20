class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int [] arr=new int[20];
		arr[0]=1;
		arr[1]=3;
		arr[2]=2;
		int max=arr[0];
		for(int i=1;i<3;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}
}
