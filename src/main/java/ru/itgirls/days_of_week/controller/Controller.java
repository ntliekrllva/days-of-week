package ru.itgirls.days_of_week.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public enum DayOfWeek {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private String name;

        DayOfWeek(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    @GetMapping("/dayOfWeek")
    public String getDayOfWeek(@RequestParam(value = "day", defaultValue = "TUESDAY") String day) {
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(day);
        return String.format("Сегодня %s!", dayOfWeek.getName());
    }
}


