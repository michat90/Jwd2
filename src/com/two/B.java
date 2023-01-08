package com.two;

import com.one.A;

public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.number = 1;
        b.name = "Tom"; //jezeli w klasie parent pole jest protected pozwala ona na dostep do zmiennej w klasie child, przy domyślnym modyfikatroze nie ma dostepu
    }
    //metod finalnych nie mozna przesłaniać
}
