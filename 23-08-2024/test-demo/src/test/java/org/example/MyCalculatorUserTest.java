package org.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class MyCalculatorUserTest {

    MyCalculatorUser testMyUser;

    @Before
    public void setUp(){
        testMyUser = new MyCalculatorUser();
    }
    @Test
    public void useCalculator() {
        Calculator myMockCalculator = Mockito.mock(Calculator.class);
        Mockito.when(myMockCalculator.add(3,2)).thenReturn(5);
        assertEquals(myMockCalculator.add(3,2), 5);
    }
}
