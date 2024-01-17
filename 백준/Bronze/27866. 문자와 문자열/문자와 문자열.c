#include<stdio.h>

int main(void){
    char str[1001];
    int index=0;
    scanf("%s",str);
    scanf("%d",&index);
    
    printf("%c",str[index-1]);
}