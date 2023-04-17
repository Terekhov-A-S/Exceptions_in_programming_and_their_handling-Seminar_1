import java.io.File;

public class Main {

    /**
     * Функция для возврата размера файла
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(getFileSize(new File
                ("D:/Projects/exceptionsProject/Task1")));
        System.out.println(division(10, 0));
        a1();
    }

    // Функция деления на ноль с обработчиком ошибки
    public static int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Делить на ноль нельзя");
        }
        return a / b;
    }

    // long - размер файла, в функцию передаём объект файл (File TesFile)
    public static long getFileSize(File TestFile) {
        // Обработчик ошибки, если файл не существует
        if (!TestFile.exists()) {
            return -1L;
        }
        return TestFile.length();
    }


    public static void a1() {
        a2();
    }

    public static void a2() {
        a3();
    }

    public static void a3() {
        // Для просмотра ошибки массив размером 100, а запрос на 1000
        int[] ints = new int[100];
        System.out.println(ints[1000]);
    }
}