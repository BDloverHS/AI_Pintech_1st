package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        // s1.year = 2024;
        // s1.month = 2;
        // s1.day = 31; // 31이라는 잘못된 값을 검증하고 대입을 통제하는 방법 X

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(27);
        s1.showDate();

        int ck_year = s1.getYear();
        int ck_month = s1.getMonth();
        int ck_day = s1.getDay();

        System.out.println(ck_year);
        System.out.println(ck_month);
        System.out.println(ck_day);
    }
}