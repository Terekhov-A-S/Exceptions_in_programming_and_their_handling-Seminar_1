import static task.task1.divide;
import static task.task1.getValue;
import static task.task1.createArray;
import static task.task3.diffArray;
import static task.task4.divideArray;

public class Main {

    public static void main(String[] args) {

//  задача 1.0:
        divide(15, 0);
//  задача 1.1:
        getValue(new int[20], 35);
//  задача 1.2:
        createArray(-12);

//  задача 3:
        diffArray(new int[15], new int[18]);

//  задача 4.0:
        divideArray(new int[2], new int[4]);
//  задача 4.1:
        divideArray(new int[2], new int[0]);

    }
}