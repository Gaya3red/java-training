public class SelectionSort {
    public static int[] print(int arr[]){
        int n=arr.length;
        int a,k=0;
        for(int i=0;i<n;i++){
            int temp=arr[i];
        for(int j=i+1;j<n;j++){
            if(temp>arr[i]){
                k=j;
                temp=arr[i];
                break;
            }
        }
        System.out.println("temp"+temp);
        System.out.println(k);
        a=arr[i];
        arr[i]=arr[temp];
        arr[temp]=a;
        System.out.println(i);
        
        }

    }
    
}
