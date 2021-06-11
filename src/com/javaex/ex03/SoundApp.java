package com.javaex.ex03;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow() );
        printSound( new Duck() );
    }

    
    public static void  printSound( Soundable aa) {
    	System.out.println(aa.sound());
    }
    
}


