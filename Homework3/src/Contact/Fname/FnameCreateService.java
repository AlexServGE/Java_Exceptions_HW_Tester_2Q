package Contact.Fname;

import Exceptions.Contact.FormatException;


public class FnameCreateService {


    public static String checkUserInputFname(String userInput) throws FormatException {
        String msgTotal = "";
        if (!isUserInputCapitalLetter(userInput)) {
            msgTotal += "Отчество: Отсутствует заглавная буква.\n";
        }
        if (!isUserInputLettersOnly(userInput)) {
            msgTotal += "Отчество: Допустимыми символами являются только буквы.\n";
        }
        if (!isUserInputTenLetters(userInput)) {
            msgTotal += "Отчество: Допустимый размер данных равен не менее 2 символов и не более 20 символам.\n";
        }
        if (!msgTotal.isEmpty()) {
            throw new FormatException(msgTotal);
        } else {
            return userInput;
        }
    }

    public static boolean isUserInputCapitalLetter(String userInput) {
        return userInput.matches("[А-ЯЁ].+");
    }

    public static boolean isUserInputLettersOnly(String userInput) {
        return userInput.matches("[А-ЯЁа-яё]+");
    }

    public static boolean isUserInputTenLetters(String userInput) {
        return userInput.matches(".{2,20}");
    }
}
