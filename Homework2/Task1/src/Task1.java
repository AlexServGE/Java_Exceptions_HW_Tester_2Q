import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        Task1 tk = new Task1();
        boolean flag = true;
        while (flag) {
            try {
                tk.userInput();
                flag = false;
            } catch (IOException e) {
                System.out.printf("Программа не смогла обработать входящий поток данных - %s.\n",e);
            } catch (NumberFormatException e) {
                System.out.printf("Просьба ввести число - %s.\n",e);
            }
        }
    }

    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
     * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public void userInput() throws IOException, NumberFormatException {
        InputStreamReader inputSys = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputSys);
        System.out.print("Введите любое число: ");
        float userFloatInput = Float.parseFloat(br.readLine());
        System.out.println(userFloatInput);
    }
}