#include<stdio.h>
int main(){
    int w_work,i,a,b;
    scanf("%d",&w_work);
    for(i=0;i<w_work;i++){
        scanf("%d %d",&a,&b);
        printf("%d\n",a+b);
    }
}