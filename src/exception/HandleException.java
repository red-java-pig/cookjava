package exception;

/**
 * 最终返回值是finally里面的返回值
 */
public class HandleException {
    public static void main(String[] args) {
        HandleException he = new HandleException();
        System.out.println(he.method());
    }

    public int method() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
