#include<stdio.h>
int main(){
    int num[5],check_num=0;
    for(int i=0;i<5;i++) {
        scanf("%d",&num[i]);
        check_num+=num[i]*num[i];
    }
    printf("%d",check_num%10);
}