package kata1;

import java.util.Date;

/**
 *
 * @author Francisco J.
 */

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Francisco", new Date(96,05,1));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
