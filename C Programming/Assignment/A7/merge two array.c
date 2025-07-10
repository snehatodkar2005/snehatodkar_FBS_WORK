#include <stdio.h>

void main() {
    int a[100], b[100], c[200];
    int n1, n2, i, j;

    // Input first array
    printf("Enter size of first array: ");
    scanf("%d", &n1);
    printf("Enter %d elements of first array:\n", n1);
    for(i = 0; i < n1; i++) {
        scanf("%d", &a[i]);
    }

    // Input second array
    printf("Enter size of second array: ");
    scanf("%d", &n2);
    printf("Enter %d elements of second array:\n", n2);
    for(i = 0; i < n2; i++) {
        scanf("%d", &b[i]);
    }

    // Merge arrays
    for(i = 0; i < n1; i++) {
        c[i] = a[i];
    }
    for(j = 0; j < n2; j++) {
        c[i + j] = b[j];
    }

    // Print merged array
    printf("Merged array:\n");
    for(i = 0; i < n1 + n2; i++) {
        printf("%d ", c[i]);
    }	
	
}