import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task0 {
    public static void main(String[] args) {
        Task0 tk = new Task0();
        List<Integer> taskArray0 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        tk.checkArray(taskArray0);
        List<Integer> taskArray1 = new ArrayList<>(Arrays.asList(1, 2, 3, null));
        tk.checkArray(taskArray1);
        List<Integer> taskArray2 = new ArrayList<>(Arrays.asList(1, 2, null, null));
        tk.checkArray(taskArray2);

    }

    public void checkArray(List<Integer> someArr) {
        boolean flag = true;
        for (int i = 0; i < someArr.size(); i++) {
            if (someArr.get(i) == null) {
                flag = false;
                System.out.printf("Элемент массива под индексом %d содержит null.\n", i);
            }
        }
        if (flag) {
            System.out.println(">>В массиве отстуствуют элементы, содержащие null.<<");
        }
        System.out.println(">>Проверка массива завершена.<<\n");
    }
}