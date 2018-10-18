public class Main {

    public static void main(String[] args) {
        int[] p = new int[100000];
        for (int i = 0; i < p.length; i++) {
            p[i] = (int) (Math.random() * 2);
        }
        Stopwatch one = new Stopwatch();
        doSelectionSort(p);
        one.end();
        System.out.println(one.elapsedTime());
    }
    public static int[] doSelectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
