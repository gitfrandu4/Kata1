package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Francisco J.
 */

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1984, 06, 01);
        
        Person person = new Person("Pedro", date);
        System.out.println(person.getName() + " tiene " + person.getAge() +
                            " años");
    }
    
}
