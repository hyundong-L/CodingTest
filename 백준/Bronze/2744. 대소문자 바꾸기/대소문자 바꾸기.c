#include<stdio.h>
#include<string.h>

int main(void){
    char input[101];
    scanf("%s",input);
    
    for(int i=0;i<strlen(input);i++) {
        if(input[i]>='a' && input[i]<='z'){
            input[i]-=32;
        }else{
            input[i]+=32;
        }
    }
    printf("%s",input);
}