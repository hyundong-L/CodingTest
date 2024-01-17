#include<stdio.h>
#include<stdlib.h>

int main(){
    long long N=0,M=0;
    scanf("%lld %lld",&N,&M);
    printf("%lld",llabs(N-M));
    
    return 0;
}