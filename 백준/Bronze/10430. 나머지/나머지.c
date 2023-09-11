//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

#include<stdio.h>
int main(){
    int A,B,C;
    scanf("%d %d %d",&A,&B,&C);
    printf("%d\n%d\n%d\n%d\n",(A+B)%C,((A%C)+(B%C))%C,(A*B)%C,((A%C)*(B%C))%C);
}