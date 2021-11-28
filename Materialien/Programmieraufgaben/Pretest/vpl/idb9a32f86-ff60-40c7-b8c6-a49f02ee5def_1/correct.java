class Main {
    public static void main(String [] args){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int n=scan.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.println(findIt(arr));
    }
    
    public static int findIt(int[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
        	count = 0;
        	for(int j = 0; j < a.length; j++) {
        		if(a[i] == a[j]) {
        			count++;
        		}
            }
        	if(count%2 != 0)
        		break;
        }
        return count;
    }
}