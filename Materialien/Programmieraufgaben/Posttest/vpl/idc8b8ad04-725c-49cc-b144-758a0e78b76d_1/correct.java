public class Main {
    
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        

        int n=scan.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        
        System.out.println(adjacentProduct(arr));
    }
    
    public static int adjacentProduct(int[] array) {
        int maxProduct = array[0] * array[1];
        
        for (int i = 1; i < array.length-1;i++) {
          int tempProduct = array[i] * array[i+1];
          if (tempProduct > maxProduct){
            maxProduct = tempProduct;
          }
        }
        return maxProduct;
    }
}