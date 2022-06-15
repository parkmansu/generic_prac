package com.example.generictest;

class ClassName<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }
    static <E> E genericMethod1(E p) {
        return p;
    }
    static <T> T genericMethod2(T o) {
        return o;
    }

}

class Main {
    public static void main(String[] args) {

        ClassName<String> a = new ClassName<>();
        ClassName<Integer> b = new ClassName<>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println();

        System.out.println("b data : " + b.get());
        System.out.println("b E Type : " + b.get().getClass().getName());

        System.out.println("<T> returnType : " + ClassName.genericMethod2(3).getClass().getName());
        System.out.println("<T> returnType : " + ClassName.genericMethod2("ABCD").getClass().getName());
        System.out.println("<T> returnType : " + ClassName.genericMethod1(b).getClass().getName());
        System.out.println("<T> returnType : " + ClassName.genericMethod1(3.0).getClass().getName());

    }
}

