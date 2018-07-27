public class GuviXor {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value of n and q");
		int n=in.nextInt();
		int q=in.nextInt();
		int [] arr=new int[50];
		for(int i=1;i<=n;i++){
			arr[i]=in.nextInt();
		}
		int [] a=new int[10];
		int [] b=new int[10];
		for(int i=1;i<=q;i++){
			a[i]=in.nextInt();
			b[i]=in.nextInt();
		}
		for(int k=1;k<=q;k++){
			int s=0;
		for(int i=a[k];i<=b[k];i++){
		    s=s^arr[i];
		}
		System.out.println(s);
	}
	}
}
