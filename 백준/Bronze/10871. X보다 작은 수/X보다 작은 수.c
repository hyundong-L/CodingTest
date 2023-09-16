#include<stdio.h>
int main(){
    int N,X,list,i;
    scanf("%d %d",&N,&X);
    for(i=0;i<N;i++){
        scanf("%d",&list);
        if(X>list) printf("%d ",list);
    }
}