#include<stdio.h>
int main(){
    int N,quan=0;
    scanf("%d",&N);
    int arr[N];
    for(int i=0;i<N;i++) scanf("%d",&arr[i]);
    int V;
    scanf("%d",&V);
    
    for(int i=0;i<N;i++){
        if(arr[i]==V) quan++;
    }
    printf("%d",quan);
}