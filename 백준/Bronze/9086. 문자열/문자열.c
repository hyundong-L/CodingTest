#include<stdio.h>
#include<string.h>

int main(void){
    int line=0;
    scanf("%d",&line);
    
    char str[1000];
    
    for(int i=0;i<line;i++){
        scanf("%s",str);
        printf("%c%c\n",str[0],str[strlen(str)-1]);
    }
}