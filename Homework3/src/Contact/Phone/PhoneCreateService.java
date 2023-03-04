package Contact.Phone;

import Exceptions.Contact.FormatException;

public class PhoneCreateService {

    public static String checkUserInputPhone(String userInput) throws FormatException {
        String msgTotal = "";
        if (!isUserInputDigitsOnly(userInput)) {
            msgTotal += "Телефон: Допустимыми символами являются только цифры.\n";
        }
        if (!isUserInputElevenLetters(userInput)) {
            msgTotal += "Телефон: Допустимый размер данных равен 11 символам.\n";
        }
        if (!msgTotal.isEmpty()) {
            throw new FormatException(msgTotal);
        } else {
            return userInput;
        }
    }

    public static boolean isUserInputDigitsOnly(String userInput) {
        return userInput.matches("[0-9]+");
    }

    public static boolean isUserInputElevenLetters(String userInput) {
        return userInput.matches(".{11}");
    }
}
