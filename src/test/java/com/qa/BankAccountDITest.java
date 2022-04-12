package com.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//annotate with the resolver class
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {


    @Test
    @DisplayName("Deposit 500 successfully using DI")
    public void testDeposit(BankAccount bankAccount){ // can now pass in an account instance using Dependency Injection
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 0 successfully using DI")
    public void testDepositZero(BankAccount bankAccount){ // can now pass in an account instance using Dependency Injection
        bankAccount.deposit(0);
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit Negative throws exception using DI")
    public void testDepositNegativeThrowsException(BankAccount bankAccount){ // can now pass in an account instance using Dependency Injection
        assertThrows(RuntimeException.class, () -> bankAccount.deposit(-250));
    }
}
