/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sannetotz.codekata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sanne
 */
public class RoverTest {

    @Test
    public void roverShouldHaveIntialPostion() {
        Rover rover = new Rover(2, 5);
        assertEquals("x-Pos testesd", 2, rover.getX());
        assertEquals("y-Pos test", 5, rover.getY());

    }
}
