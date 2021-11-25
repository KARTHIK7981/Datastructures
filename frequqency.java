package 
public class Frequency {  
    public static void main(String[] args) { 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=in.nextInt();
        int a[] = new int[size];
        int fre[] = new int[size];
        int i,j,count;
        System.out.println("Enter elements in array");
        for(i=0;i<size;i++){
            a[i]=in.nextInt();
            freq[i]=-1;
        }
        for(i=0;i<size;i++){
            count=1;
            for(j=i+1;j<size;j++){
                if(a[i]==a[j]){
                    count++;
                    freq[j]=0;
                }
            }
            if(freq[i]!=0){
                freq[j]=0;
            }
            System.out.println("Frequency of elements:");
            System.out.println("Element  -  Frequency");
            for(i=0;i<size;i++){
                if(freq[i]!=0){
                    System.out.println(a[i]+"  "+freq[i]);
                    System.out.println();
                }
            }
        }
        }