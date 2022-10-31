package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@Disabled
public class BankAccountMockTests {

    @Mock
    BankAccount bankAccount;

    @BeforeEach
    public void setupMocks(){
        Mockito.when(bankAccount.getInterestRate()).thenReturn(1.2);
    }

//    @Test
//    public void testInterestRateRetrieval(){
//        assertEquals(1.2, bankAccount.getInterestRate());
//    }
}
