package kata1;

import java.time.LocalDate;

/**
 *
 * @author Francisco J.
 */

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1984, 06, 01);
        
        Person person = new Person("Pedro", date);
        System.out.println(person.getName() + " tiene " + person.getAge() +
                            " años");
    }
    
}
