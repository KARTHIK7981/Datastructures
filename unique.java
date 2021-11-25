public class unique{
    public static void main(String args[]){
        int j,i;
        int arr[]={1,2,3,4,5,6,1};
        int n=7;
        for(i=0;i<7;i++){
            int c=0;
            for(j=0;j<7;j++){
                if(arr[i]==arr[j]) c++;
            }
            if(c==1){
                System.out.println(arr[i].length);
            }
        }
    }
}