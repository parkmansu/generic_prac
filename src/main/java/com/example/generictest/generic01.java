package com.example.generictest;

class People<T,M> {
    private T name;
    private M age;

    People(T name, M age) {
        this.name = name;
        this.age = age;
    }
    public T getName() {
        return name;
    }
    public M getAge() {
        return age;
    }

    public static <T,V> boolean compare(People<T,V>p1, People<T,V>p2) {
        boolean nameCompare = p1.getName().equals(p2.getName());
        boolean ageCompare = p1.getAge().equals(p2.getAge());
        return nameCompare && ageCompare;
    }
}

class ExGeneric {
    public static void main(String[] args) {
        People<String,Integer> p1 = new People<>("jack",20);
        People<String,Integer> p2 = new People<>("jack",20);

        boolean result = People.compare(p1,p2);
        System.out.println(result);
    }
}