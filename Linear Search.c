#include<stdio.h>
int main(){
    int A[5]={10,20,30,40,50};
    int key,flag=0;
    printf("Enter the Key element");
    scanf("%d",&key);
    for(i=0;i<5;i++){
        if(key==A[i]){
            flag=1;
            break;
        }
    }
    if(flag==1){
        printf("Key is Found");
    }
    else{
        printf("Key is not found");
    }
}