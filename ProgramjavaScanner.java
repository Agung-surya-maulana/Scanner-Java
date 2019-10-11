/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daspro;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ProgramjavaScanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String tanggal = sc.next(), bulan = sc.next(), tahun = sc.next(), alamat = sc.next();
        
        System.out.println("Tanggal lahir  : " + tanggal + bulan + tahun);
        System.out.println("Tempat tinggal : " + alamat);
    }
}