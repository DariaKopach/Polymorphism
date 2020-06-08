/*
 * Polymorphism
 *
 * Version from 08.06.2020
 *
 * Copyright Kopach Daria KNTEU
 *
 * Create and implement two interfaces for your class.
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        Parallelogram parallelogram = new Parallelogram(
                8,
                6,
                Math.PI / 0.4);

        System.out.println(parallelogram + "\n");
        System.out.println(parallelogram.toXML() + "\n");
        System.out.println(parallelogram.toJSON() + "\n");
        System.out.println(parallelogram.toConsole() + "\n");



    }
}