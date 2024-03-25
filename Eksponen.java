/*
EKSPONEN

Buatlah sebuah program dengan statement pengulangan, dimana program dapat menghitung hasil pangkat suatu bilangan. Dengan tampilan output sebagai berikut :

Masukkan bilangan pokok/basis : 4
Masukkan bilangan pangkat/eksponen : 3
Hasil pangkat = 64
*/

import java.util.Scanner;

public class Eksponen {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int bilangan_basis, bilangan_eksponen;
    int hasil_pangkat = 1;

    System.out.print("Masukkan bilangan pokok/basis : ");
    bilangan_basis = scn.nextInt();

    System.out.print("Masukkan bilangan pangkat/eksponen : ");
    bilangan_eksponen = scn.nextInt();

    for (int i = 1; i <= bilangan_eksponen; i++) {
      hasil_pangkat *= bilangan_basis;
    }

    System.out.println("Hasil pangkat = " + hasil_pangkat);
  }
}
