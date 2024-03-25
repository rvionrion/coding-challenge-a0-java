/*
LAUGH

Buatlah program yang akan menerima inputan sebuah bilangan bulat (N), lalu akan menampilkan tulisan "Ha" sebanyak N kali. Tidak boleh menggunakan perulangan dengan while dan for dalam menyelesaikan soal ini.

*Contoh Input*
4

*Contoh Output*
Ha Ha Ha Ha

*/

import java.util.Scanner;

public class Laugh {
  static void tertawa(int n) {
    if (n >= 1) {
      System.out.print("Ha ");
      tertawa(n - 1);
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int bilangan_n;

    System.out.print("Masukkan Bilangan N: ");
    bilangan_n = scn.nextInt();

    tertawa(bilangan_n);
  }

}
