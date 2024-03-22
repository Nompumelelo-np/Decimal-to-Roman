/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decimaltoroman;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Acer-User
 */
public class DecimalToRoman {

    public static void main(String[] args)throws IOException {
      InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        System.out.print("Enter any decimal number: ");
        int n = Integer.parseInt(br.readLine());

        String c[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "L"};
        String s = "";
        
        if (n <= 10)
            System.out.println("The number '" + n + "' in ROMAN notation is '" + c[n - 1] + "'");
        else if (n > 10 && n <= 59) {
            int y = n / 10;
            if (y != 0)
                s = s + c[10];
            int r = n % 10;
            if (r != 0)
                s = s + c[r - 1];
            System.out.println("The number '" + n + "' in ROMAN notation is '" + s + "'");
        } else {
            int r = n % 10;
            if (r != 0)
                s = s + c[r - 1];
            System.out.println("The number '" + n + "' in ROMAN notation is '" + s + "'");
        }   
    }
}
