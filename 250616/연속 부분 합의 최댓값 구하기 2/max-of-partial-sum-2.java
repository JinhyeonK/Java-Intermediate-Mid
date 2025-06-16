import java.util.*;
import java.io.*;
public class Main {
    public static int INT_MIN = Integer.MIN_VALUE;
    public static final int MAX_N=100000;
    public static int N;
    public static int [] arr=new int[MAX_N+1];
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int ans = INT_MIN;
        int sum=0;
        for(int i=1;i<=N;i++){
            if (sum<0){
                sum=arr[i];
            } else{
                sum+=arr[i];
            }
            ans = Math.max(ans,sum);
        }
        System.out.print(ans);
    }
}