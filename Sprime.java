import java.util.Scanner;

public class Sprime {
    // Your code here
    public static void main(String[] args) {
        boolean arr[] = new boolean[10000001];
        for(int i=2; i<10000001; i++)
        {
            arr[i]=true;
        }
        for(int i=2;i*i<10000001;i++)
        {
            if(arr[i])
            {
                for(int j=i*i;j<10000001;j+=i)
                {
                    arr[j] = false;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
                          while(t-->0)
        {
            int n = sc.nextInt();
            int count =0;
            for(int i=n;i>n/2;i--)
            {
                if(arr[i])
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
