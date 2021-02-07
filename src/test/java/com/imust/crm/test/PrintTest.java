package com.imust.crm.test;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintTest {
    @Test
    public void printTest() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println("upperCase = " + upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
