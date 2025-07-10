import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer,Integer> su = new HashMap<>();
        int []arr1= new int[n];
        int []arr2= new int[m];
        int cnt=0;
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            su.put(arr1[i], i + 1);
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
            if (su.containsKey(arr2[i])) {
                System.out.print(su.get(arr2[i]) + " ");
                cnt++;
            } else {
                System.out.print("0 ");
            }
        }

    }
}