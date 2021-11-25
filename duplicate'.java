public class DuplicateElement{
    public static void main(String args[]){
        int j,i;
        int arr[]={1,2,3,4,5,6,1};
        for(int i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}