package Calculator;

public class Main {
    static String arabic = "012345678910"; //арабские цифры
    static String roman = "IIIIVIIIX";  // римские цифры
    static String znaki = "+-*/";  //знаки действий

    public static String calc(String input) throws AllExceptions{

        String firstNumber = ""; //первоначальное значение первого числа в текстовом формате
        String secondNumber = "";  //первоначальное значение второго числа в текстовом формате
        byte flag = 0;  //первоначальное значение флага, что первое число сформировано и получен знак
        String znak = "";  //первоначальное значение знака действия
        for (int i = 0, n = input.length(); i < n; i++) {  //перебираем элементы введенной строки
            char c = input.charAt(i);//возвращает значение по индексу
            if (arabic.contains("" + c) == true && flag == 0 || roman.contains("" + c) == true && flag == 0) {  // формирование первого числа
                firstNumber = firstNumber + "" + c;
            } else if (("" + c).equals(" ")) continue;
            else if (znaki.contains("" + c) == true && flag == 0) {
                znak = "" + c;
                flag += 1;
            } else if (arabic.contains("" + c) == true && flag == 1 || roman.contains("" + c) == true && flag == 1) { // формирование второго числа
                secondNumber = secondNumber + "" + c;
            } else {
                return "throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";


            }
        }

        if (firstNumber.equals("") || secondNumber.equals("") ) {
            throw new AllExceptions("throws Exception //т.к. строка не является математической операцией");
        }

        if (arabic.contains(firstNumber) && roman.contains(secondNumber) && flag == 1  || roman.contains(firstNumber) && arabic.contains(secondNumber) && flag == 1 ) {
            throw new AllExceptions("throws Exception //т.к. используются одновременно разные системы счисления");
        }

        if (arabic.contains(firstNumber) && arabic.contains(secondNumber) && flag == 1 ) {
            Arabic arabic1 = new Arabic(firstNumber, znak, secondNumber);
            arabic1.konechnii_itog();
            if (Arabic.d == 0) {
                return "throws exception, число должно быть от 1 до 10";
            } else {
                return "" + arabic1.itog();
            }

        } else if (roman.contains(firstNumber) && roman.contains(secondNumber) && flag == 1) {
            Roman roman1 = new Roman(firstNumber, znak, secondNumber);
            roman1.predrewenie();
            if (Roman.z == 0) {
                return "5throws exception, число должно быть от 1 до 10";
            } else {
                int f = roman1.rewenie();
                if (f >= 1) {
                    return roman1.preobrazovanie2(f);
                } else {
                    return "throws Exception //т.к. в римской системе нет отрицательных чисел";

                }
            }

        }
        return "7throws exception, число дожно быть от 1 до 10";


    }

}
