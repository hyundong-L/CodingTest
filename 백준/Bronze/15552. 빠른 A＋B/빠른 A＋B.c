#include<stdio.h>

int main(){
    int cnt;
	scanf("%d", &cnt);
	for (int i = 0; i < cnt; i++) {
		int a, b;
		scanf("%d %d", &a, &b);
		printf("%d\n", a + b);
	}return 0;
}