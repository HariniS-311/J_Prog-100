
class Sec_largest1
{
public static void main(String[] args){
int[] arr = {12,35,1,10,34,1};
int First= Integer.MINVALUE;
int Second= Integer.MINVALUE;
for(int num : arr)
{
if(num>First)
{
Second=First;
First=num;
}
else if(num>Second && num!=First)
{
Second=num;
}
}
System.out.println(Second);
}
}