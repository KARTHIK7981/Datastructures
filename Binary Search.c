#include<stdio.h>
int main(){
    int A[5]={10,20,30,40,50};
    int low=0,high=4,i,flag=0,key,mid;
        printf("Enter the Key element: ");
        scanf("%d",&key);
    while(low<high){
        mid=(low+high)/2;
        if(key==A[mid]){
            flag=1;
            break;
        }
        else if(key<A[mid]){
                high=mid-1;
                flag=1;}
        else{
            low=mid+1;
            flag=1;
        }
    }
        if(flag==1)
            printf("Key found");
        else
            printf("Key Not found");
        }