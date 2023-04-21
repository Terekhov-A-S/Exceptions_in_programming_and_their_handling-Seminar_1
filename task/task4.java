package task;

public class task4 {
    public static int[] divideArray(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0)
                throw new RuntimeException("Деление на нуль не допустимо!");
            result[i] = a[i] / b[i];
        }
        return result;
    }
}
