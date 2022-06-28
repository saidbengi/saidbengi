package day32_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime timeDate= LocalDateTime.now();
        System.out.println(timeDate);// 2022-03-31T22:35:24.953850200

        System.out.println(timeDate.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        //2025-06-11T03:42:27.209948700


    }
}
