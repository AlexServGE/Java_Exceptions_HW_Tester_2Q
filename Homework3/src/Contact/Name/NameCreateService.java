package Contact.Name;

import Exceptions.Contact.FormatException;

public class NameCreateService {

        public static String checkUserInputName(String userInput) throws FormatException {
            String msgTotal = "";
            if (!isUserInputCapitalLetter(userInput)) {
                msgTotal += "Имя: Отсутствует заглавная буква.\n";
            }
            if (!isUserInputLettersOnly(userInput)) {
                msgTotal += "Имя: Допустимыми символами являются только буквы.\n";
            }
            if (!isUserInputTenLetters(userInput)) {
                msgTotal += "Имя: Допустимый размер данных равен не менее 2 символов и не более 10 символам.\n";
            }
            if (!msgTotal.isEmpty()){
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
            return userInput.matches(".{2,10}");
        }
}
