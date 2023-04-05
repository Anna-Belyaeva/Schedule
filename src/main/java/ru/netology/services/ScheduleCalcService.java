package ru.netology.services;

public class ScheduleCalcService {

    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {

            if (money >= threshold) { // можем ли отдыхать?

                int rest = (money - expenses) / 3; //нужно для подсчёта трат на отпуск
                //int vacationSpending = (money - expenses) - rest; //отпускные
                //System.out.println("Месяц " + month + ". " + "Денег " + money + ". " + "Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + vacationSpending);
                money = rest;
                count++;

            } else {

                //System.out.println("Месяц " + month + ". " + "Денег " + money + ". " + "Придётся работать. " + "Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }
}
