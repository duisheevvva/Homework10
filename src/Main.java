public class Main {
    public static void main(String[] args) {
        System.out.println(varargsMethod1(5, 1, 2, 4, 3, 5, 6));
    }

    static boolean varargsMethod1(int a, int... varargs) {
        boolean b = true;
        for (int i : varargs) {
            if (a == i) {
                return b;
            }
        }
        return false;
    }
}