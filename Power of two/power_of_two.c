bool isPowerOfTwo(int n){

if(n==1)
return 1;
int k;
n=k;
if(n==0)
return 0;

while(k/2!=0)
{
    k=k/2;
    if(n%2!=0)
    return 0;
}  
if(k==1)
{return 1;} 
else 
return 0;
}
