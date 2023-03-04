package Contact.Birthdate;


import Exceptions.Contact.FormatException;

public class BirthdateCreateService {

    public static String checkUserInputBirthdate(String userInput) throws FormatException {
        String msgTotal = "";
        if (!isUserInputDotesPosition(userInput)) {
            msgTotal += "Дата рождения: Допустимый формат dd.mm.yyyy. Отсутствуют точки в требуемых местах.\n";
        }
        if (!isUserInputDigitsDotesOnly(userInput)) {
            msgTotal += "Дата рождения: Допустимый формат dd.mm.yyyy. Должны использоваться только цифры и точки в требуемых местах.\n";
        }
        if (!isUserInputElevenSymbols(userInput)) {
            msgTotal += "Дата рождения: Допустимый формат dd.mm.yyyy. Допустимый размер данных 1 символов - 8 цифр и 2 точки.\n";
        }
        if (!msgTotal.isEmpty()){
            throw new FormatException(msgTotal);
        } else {
            return userInput;
        }
    }
    public static boolean isUserInputDotesPosition(String userInput) {
        return userInput.matches("[А-ЯЁа-яё0-9]{2}\\.[А-ЯЁа-яё0-9]{2}\\.[А-ЯЁа-яё0-9]{4}");
    }

    public static boolean isUserInputDigitsDotesOnly(String userInput) {
        return userInput.matches("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}");
    }

    public static boolean isUserInputElevenSymbols(String userInput) {
        return userInput.matches(".{10}");
    }


}
