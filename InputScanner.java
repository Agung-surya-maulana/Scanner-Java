/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputscanner;

import java.util.Scanner;

public class InputScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, alamat, pendidikanTerakhir, agama, status;
        int usia,gaji;
        double tb, bb;
        
        System.out.print("Nama \t \t \t : ");
        nama = input.nextLine();
        System.out.print("Alamat \t \t \t : ");
        alamat = input.nextLine();
        System.out.print("Pendidikan Terakhir \t : ");
        pendidikanTerakhir = input.nextLine();
        System.out.print("Agama \t \t \t : ");
        agama = input.nextLine();
        System.out.print("Usia \t \t \t : ");
        usia = input.nextInt();
        System.out.print("Tinggi Badan \t \t : ");
        tb = input.nextDouble();
        System.out.print("Berat Badan \t \t : ");
        bb = input.nextDouble();
        System.out.println("Status \t \t \t");
        status = input.nextLine();
        
        
        System.out.println("\n");
        
        System.out.println("==========BIODATA PT. DASAR PROGRAMAN========");
        System.out.println("Nama \t \t \t : " + nama);
        System.out.println("Alamat \t \t \t : " + alamat);
        System.out.println("Pendidikan Terakhir \t : " + pendidikanTerakhir);
        System.out.println("Agama \t \t \t : " + agama);
        System.out.println("Usia \t \t \t : " + usia);
        System.out.println("Tinggi Badan \t \t : " + tb);
        System.out.println("Berat Badan \t \t : " + bb);
        System.out.println("Status \t \t \t : " + status);
        
        
        
    }
    
}
