package main.test.java;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class CalculatorTest_ {
    private CalculatorTest_ calculator_;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void globalSetUp(){
        System.out.println("Initial setup...");
        System.out.println("Code executes onle once");
    }

    @Before
    public void setUp(){
        System.out.println("Code executes before each test method");
        calculator
    }

}
