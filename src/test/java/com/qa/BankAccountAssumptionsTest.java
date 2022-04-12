package com.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class BankAccountAssumptionsTest {

//    JUnit Assumptions - enable us to only run tests if our assumptions are true
//    If our assumptions are false, the test is aborted

    @Test
    @DisplayName("Account is active after creation with assumption account exists")
    public void testActive(){
        BankAccount bankAccount = new BankAccount(500, -1000);
//        bankAccount = null;
        assumeTrue(bankAccount != null, "Account is null");
//        assumeTrue(bankAccount == null, "Account is not null");
//        if account is not null then the assertion is made, otherwise the test is aborted / ignored
//        with TestAbortedException raised
        assertTrue(bankAccount.isActive());
    }

    @Test
    @DisplayName("Account is active after creation with assuming")
    public void testActiveWithAssuming(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        assumingThat(bankAccount != null, () -> assertTrue(bankAccount.isActive()));
//        The assertion is made only if the assumption is met.
//        If the assumption is NOT met the assertion is not made (it is skipped) so the test will succeed.
//        assumingThat(bankAccount == null, () -> assertTrue(bankAccount.isActive()));
    }
}
