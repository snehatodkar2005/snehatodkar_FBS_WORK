void main()
{
	int hr,min,sec,totalsec;
	printf("enter the time according Hours minutes and seconds\n");
	scanf("%d%d%d",&hr,&min,&sec);
	totalsec=hr*3600+min*60+sec;
	printf("total seconds=%d",totalsec);
}