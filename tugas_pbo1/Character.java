/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pbo1;

import java.util.Scanner;

/**
 *
 * @author Mono
 */
public class Character {
    // Fields untuk nama karakter, health, dan attack power
    private String hero;
    private int health;
    private int attackDamage;
    private int regenHealth;

    //Inisialisasi player, health, damage, dan regenHealth
    public Character(String hero, int health, int attackDamage, int regenHealth) {
        this.hero = hero;
        this.health = health;
        this.attackDamage = attackDamage;
        this.regenHealth = regenHealth;
    }

    // metode untuk menyerang Hero lain disertai proses regen
    public void attack(Character other) {
        System.out.println(hero + " menyerang " + other.hero + " = " + attackDamage + " DMG!");
        other.Damaged(attackDamage);
        other.regeneration(other.regenHealth);
        System.out.println(other.hero + "'s health = " + other.health);
        System.out.println("-------------------------------");
    }

    // metode untuk menerima damage
    public void Damaged(int damage) {
        health -= damage;
        System.out.println(hero + " -" + damage + " HP!");
    }
    
    //metode regen untuk pengisian HP
    public void regeneration(int regen){
        health += regen;
        System.out.println(hero + " +" + regen + " HP Regen!");
    }

    // metode pengecekan apakah hero masih hidup
    public boolean isAlive() {
        return health > 0;
    }

    // metode untuk mendapatkan nama karakter
    public String getName() {
        return hero;
    }
}