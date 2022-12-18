import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        Task tk = new Task();
        int[] arrayOne = new int[]{1, 1, 1, 1};
        int[] arrayTwo = new int[]{1, 1, 1, 1, 1};
        try{
            System.out.println(Arrays.toString(tk.arraysDifference(arrayOne,arrayTwo)));
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    public int[] arraysDifference(int[] someArrayOne, int[] someArrayTwo) throws MyException {
        if (someArrayOne.length != someArrayTwo.length) {
            throw new MyException("Длины массивов не совпадают", new RuntimeException());
        }
        int[] resultArray = new int[someArrayOne.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = someArrayOne[i] - someArrayTwo[i];
        }
        return resultArray;
    }
}