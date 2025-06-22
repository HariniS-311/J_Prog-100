class Missing_num
{
public static void main(String[] args){
int[] arr = { 1,5,6,7,3,8,4};
int n=8;
int h=n*(n+1)/2;
int s=0;
for(int n1 : arr)
{
s=s+n1;
}
int h1=s-h;
int h2=Math.abs(h1);
System.out.println("the missing number is:"+h2);
}
}

