package com.imust.crm.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable, Comparable<Person> {
    private static final long serialVersionUID = -6278284294521563057L;
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person person) {
        int n1 = this.getName().compareTo(person.getName());
        int n2 = this.getAge() - person.getAge();
        return n1 == 0 ? n2 : n1;
    }
}
