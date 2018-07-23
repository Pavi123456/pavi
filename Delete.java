public class Guvideleteno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the nos to be deleted");
		int a=in.nextInt();
		System.out.println("enter the number");
		long b=in.nextLong();
		String c=Long.toString(b);
		char ch[]=c.toCharArray();
		for(int i=a;i<ch.length;i++){
			System.out.print(ch[i]);
		}

	}

}
