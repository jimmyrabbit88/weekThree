import java.util.Calendar;
import java.util.GregorianCalendar;

public class BorrowedBook {

    public static void main(String[] args) {
        GregorianCalendar firstDate, secondDate;
        firstDate = setBorrowedDate();
        secondDate = setReturnDate();

        int firstDay = firstDate.get(Calendar.DAY_OF_YEAR);
        int secondDay = secondDate.get(Calendar.DAY_OF_YEAR);

        int numOfDaysBorrowed = secondDay-firstDay;
        System.out.println(numOfDaysBorrowed);
    }


    public static GregorianCalendar setBorrowedDate(){
        int year = MyMethods.integerInput("Enter the year you borrowed the book", "Enter year");
        int month = MyMethods.integerInput("Enter the month you borrowed the book", "Enter Month");
        int day = MyMethods.integerInput("Enter the day you borrowed the book", "Enter Day");
        GregorianCalendar bordate = new GregorianCalendar(year, month, day);
        return bordate;
    }

    public static GregorianCalendar setReturnDate(){
        int year = MyMethods.integerInput("Enter the year you returned the book","Enter Year");
        int month = MyMethods.integerInput("Enter the month you returned the book","Enter Month");
        int day = MyMethods.integerInput("Enter the day you returned the book", "Enter Day");
        GregorianCalendar retdate = new GregorianCalendar(year, month, day);
        return retdate;
    }
}
