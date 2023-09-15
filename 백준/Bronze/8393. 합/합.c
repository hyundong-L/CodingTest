#include<stdio.h>
int main(){
    int a,i,result=0;
    scanf("%d",&a);
    for(i=1;i<=a;i++){
        result+=i;
    }
    printf("%d",result);
}