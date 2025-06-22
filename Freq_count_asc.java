import java.util.*;

class Freq_count_asc {
public static void main(String[] args) {
int[] arr = {50, 20, 10, 30, 10, 20, 10, 50};
int n = arr.length;
boolean[] visited = new boolean[n];
List<int[]> freq = new ArrayList<>();
for (int i = 0; i < n; i++) {
if (visited[i]) continue;
int count = 1;
for (int j = i + 1; j < n; j++) {
if (arr[i] == arr[j]) {
visited[j] = true;
count++;
}
}
visited[i] = true;
freq.add(new int[]{arr[i], count});
}
freq.sort((a, b) -> a[1] - b[1]);
for (int[] pair : freq) {
System.out.println(pair[0] + " : " + pair[1]);
}
}
}
