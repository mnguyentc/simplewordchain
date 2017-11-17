/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplewordchain;

/**
 *
 * @author mnguyentc
 */
public class SavingsAccount {
    private double balance;
        private double interest;

        public SavingsAccount() {
            balance = 0;
            interest = 0;
        }

        public SavingsAccount(double initialBalance, double initialInterest) {
            balance = initialBalance;
            interest = initialInterest;
        }

        public void deposit(double amount) {
            balance = balance + amount;
        }

        public void withdraw(double amount) {
            balance = balance - amount;
        }

        public void addInterest() {
            balance = balance + balance * interest;
        }

        public double getBalance() {
            return balance;
        }

    }

