package generics;


import com.sun.org.apache.xpath.internal.operations.*;
import junit.framework.TestCase;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import sun.plugin.javascript.navig.Array;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang.StringUtils.isNotBlank;
import static org.apache.commons.lang.StringUtils.remove;


public class GenericsExtendsSuper extends TestCase {


    @Test
    public void testPersonList() throws Exception {
        List<Person> persons = Arrays.asList(new Person("1", "2"), new Person("3", "4"), new Person("1", ""));
        System.out.println(isValidList(persons, new PersonValidator()));

        List<Citizen> citizen = Arrays.asList(new Citizen("11", "22", "122221"), new Citizen("32", " ", "33312"), new Citizen("1", "1", "3333"));
        System.out.println(isValidList(citizen, new PersonValidator()));

        List<Citizen> filtredCitezen = filterInValid(citizen, new PersonValidator());
    }






    public boolean isValidList(List<? extends Person> persons, Validator<Person> personValidator) {
        for (Person person : persons) {
            if (!personValidator.isValid(person)) {
                return false;
            }

        }
        return true;
    }



    public <T> List<T> filterInValid(List<T> values, Validator<? super T> validator) {
        List<T> result = new ArrayList<>();
        for (T value : values) {
            if (validator.isValid(value)) {
                result.add(value);
            }
        }
        return result;
    }





    public interface Validator<T> {
       boolean isValid(T value);
    }




    public static class PersonValidator implements Validator<Person> {
        @Override
        public boolean isValid(Person person) {
            return isNotBlank(person.name) && isNotBlank(person.surname);

        }
    }





    public static class Person {
        public String name;

        public String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }

    }




    public static class Citizen extends Person {
        public Citizen(String name, String surname, String address) {
            super(name, surname);
            this.address = address;
        }

        public String address;

        @Override
        public String toString() {
            return "Citizen{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", surname='" + address + '\'' +
                    '}';
        }

    }


}
