package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String line = scanner.next();
        String reversStr = new StringBuffer(line).reverse().toString();
        System.out.println(line.compareTo(reversStr) == 0 ? "is palindrom" : "no");
    }
}
