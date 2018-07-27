public class Gcd {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the total no of n and q");
		int n=in.nextInt();
		int q=in.nextInt();
		System.out.println("enter the n number of elements");
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("enter the q set of elements");
		int [] a=new int[q];
		int [] b=new int[q];
		int gcd=0;
		for(int i=0;i<q;i++){
			a[i]=in.nextInt();
			b[i]=in.nextInt();
		}
		for(int i=0;i<q;i++){
			for(int j=1;j<=a[i] && j<=b[i];j++){
				if(a[i]%j==0 && b[i]%j==0 ){
				    gcd=j;	
				}
			}
			System.out.println("GCD of "+a[i]+" "+b[i]+" is "+gcd);
			System.out.println();
		}
	}

}
