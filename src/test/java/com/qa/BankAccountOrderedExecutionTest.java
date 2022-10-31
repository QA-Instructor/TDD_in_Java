package com.qa;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountOrderedExecutionTest {
    static BankAccount bankAccount = new BankAccount(0,0);

//    These 2 tests share a static bankAccount object so we want the tests to run in a specific order
//    Note the withdraw test fails when run without explicit ordering
//    Tests can run Alphanumerically, by OrderAnnotation, Randomly each time, or with a Custom Order

//    @Test
//    @DisplayName("Withdraw runs successfully when ordered")
//    public void testWithdraw(){
//        bankAccount.withdraw(300);
//        assertEquals(200, bankAccount.getBalance());
//    }
//
//    @Test
//    @DisplayName("Deposit runs successfully when ordered")
//    public void testDeposit(){
//        bankAccount.deposit(500);
//        assertEquals(500, bankAccount.getBalance());
//
//    }


    @Test
    @Order(2)
    @DisplayName("Withdraw runs successfully when ordered")
    public void testWithdraw(){
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }
    @Test
    @Order(1)
    @DisplayName("Deposit runs successfully when ordered")
    public void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());

    }
}
