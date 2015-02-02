/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.PSP0.app;

import java.util.LinkedList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;

/**
 *
 * @author sebascardonac11
 */
public class Psp0Test extends TestCase {
    
    LinkedList<Double> lista;
    public Psp0Test(String testName) {
        super(testName);
        this.lista = new LinkedList<Double>();
        lista.add((double)160);
        lista.add((double)591);
        lista.add((double)114);
        lista.add((double)229);
        lista.add((double)230);
        lista.add((double)270);
        lista.add((double)128);
        lista.add((double)1657);
        lista.add((double)624);
        lista.add((double)1503);  
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getMedia method, of class Psp0.
     */
    public void testGetMedia() {
        System.out.println("getMedia");
        Psp0 instance = new Psp0(this.lista);
        double expResult = 550.6;
        double result = instance.getMedia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue("getMedia sin errores",true);
    }
    /**
     * Test of getDesviacion method, of class Psp0.
     */
   public void testGetDesviacion() {
        System.out.println("getDesviacion");
        Psp0 instance = new Psp0(this.lista);
        double expResult = 572.026844746915;
        double result = instance.getDesviacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
