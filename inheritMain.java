package LatihanResponsi;

import java.util.Scanner;

public class inheritMain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ketikan nama Siswa : ");
        String nama = scanner.nextLine();
        System.out.print("Ketikan Alamat Siswa : ");
        String alamat = scanner.nextLine();
        System.out.print("Ketikan NIM Siswa : ");
        String nim = scanner.nextLine();
        Student mahasiswa = new Student(nama,alamat,nim);
        mahasiswa.identity();
        System.out.println("Tagihan pembayaran : "+mahasiswa.hitungPembayaran(250000,20,3));
        mahasiswa.hobi("membaca");
    }
}
