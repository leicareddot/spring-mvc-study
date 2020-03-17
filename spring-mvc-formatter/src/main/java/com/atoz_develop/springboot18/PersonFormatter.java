package com.atoz_develop.springboot18;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class PersonFormatter implements Formatter<Person> {

    // 문자열 -> 객체
    @Override
    public Person parse(String text, Locale locale) throws ParseException {
        Person person = new Person();
        person.setName(text);
        return person;
    }

    // 객체 -> 문자열(여기선 사용 안함)
    @Override
    public String print(Person object, Locale locale) {
        return object.toString();
    }
}
