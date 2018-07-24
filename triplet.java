public class Guvitriplet {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the total no");
		int n=in.nextInt();
        System.out.println("enter the numbers");
        int [] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
        	arr[i]=in.nextInt();
        }
        for(int i=0;i<n-2;i++){
        	for(int j=i+1;j<n-1;j++){
        		if(arr[i]>arr[j]){
        			continue;
        		}
        		for(int k=j+1;k<n;k++){
        			if(arr[i]<arr[j] && arr[j]<arr[k]){
        				count++;
        			}
        		}
        	}
        }
        		System.out.println(count);

	}

}
