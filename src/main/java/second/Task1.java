package second;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {

        MonthCalendar.of(2022,3 ).print();
    }

    private static class MonthCalendar {
        private int year;
        private int month;

        private MonthCalendar() {
        }

        public static MonthCalendar of(int year, int month) {
            MonthCalendar calendar = new MonthCalendar();
            calendar.year = year;
            calendar.month = month;
            return calendar;
        }

        public void print() {
            LocalDate date = LocalDate.of(year, month, 1);
            int monthValue = date.getMonthValue();
            for (int i = 1; i < date.getDayOfWeek().getValue() + 1; i++) {
                System.out.print("   ");
            }
            while (date.getMonthValue() == monthValue) {
                System.out.printf("%3d", date.getDayOfMonth());
                if (date.getDayOfWeek().getValue() == 6) {
                    System.out.println();
                }
                date = date.plusDays(1);
            }

        }
    }
    //Task 2 - оба методы доступа
}

