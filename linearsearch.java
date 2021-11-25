public class linearsearch{
    public static intlinearsearch(int [] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int a1[]={1,2,3,4,5,6};
        int key=5;
        System.out.println(key+"is found at index"+linearsearch(a1,key));
    }
}
