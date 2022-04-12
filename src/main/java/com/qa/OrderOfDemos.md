  Set up Maven Quickstart project 
  
  Add Junit5 Jupiter dependency
  ```java
      <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
      <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.8.1</version>
        <scope>test</scope>
      </dependency>
  ```
  Remove Junit 4 dependency
  Update Maven
  
  1. CalculateMethods
  2. CalculateMethodsTest - static assertions import, demo of success and failing tests, demo of asserting that an exception is thrown
  
  3. CodeToTest - simple hello example
  4. CodeToTestTest - testSayHello with assertEquals
  
  Annotations & Assertions
  
  5. BankAccount class: show balance and minimum balance and constructor and getters
  Have attendees create fields for holderName and isActive including getters and setters for both
  Show Deposit method. 
  Have attendees create withdraw method.
  6. BankAccountTest class: show deposit 500 test. Show *DisplayName* annotation.
  Have attendees create a withdraw test or several.
  Create a test to confirm that isActive is true after the account is created. assertTrue
  Create a test for confirming the holder name is set. assertNotNull
  
  Create testNoWithdrawBelowMinimum to demo assertThrows again
  
  7. BankAccountAssumptionsTest: assumeTrue and assumingThat
  
  8. BankAccountOrderedExecutionTest: @TestMethodOrder & @Order annotations
  
  9.BankAccountDITest: params to methods can be injected via DI using @ExtendWith
  10. BankAccountParameterResolver
  
  11. BankAccountRepeatedTest: @RepeatedTest annotation instead of @Test and RepetitionInfo parameter
  
  12. BankAccountParameterizedTest: get data from different sources as params to our tests
  @ParameterizedTest & @ValueSource & @CsvSource & @CsvFileSource
  
  13. CalculateMethodsMockitoTest: very simple Mockito example.
  
  What is TDD - workflow in Miro
  
  2 Cloud Academy Labs:
  Balloon:
  https://app.qa.com/lab-challenge/java-challenge-bulk-discounting/
  
  Sphere:
  https://app.qa.com/lab-challenge/java-challenge-sphere-volume/
  
  
  Further Learning:
  Introduction to Test Driven Development (TDD) - for Java using JUnit
  https://app.qa.com/course/java-test-driven-development-td-using-junit-1251/results/?context_resource=lp&context_id=2610
  