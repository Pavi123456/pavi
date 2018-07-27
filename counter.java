public class Guvicounter {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the n nos");
		int n=in.nextInt();
		int c=2*n;
		int count=0;
		for(int i=0;i<c;i=i+2){
			count++;
		}
      System.out.println("number of moves required :"+count);
	}

}
