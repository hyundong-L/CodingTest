#include<stdio.h>

int main(void){
    int star=0;
    scanf("%d",&star);
    
    if(star>=620 && star<=780) printf("Red");
    else if(star>=590 && star<620) printf("Orange");
    else if(star>=570 && star<590) printf("Yellow");
    else if(star>=495 && star<570) printf("Green");
    else if(star>=450 && star<495) printf("Blue");
    else if(star>=425 && star<450) printf("Indigo");
    else if(star>=380 && star<425) printf("Violet");
}