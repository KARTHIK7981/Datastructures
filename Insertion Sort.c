#include<stdio.h>
int main(){
    int a[10],n,i,j,temp;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=1;i<n-1;i++){
        temp=a[i];
        for(j=i;j>0 && temp[j-1];j--){
            a[j]=a[j-1];
        }
        a[j]=temp;
    }
    for(i=0;i<n;i++){
        printf("%d\t",a[i]);
    }