#include <stdio.h>

int main(void){
    int array[9];
    int max=-1; //최댓값 담을 변수
    int maxIndex=-1;    //최댓값 인덱스 담을 변수
    
    for(int i=0;i<9;i++){   //입력
        scanf("%d", &array[i]);
    }
    
    for(int i=0;i<9;i++){
        if(max<array[i]) {
            max=array[i];
            maxIndex=i;
        }
    }
    
    printf("%d\n%d",max,maxIndex+1);
}
