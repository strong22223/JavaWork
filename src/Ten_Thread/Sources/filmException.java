package Ten_Thread.Sources;

public class filmException extends Throwable {

    public filmException(String reason) {
        super(reason);
    }

    public static void fun() throws filmException {
        throw new filmException("ciowuoeuawoe");
    }

    public static void main(String[] args) {
        try {
            filmException.fun();

        } catch (filmException e) {
            System.err.println(e.getCause());
        }
    }
}
