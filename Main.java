import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<String> st = new Stack<>();
            int n = sc.nextInt();
            sc.nextLine();
            String s[] = new String[n];
            for(int i = 0; i < n; i++) {
                s[i] = sc.next().trim();
            }

            for (int i = n-1; i >= 0; i--) {
                if (s[i].equals("+") || s[i].equals("-") 
                || s[i].equals("*") || s[i].equals("/")) {
                    String fi = st.pop();
                    String se = st.pop();
                    long kq;
                    if (s[i].equals("+")) {
                        kq = Long.parseLong(se) + Long.parseLong(fi);
                    } else if (s[i].equals("-")) {
                        kq = Long.parseLong(fi) - Long.parseLong(se);
                    } else if (s[i].equals("*")) {
                        kq = Long.parseLong(se) * Long.parseLong(fi);
                    } else if (s[i].equals("/")) {
                        kq = Long.parseLong(fi) / Long.parseLong(se);
                    } else {
                        kq = 0;
                    }
                    st.push(String.valueOf(kq));
                } else {
                    st.push(s[i]);
                }
            }
            System.out.println(st.peek());
        }
    }
}