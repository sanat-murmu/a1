import java.util.*;

class validDate {
    private static boolean isLeapYear(int year) {
        boolean x = false;

        if (year%4 == 0) {
            x = true;
            if (year%100 == 0) {
                if (year%400 == 0) {
                    x = true;
                } else {
                    x = false;
                }
            }
        }
    
        return x;
    }

    public static void isValid(String a) {
        String[] argsSplit = a.split(" ");
        int day = Integer.parseInt(argsSplit[0]);
        int month = Integer.parseInt(argsSplit[1]);
        int year = Integer.parseInt(argsSplit[2]);

        int maxDay = 0;
        switch (month) {
            // January
            case 1: maxDay = 31;
            break;
            // February
            case 2: {
                if (isLeapYear(year)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            };
            break;
            // March
            case 3: maxDay = 31;
            break;
            // April
            case 4: maxDay = 30;
            break;
            // May
            case 5: maxDay = 31;
            break;
            // June
            case 6: maxDay = 30;
            break;
            // July
            case 7: maxDay = 31;
            break;
            // August
            case 8: maxDay = 31;
            break;
            // September
            case 9: maxDay = 30;
            break;
            // October
            case 10: maxDay = 31;
            break;
            // November
            case 11: maxDay = 30;
            break;
            // December
            case 12: maxDay = 31;
            break;
        }
        boolean monthValid = false;
        if (month > 0 && month <= 12) {
            monthValid = true;
        }
        boolean dayValid = false;
        if (day <= maxDay) {
            dayValid = true;
        }
        if (monthValid && dayValid) {
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid Date");
        }
    }
}

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date: ");
        String input = sc.nextLine();
        sc.close();
        validDate.isValid(input);
    }
}
