public class linearsearch {
        public static void main(String[] args){
            //TODO auto-generated Method stub
            int arr[]={1,8,2,10,15,5};
            int search=0;
            int temp=0;
            System.out.println(arr.length);
            for(int i=0;i<arr;i++)
            {
                if(arr[i]==search)
                {
                    temp=-1;
                    System.out.println("Find "=arr[i]);
                }
            }
            if(temp!=-1)
            System.out.println("Did not find the value: "+search);
        }
    }
