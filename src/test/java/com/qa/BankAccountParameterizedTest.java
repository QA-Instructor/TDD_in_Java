package com.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParameterizedTest {

//    To use this annotation, we need an extra dependency in the POM
//    <dependency>
//      <groupId>org.junit.jupiter</groupId>
//      <artifactId>junit-jupiter-params</artifactId>
//      <version>5.8.1</version>
//      <scope>test</scope>
//    </dependency>


//    the order of the params is very important
//    the values (ints or doubles) must come before the injected BankAccount otherwise you
//    will get errors relating to the parameter resolver
    
    @ParameterizedTest
    @ValueSource(ints = {100, 400, 800, 1000}) // 4 values so 4 executions
    @DisplayName("Deposit using Params successfully")
    public void testDeposit(int amount, BankAccount bankAccount){ // can now pass in an account instance using Dependency Injection
        bankAccount.deposit(amount);
        assertEquals(amount, bankAccount.getBalance());
    }

    @ParameterizedTest
    @CsvSource({"100, Rod", "200, Jane", "150, Freddy"}) // 3 values
    @DisplayName("Deposit using Multiple Params successfully")
    public void testDepositAndHolderName(double amount, String name, BankAccount bankAccount){
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());
    }

//    I created a directory in the 'test' folder called 'resources'
//    I created a file here called 'details.csv'
//    I set the folder to be marked as the default location for test resources
    @ParameterizedTest
    @CsvFileSource(resources = "../../details.csv") // multiple values
    @DisplayName("Deposit using Params from a file source successfully")
    public void testDepositAndHolderNameFromCSVFileSource(double amount, String name, BankAccount bankAccount){
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());
    }
}
