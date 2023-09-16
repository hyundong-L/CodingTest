#include<stdio.h>
int main(){
    int N,result=1;
    scanf("%d",&N);
    if(N!=0){
        for(int i=2;i<=N;i++){
            result*=i;
        }
        printf("%d",result);
    } else{
        printf("1");
    }
    
}