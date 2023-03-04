package Contact.Sex;

import Exceptions.Contact.FormatException;

public class SexCreateService {

    public static String checkUserInputSex(String userInput) throws FormatException {
        String msgTotal = "";
        if (!isUserInputfmOnly(userInput)) {
            msgTotal += "Пол: Допустимыми символами являются только f или m.\n";
        }
        if (!isUserInputOneLetter(userInput)) {
            msgTotal += "Пол: Допустимый размер данных равен не более 1 символа.\n";
        }
        if (!msgTotal.isEmpty()){
            throw new FormatException(msgTotal);
        } else {
            return userInput;
        }
    }

    public static boolean isUserInputfmOnly (String userInput) {
        return userInput.matches("[fm]");
    }
    public static boolean isUserInputOneLetter(String userInput) {
        return userInput.matches(".");
    }

}
