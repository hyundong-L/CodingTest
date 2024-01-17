#include<stdio.h>

int main(void){
    int line_a,line_b;
    scanf("%d %d",&line_a,&line_b);
    
    int a[line_a][line_b];
    int b[line_a][line_b];
    
    for(int i=0;i<line_a;i++){
        for(int j=0;j<line_b;j++){
            scanf("%d",&a[i][j]);
        }
    }
    for(int i=0;i<line_a;i++){
        for(int j=0;j<line_b;j++){
            scanf("%d",&b[i][j]);
        }
    }
    for(int i=0;i<line_a;i++){
        for(int j=0;j<line_b;j++){
            printf("%d ",a[i][j]+b[i][j]);
        }
        printf("\n");
    }
}