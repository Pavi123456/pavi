public class Guviplayers {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=in.nextInt();
		int a=1,b=1;
		if(n%2!=0){
		while(n!=0){
			a*=b;
			n--;
		}
		System.out.println(a);
		}
      else{
    	  System.out.println(0);
	}
	}
