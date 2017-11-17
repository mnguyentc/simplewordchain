/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplewordchain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author mnguyentc
 */
public class SimpleWordChainTest {

    public SimpleWordChainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        ByteArrayInputStream in = new ByteArrayInputStream("1st/n/r2s/n/r".getBytes());
        System.setIn(in);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    /**
     * Test of main method, of class SimpleWordChain.
     */
    @Test
    public void testMain() {
//        System.out.println("main");
        String[] args = {"shiratori", "internet", "tail"};
        SimpleWordChain.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        assertEquals("FIRST (OK): 1st", outContent.toString());
    }

}
