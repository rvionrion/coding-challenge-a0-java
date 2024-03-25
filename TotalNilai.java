/*
TOTAL NILAI

Buatlah sebuah program dengan statement pengulangan, dimana program dapat menghitung total nilai dari suatu bilangan yang diinputkan. Dengan tampilan output sebagai berikut :

Masukkan bilangan : 5
Total Nilai = 5 + 4 + 3 + 2 + 1 = 15
*/

import java.util.Scanner;

public class TotalNilai {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int bilangan;
    int total_nilai = 0;

    System.out.print("Masukkan bilangan : ");
    bilangan = scn.nextInt();

    System.out.print("Total Nilai = ");

    for (int x = bilangan; x >= 1; x--) {
      System.out.print(x);
      if (x == 1) {
        System.out.print(" = ");
      } else {
        System.out.print(" + ");
      }
      total_nilai += x;
    }
    System.out.println(total_nilai);
  }
}
