package Calculator;

import java.util.Scanner;

public  class Vxod {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);//для получения ввода с консоли в классе System определен объект in. Класс Scanner использует System.in
        System.out.print("vvedite primer:");
        String input = in.nextLine();//считывает всю строку и возвращает её
        String result = null;
        try {
            result = Main.calc(input);
        } catch (AllExceptions allExceptions) {
            result = allExceptions.getMessage();
        }
        System.out.println(result);
    }
}
