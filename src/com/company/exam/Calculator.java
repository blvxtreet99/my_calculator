package com.company.exam;
import java.util.Scanner;

public class Calculator {
    double num1, num2, result, n, sin_result, degrees;//обьявление переменных,которые пригодатся в дальнейшем
    String operationType_s,operationType_r;//обьявление переменных,которые пригодатся в дальнейшем
    Scanner inputScanner = new Scanner(System.in);//обьявляем сканер
    public void scan() {//метод предназначен для сканирования чисел сканером,а сканер действий прописан в каждом типе калькулятора
        System.out.println("Введите первое число");
        num1 = inputScanner.nextDouble();//вводим первое число
        System.out.println("Введите второе число");
        num2 = inputScanner.nextDouble();//вводим второе число
    }
    public void round(){//в RoundedCalculator мы вводим действие,затем кол-во цифр после запятой и, сначала, считаем результат,
        System.out.println("Введите действие");// а после вычисляем по формуле, и этом метод делает все это.
        operationType_r = inputScanner.next();//сканируем действие
        System.out.println("Введите кол-во чисел после запятой");
        n = inputScanner.nextDouble();//вводим кол-во цифр после запятой
        double scale = Math.pow(10, n);//вводим переменную,в которой мы записываем цифру 10 в степени n
        switch (operationType_r){//используем оператор switch-case,чтобы записать результат примера в зависимости от действий
            case "+" -> result = num1 + num2;//действие сложения
            case "-" -> result = num1 - num2;//вычитания
            case "*" -> result = num1 * num2;//умножения
            case "/" -> result = num1 / num2;//деления
        }
        double r_result = Math.ceil(result * scale) / scale;//формула,благодаря которой мы записываем результат с определеным количеством цифр после запятой
        System.out.println("Ваш результат: " + r_result);//выводим результат
    }
    public void operation(){//метод используется в SimpleCalculator для расчета обычных действий
        System.out.println("Введите действие");
        operationType_s = inputScanner.next();//вводим действие,которое необходимо
        switch (operationType_s){
            case "+" -> {result = num1 + num2;//сначала записываем результат в переменную благодаря оператору switch-case
                         System.out.println("Ваш результат: " + result);}//а после выводим его (действие сложения)
            case "-" -> {result = num1 - num2;//действие вычитания
                         System.out.println("Ваш результат: " + result);}//действие вычитания
            case "*" -> {result = num1 * num2;//действие умножения
                         System.out.println("Ваш результат: " + result);}//действие умножения
            case "/" -> {result = num1 / num2;//действие деления
                         System.out.println("Ваш результат: " + result);}//действие деления
        }
    }
    public void sin(){//в этом методе определяется синус (по градусам)
        System.out.println("Введите количество градусов");
        degrees = inputScanner.nextDouble();//вводим число градусов
        sin_result=Math.sin(degrees);//после этого записываем его как синус при помощи Math.sin() в отдельную переменную
        System.out.println("Ваш результат: " + sin_result);//далее выводим результат
    }

    }
