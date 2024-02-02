public class Task2 {

    public static void main(String[] args) {
        String str = "Hello";
        char[] strArr = str.toLowerCase().toCharArray();
        int count = 0;

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[i] == strArr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(strArr[i]);
            }
            count = 0;
        }
    }
}