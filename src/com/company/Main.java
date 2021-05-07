package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double bodyGrowth  = 0, bodyWeight = 0,  resultMBI;

        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа рассчитывает индекс массы тела");
        System.out.print("Введите Ваш рост");
        try{
            bodyGrowth = input.nextDouble();
        }
        catch (Exception e){
            System.out.println("Ошибка ввода №1, программа будет закрыта" +e.getMessage());
        }

        System.out.print("Введите Ваш вес");
        try{
            bodyWeight = input.nextDouble();
        }
        catch (Exception e){
            System.out.println("Ошибка ввода №2, программа будет закрыта " +e.getMessage());
        }

        resultMBI = bodyWeight / (Math.pow((bodyGrowth / 100), 2));
        System.out.println("Индекс массы тела: " + resultMBI);


        double bmi = resultMBI;
        System.out.println("BMI = "+bmi);
        if(bmi<16.5){
            System.out.println("Крайний недостаток веса");
        }
        if(bmi>=16.5 && bmi<=18.4){
            System.out.println("Недостаток в весе");
        }
        if(bmi>=18.5 && bmi<=24.9){
            System.out.println("Нормальный вес тела");
        }
        if(bmi>=25 && bmi<=30){
            System.out.println("Избыточная масса тела");
        }
        if(bmi>=30.1 && bmi<=34.9){
            System.out.println("Ожирение (Класс I) ");
        }
        if(bmi>=35 && bmi<=40){
            System.out.println("Ожирение (Класс II - тяжелое) ");
        }
        if(bmi>40){
            System.out.println("Ожирение (Класс III - крайне тяжелое)");
        }
    }
}
