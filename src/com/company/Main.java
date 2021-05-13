package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String firstLesson;// Обьявление переменноЙ ТИП данных String

        final int NUM = 15;

        String word = " Book";

        firstLesson = NUM + word;
        System.out.println(firstLesson);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }

        Scanner  input  = new Scanner(System.in);
        System.out.println("Введите ваше имя ");
        String putName = input.next();
        System.out.println("Введите свою фамилию");
        String lname  = input.next();
        System.out.println();
        System.out.println("Hello \n" + putName+ lname);

        System.out.println("Сколько вам лет ?");
        int age = input.nextInt();
        if (age>20){
            System.out.println("о классно тебе " + age);
        } if ("asd".equals("asd")){

        }


    }
}
/*
String cat = " Cat"
String name = "Tommy "

//Складываем две строки и пробел между ними,чтобы слова не склеились
String fullName = cat + "" + name;
Получится Кот Tommy


 int digit =4;
        String paws = " paws ";
        String aboutCat = digit + paws;
        System.out.println(aboutCat);


*/
