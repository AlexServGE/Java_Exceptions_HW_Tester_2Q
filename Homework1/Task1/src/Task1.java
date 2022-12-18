import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        Task1 tk = new Task1();
        int[] myArray = new int[]{1, 1, 1, 1, 1};
        try {
            tk.methodWithIndexOutOfBounds(myArray);
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Разработчик придумал первый метод из трех, которые требуются по таску - Ave Geekbrains! - %s \n", e);
        }
        try {
            tk.methodWithArithmeticException();
        } catch (ArithmeticException e) {
            System.out.printf("Никому нельзя делить на 0, а тебе всё можно - %s \n", e);
        }
        try {
            tk.fileRead();
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.printf("Не всё то цифра, что выглядит цифрой в чужом файле - %s \n", e);
        }

    }

    public void methodWithIndexOutOfBounds(int[] someArray) throws IndexOutOfBoundsException {
        System.out.println(someArray[someArray.length]);
    }

    public void methodWithArithmeticException() throws ArithmeticException {
        System.out.println(1 / 0);
    }

    public void fileRead() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
        String buf = "";
        while (reader.ready()) {
            buf = reader.readLine();
            System.out.println(Integer.parseInt(buf));
        }
    }
}