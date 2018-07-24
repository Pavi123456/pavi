public class Guviequalpartition {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
			int n=in.nextInt();
	        int a=in.nextInt();
	        int b=in.nextInt();
	        int c;
	        if(n%2==0){
	        	c=a+b;
	        	if(n%c==0)
	        		System.out.println("yes");
	        }
	        else{
	        	System.out.println("no");
	        }
	}

}
