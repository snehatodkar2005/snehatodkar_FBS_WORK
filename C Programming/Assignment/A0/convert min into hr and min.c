void main()
{

	int fmin=4830;
	int hr,min,temp;
	printf("minutes=%d",fmin);
	hr=fmin/3600;
	min=fmin%3600;
    temp=min/60;
	printf("\nafter convert the min into hr and min is %d:%d",hr,temp);
}
