package com.zoo;

import com.animal.Animal;
import java.util.Scanner;

import java.io.IOException;

public class ZooMain {
    public static void main(String[] args) {
        System.out.println("1");
        Scanner sc = new Scanner (System.in);

        Animal pig = new Animal();
        System.out.println(pig.name);
        int i = sc.nextInt();
        try{
        if (i==10 )throw new IOException()Exception();
    }
    }
}
