class Freq_count{
public static void main(String[] args){

int[] arr={50,20,10,30,10,20,10,50};
int n=arr.length;
boolean verified[]=new boolean[n];
for(int i=0;i<n;i++)
{
if(verified[i])
continue;
int count=1;
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
verified[j]=true;
count++;
}
}
verified[i] = true;
System.out.println(arr[i] + " : " + count);
}
}
}






