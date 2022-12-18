import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {


    public static void main(String[] args) {
        Task3 tk = new Task3();
        boolean flag = true;
        while (flag) {
            try {
                tk.userInput();
                flag = false;
            } catch (IOException e) {
                System.out.printf("Программа не смогла обработать входящий поток данных - %s.\n", e);
            } catch (NullPointerException e) {
                System.out.printf("Просьба ввести не пустую строку - %s.\n", e);
            }
        }
    }

    /**
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

    public void userInput() throws IOException, NullPointerException
    {
        InputStreamReader inputSys = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputSys);
        System.out.print("Введите любое значение, кроме пустой строки: ");
        String userPhrase = br.readLine();
        if (userPhrase.isEmpty()) throw new NullPointerException();
        System.out.println(userPhrase);
    }
}
