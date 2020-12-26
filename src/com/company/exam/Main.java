package com.company.exam;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//вводим сканер
        int x = 0;//в этой переменной указан 0,поскольку программа будет записывать сюда значение переменной s
        String s = "";//вводим пустую строчную переменную для ввода в консоль в дальнейшем
        while (!"4".equals(s)){//этот цикл вычисляет так: пока не будет введена цифра 6,то цикл будет активен (в нашем случае это цикл меню)
            System.out.println("Выберите калькулятор,который хотите использовать:");
            System.out.println("1. Простой калькулятор");
            System.out.println("2. Сложный калькулятор");
            System.out.println("3. Вычислить синус в градусах");
            System.out.println("4. Выход");
            s = scan.next();//вводим в строчную переменную цифру пункта меню благодаря сканеру
            try {//после этого значение строчной переменной переводится в значение числовой переменной
                x = Integer.parseInt(s);//благодаря парсингу
            }
            catch (NumberFormatException e){//а сам цикл try-catch проверяет,введены ли буквы вместо цифры
                System.out.println("Неверный ввод");//если выводит это сообщение-значит были введены буквы или другие символы вместо цифр
            }
            switch (x){//далее определяем пункт меню благодаря оператору switch-case и выводим то,что нам нужно
                case 1 -> {System.out.println("\nВы выбрали простой калькулятор\n");//при первом пункте меню выводится обычный калькулятор из класса Calculator
                           Calculator s_calculator = new Calculator();//обьявляем обьект калькулятора
                           s_calculator.scan();//берем из класса Calculator метод scan
                           s_calculator.operation();}//также и метод operation

                case 2 -> {System.out.println("\nВы выбрали сложный калькулятор\n");//при втором пункте меню выводится калькулятор,который задает кол-во цифр после запятой и округляет результат
                           Calculator r_calculator = new Calculator();//обьявляем обьект второго калькулятора
                           r_calculator.scan();//берем из класса Calculator метод scan
                           r_calculator.round();}//также и метод round,который задает кол-во цифр после запятой,а затем округляет результат

                case 3 -> {System.out.println("\nВычисление синуса в градусах\n");//при четвертом пункте меню выводится синус угла (в градусах)
                           Calculator s_calculator = new Calculator();//обьявляем обьект калькулятора
                           s_calculator.sin();}//берем из класса Calculator метод logarithm,который определяет десятичный логарифм

            }
        }
        System.out.println("Приложение завершило работу.");
    }
}
