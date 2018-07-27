public class Guvialphadiff {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String word=in.nextLine();
		String word1=in.nextLine();
        char a=1,b=2,c=3,d=4,e=5,f=6,g=7,h=8,i=9,j=10,k=11,l=12,m=13,n=14,o=15,p=16,q=17,r=18,s=19,t=20,u=21,v=22,w=23,x=24,y=25,z=26;
        char ch[]=word.toCharArray();
        char cs[]=word1.toCharArray();
        int diff=0;
        for(int A=0;A<ch.length;A++){
        	diff+=cs[A]-ch[A];
        }
        System.out.println(diff);
	}
}
