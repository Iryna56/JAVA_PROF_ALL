package algorithms.cw2;

public class Ex1 {
    //Path(n,m) = Path(n-1,m) + Path(m,n-1)
    public static int path(int n, int m) {
        if(n < 1 || m < 1) {
            return 0;
        }
        if(n == 1 && m == 1) {
            return 1;
        }
        return path(n-1, m) + path(n, m-1);
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("Ways: " + path(18, 18));
        System.out.println("Time: " + (System.currentTimeMillis() - time));
    }

}
