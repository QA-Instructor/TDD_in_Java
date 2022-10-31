package com.qa;

//import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test BankAccount Class")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw 300 successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
//        Asserts that expected and actual are equal.
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(500);
        assertEquals(900, bankAccount.getBalance());
//        Asserts that expected and actual are equal.
    }

    @Test
    @DisplayName("Withdraw will become negative")
    public void testWithdrawGoesBelowZero(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800);
        assertNotEquals(0,bankAccount.getBalance());
//      Asserts that unexpected and actual are not equal.
//      Fails if both are null.
    }

    @Test
    @DisplayName("Account is active after creation")
    public void testActive(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertTrue(bankAccount.isActive());
//        Asserts that the supplied condition is true.
    }

    @Test
    @DisplayName("Holder name is set")
    public void testHolderNameSet(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.setHolderName("Victoria");
        assertNotNull(bankAccount.getHolderName());
//        Asserts that actual is not null.
    }

//    @Ignore
//    @Test
//    @Disabled
//    @DisplayName("Holder name is not set - show custom message")
//    public void testHolderNameNotSet(){
//        BankAccount bankAccount = new BankAccount(500, -1000);
////        assertNotNull(bankAccount.getHolderName());
////        overloads allows a custom message when a test FAILS
//        assertNotNull(bankAccount.getHolderName(), "Account holder name is null");
////        Asserts that actual is not null.
//    }

    @Test
    @DisplayName("Withdraw can't go below minimum balance")
    public void testNoWithdrawBelowMinimum(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));
//        Asserts that execution of the supplied executable throws an exception of the expectedType.
    }

    @Test
    @DisplayName("No exceptions are thrown during withdraw and deposit")
    public void testNoExceptionsForWithdrawOrDeposit(){
        final BankAccount bankAccount = new BankAccount(500, -1000);
        assertAll(() -> bankAccount.deposit(200), () -> bankAccount.withdraw(1699));
//        Asserts that all supplied executables do not throw an AssertionError.
//        https://junit.org/junit5/docs/5.0.0-M2/api/org/junit/jupiter/api/Assertions.html#assertAll-org.junit.jupiter.api.Executable...-
//        this would fail:
//                assertAll(() -> bankAccount.deposit(200), () -> bankAccount.withdraw(1700));
    }


    @Test
    @DisplayName("Timeout of deposit method")
    public void testDepositTimeout(){
        final BankAccount bankAccount = new BankAccount(500, -1000);
        assertTimeout(Duration.ofNanos(1), () -> bankAccount.deposit(200));
//        Asserts that execution of the supplied executable throws an exception of the expectedType.
    }
}
