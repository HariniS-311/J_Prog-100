import java.util.Arrays;
class Sec_largest
{
public static void main(String[] args){
int[] arr = {12,35,1,10,34,1};
Arrays.sort(arr);
int n= arr.length;
int lar=arr[n-2];
System.out.println(lar);
}
}

