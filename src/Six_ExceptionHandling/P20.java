package Six_ExceptionHandling;

public class P20 {
    public static void main(String args[]) {
        int i = 0;
        String greetings[] = {"����!", "����!", "����!"};
        while (i < 4) {
            try {
                System.out.println(greetings[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Re-setting Index Value");
                i = -1;
            } finally {
                System.out.println("This is always printed");
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
            i++;
        }
    }

}
