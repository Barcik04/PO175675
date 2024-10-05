public class Main {
    public static void main(String[] args) {
        int[] primalArray = {1, 2, 3, 4, 5, 6, 7};
        int[] result = copyPrimalArr(primalArray);

        for (int j : result) {
            System.out.println(j);
        }
    }

    public static int[] copyPrimalArr(int[] array) {
        int size = array.length;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[size - i - 1];
        }

        return newArray;
    }
}
