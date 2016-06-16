package Calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

/**
 * Created by BlazhkoS on 15.06.2016.
 */

public class CalendarLogic {
    public static Integer[][] arr = new Integer[5][7];
    public static String[] columnName = {"Пн","Вт","Ср","Чт","Пт","Сб","Нд"};
    public static String nowDay;

    private static void createCalendar(LocalDate today){
        DateTimeFormatter dw = DateTimeFormatter.ofPattern("E");
        DateTimeFormatter dm = DateTimeFormatter.ofPattern("dd");
        nowDay = today.format(dm);
        int k = 0, dN = 0;
        int lastDay = today.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        today = today.with(TemporalAdjusters.firstDayOfMonth());
            for (int i = 0; i < 5; i++) {
                for (int l = 0; l < 7; l++) {
                    String text = today.plusDays(k).format(dw);
                    dN = Integer.parseInt(today.plusDays(k).format(dm));
                    if (text.equalsIgnoreCase(columnName[l])) {
                        arr[i][l] = dN;
                        k++;
                    } else {
                        arr[i][l] = null;
                    }
                    if (dN == lastDay)break;
                }
                if(dN == lastDay)break;
            }
    }

    private static LocalDate date(){
        LocalDate today = null;
        boolean exit = true;
        while(exit) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Почати з поточної дати?");
                System.out.println("Введіть Y або N");
                String s = reader.readLine();
                if (s.equalsIgnoreCase("Y")) {
                    today = LocalDate.now(); exit = false;
                    } else if (s.equalsIgnoreCase("N")) {
                    while (exit) {
                        try {
                            System.out.println("Введіть вашу дату");
                            System.out.println("Введіть день");
                            int d = Integer.parseInt(reader.readLine());
                            System.out.println("Введіть місяць");
                            int m = Integer.parseInt(reader.readLine());
                            System.out.println("Введіть рік");
                            int y = Integer.parseInt(reader.readLine());
                            today = LocalDate.of(y, m, d);
                            exit = false;
                        } catch (NumberFormatException e) {
                            System.out.println("Некоректний формат числа :(");
                        }
                    }
                }else System.out.println("Некоректна відповідь! :(");
            } catch (IOException e) {
                System.out.println("Ой, щось пішло не так :(");
                e.printStackTrace();
            }
        }
        return today;
    }

    public static void printCalendar(){
        ArrayList<String> list = new ArrayList<>();
        String cn = "";
        for (int i = 0; i < columnName.length; i++) {
            String s = columnName[i];
            if(s.equalsIgnoreCase("сб") || s.equalsIgnoreCase("нд")){s = "\033[31;1m" + s + "\033[0m"; cn+=s + "  ";}
            else cn+=s + "  ";
        }
//        System.out.println("\033[31;1mred text\033[0m defaulttext");
        list.add(cn);
        for (int i = 0; i < 5; i++) {
            String an = "";
            for (int j = 0; j < 7; j++) {
                String s ="" + arr[i][j]; String ss = "";
                if(s.equals(nowDay)) ss+= "\033[31;1m" + s + "\033[0m" + " ";
                else if(s.equals("null"))ss += "   ";
                else if(s.length() == 1) ss+=" " + s + " ";
                else ss += s + " ";

                if(j == 5 || j == 6) an += "\033[31;1m" + ss + "\033[0m" + " ";
                else an += ss + " ";

            }
            list.add(an);
        }

        for (String s : list) {
            System.out.println(s);
        }

    }

    public static LocalDate getDate(){
        return date();
    }
    public static void setCalendar(LocalDate today){
        createCalendar(today);
    }
}
