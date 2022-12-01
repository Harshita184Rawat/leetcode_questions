bool halvesAreAlike(char * s){
    int i;
    int n=strlen(s);
    int a=0,b=0;

    for(i=0;i<n/2;i++)
    {
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
            a++;
    }
    for(i=n/2;i<n;i++)
    {
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
            b++;
    }
    if(a==b)
        return 1;
    else 
        return 0;
    

}