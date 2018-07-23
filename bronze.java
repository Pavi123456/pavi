public class Guvirepeatedword {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the total words");
		int l=in.nextInt();
		System.out.println("enter the words");
		String []st=new String[l];
		int len,j=0;
		int arr[]=new int[20];
	    for(int i=0;i<l;i++){
	    	st[i]=in.next();
	    }
	    for(int i=0;i<l;i++){
	     len=st[i].length();
	     arr[j]=len;
	     j++;
	    }
	    int min=arr[0];
	    for(int i=0;i<j;i++){
	    	if(arr[i]<min){
	    		min=arr[i];
	    	}
	    }
	    String p="";
	    for(int i=0;i<l-1;i++){
	    	p="";
	    	char ch[]=st[i].toCharArray();
             char cs[]=st[i+1].toCharArray();
             for(int k=0;k<min;k++){
          
            		 if(ch[k]==cs[k])
            		   p+=ch[k];  
            		 else
            			 break;
          		   }
             min=p.length();
             }    
	    System.out.println(p);
	}

}
