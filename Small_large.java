import java.util.Arrays;

class Small_large {
public static void main(String[] args) {
int[] arr = {1, 3, 5, 2, 8, 7, 4};
Arrays.sort(arr); 
int[] result = new int[arr.length];
int start = 0;
int end = arr.length - 1;
int i = 0;
while (start <= end) {
if (i % 2 == 0) {
result[i++] = arr[start++]; 
} 
else 
{
result[i++] = arr[end--];
}
}
for (int j = 0; j < result.length; j++) {
System.out.print(result[j]);
}
}
}

