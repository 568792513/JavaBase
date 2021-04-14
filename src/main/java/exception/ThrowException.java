package exception;

/**
 * @Author zh
 * @Date 2021/1/26 9:31
 * description :
 */
public class ThrowException {
    public static void main(String[] args) throws Exception {
        // process2();
        String a = null;
        assert a != null;
    }

    public static void process1(String s) {
        if (s == null)
            throw new NullPointerException();
    }

    public static void process2() throws Exception {
        Exception origin = null;
        try {
            process1(null);
        } catch (NullPointerException e) {
            origin = e;
            throw new IllegalArgumentException(e);
        } finally {
            System.out.println("finally");
            Exception e = new IllegalAccessException();
            if (origin != null) {
                e.addSuppressed(origin);
            }
            throw e;
        }
    }
}
