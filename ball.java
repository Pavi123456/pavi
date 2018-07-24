public class Guviballbaloon {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first word");
		String a=in.nextLine();
		System.out.println("enter the second word");
		String b=in.nextLine();
		int len,len1,min,count=0,count1;
		len=a.length();
		len1=b.length();
		if(len<len1){
			min=len;
		}
		else{
			min=len1;
		}
		char ch[]=a.toCharArray();
		char cs[]=b.toCharArray();
        for(int i=0;i<min;i++){
        	if(ch[i]==cs[i])
        		count++; 	
        }
        if(len<len1){
         count1=len1-count;
        }
        else{
        	count1=len-count;
        }
        System.out.println("insertion and deletion :"+count1);
	}
}
