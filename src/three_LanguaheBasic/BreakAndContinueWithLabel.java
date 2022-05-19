package three_LanguaheBasic;

public class BreakAndContinueWithLabel {
    public static void main(String[] args) {
        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean found = false;
        int max = searchMe.length() - substring.length();
        test:
        for (int i = 0; i <= max; i++) {    // i:�Ӵ����ҿ�ʼλ��
            int n = substring.length();
            int j = i;                // j:��ǰ�������еĲ���λ��
            int k = 0;                // k:��ǰ���Ӵ��еĲ���λ��
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            found = true;
            break test;
        }
        System.out.println(found ? "Found��" : "Didn't find��");
    }
}    //�������ӣ� BreakDemo.java��BreakWithLabelDemo.java
