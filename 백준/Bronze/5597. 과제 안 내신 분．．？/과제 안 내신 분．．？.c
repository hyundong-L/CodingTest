#include<stdio.h>
int main(){
    int a,stu_list[31]={0};
    for(int i=1;i<29;i++){
        scanf("%d",&a);
        stu_list[a]=a;
    }
    for(int i=1;i<31;i++){
        if(stu_list[i]==0) printf("%d\n",i);
    }
}