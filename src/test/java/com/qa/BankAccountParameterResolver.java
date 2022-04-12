package com.qa;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

// This class is used with the DI example
// The interface ParameterResolver
// ParameterResolver defines the API for Extensions that wish to dynamically resolve arguments for parameters at runtime.
// If a constructor for a test class or a @Test, @BeforeEach, @AfterEach, @BeforeAll, or @AfterAll method declares a parameter,
// an argument for the parameter must be resolved at runtime by a ParameterResolver.
//


public class BankAccountParameterResolver implements ParameterResolver {

//    Determine if this resolver supports resolution of an argument for the Parameter in the supplied ParameterContext for the supplied ExtensionContext
//    supportsParameter() – returns true if the parameter’s type is supported (BankAccount in this example)
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == BankAccount.class;
    }

//    Resolve an argument for the Parameter in the supplied ParameterContext for the supplied ExtensionContext
//    resolveParameter() – serves up an object of the correct type (a new BankAccount instance in this example),
//    which will then be injected into your test method
    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return new BankAccount(0,0);
    }
}
