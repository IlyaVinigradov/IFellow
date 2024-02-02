public class Task1 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}