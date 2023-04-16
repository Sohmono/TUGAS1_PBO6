/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pbo1;

/**
 *
 * @author Mono
 */

public class Gameplay {
    public static void main(String[] args) {
//        objek Character
//        bagian ini penentu pemenang dari pertarungan player
//        Jika ingin Player 1 menang, tinggal ubah health dan attackDamage Player menjadi lebih tinggi dari enemy begitu sebaliknya.
//        Hero dapat menjadi invisible jika membuat regenHealth lebih tinggi dari attackDamage lawan
        
        Character player1 = new Character("Player1", 100, 30, 20);
        Character player2 = new Character("Player2", 100, 30, 10);

        // simulasi pertarungan antara dua karakter
        while (player1.isAlive() && player2.isAlive()) {
            player1.attack(player2);
            if (player2.isAlive()) {
                player2.attack(player1);
            }
        }

        // penentu pemenang pertemuran
        if (player1.isAlive()) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }
    
}