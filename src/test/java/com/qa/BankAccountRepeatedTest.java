package com.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

//annotate with the resolver class
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTest {

    @RepeatedTest(5)
    @DisplayName("Deposit 500 successfully using DI repeated")
    public void testDeposit(BankAccount bankAccount){ // can now pass in an account instance using Dependency Injection
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
        System.out.println("Balance: " + bankAccount.getBalance());
    }

//    Note the additional parameter of type RepetitionInfo
    @RepeatedTest(5)
    @DisplayName("Deposit 500 successfully using DI with repetition info")
    public void testDepositRepetitionInfo(BankAccount bankAccount, RepetitionInfo info) { // can now pass in an account instance using Dependency Injection
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
        System.out.println("Number: " + info.getCurrentRepetition() + " Balance " + bankAccount.getBalance());
    }
}
