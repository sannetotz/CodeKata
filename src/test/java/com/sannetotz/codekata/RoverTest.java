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

    @Test
    public void commandForwardShouldMoveToNextField() {
        Rover rover = new Rover(2, 5);
        rover.forward();
        assertEquals("new x-Pos Test", 3, rover.getX());
        assertEquals(" y does not change", 5, rover.getY());
    }

    @Test
    public void commandBackwardShouldMoveToLastField() {
        Rover rover = new Rover(2, 5);
        rover.backwards();
        assertEquals("xPas -1", 1, rover.getX());
        assertEquals("y does not change", 5, rover.getY());
    }

    @Test
    public void commandRightShouldMoveToNextField() {
        Rover rover = new Rover(2, 5);
        rover.right();
        rover.forward();
        assertEquals("Rover rotate right", 6, rover.getY());
        assertEquals("xPos doesn't change ", 2, rover.getX());
        assertEquals("Rover rotate", 1, rover.getDirection());
    }

    @Test
    public void commandRightShouldLoopAfterFourCalls() {
        Rover rover = new Rover(2, 5);
        rover.right();
        rover.right();
        rover.right();
        rover.right();
        rover.forward();
        assertEquals("new x-Pos Test", 3, rover.getX());
        assertEquals(" y does not change", 5, rover.getY());

    }

    @Test
    public void commandLeftShouldLoop() {
        Rover rover = new Rover(2, 5);
        assertEquals("Rover rotate left", 0, rover.getDirection());
        rover.left();
        assertEquals("Rover rotate left", 3, rover.getDirection());
        rover.left();
        assertEquals("Rover rotate left", 2, rover.getDirection());
        rover.left();
        assertEquals("Rover rotate left", 1, rover.getDirection());
        rover.left();
        assertEquals("Rover rotate left", 0, rover.getDirection());
        rover.left();
        assertEquals("Rover rotate left", 3, rover.getDirection());
    }

    @Test
    public void commandLeftShouldMoveToNextField() {
        Rover rover = new Rover(2, 5);
        rover.left();
        rover.forward();
        assertEquals("Rover rotate", 3, rover.getDirection());
        assertEquals("Rover rotate right", 4, rover.getY());
        assertEquals("xPos doesn't change ", 2, rover.getX());
    }

    @Test
    public void commandForwardShouldLoop() {
        Rover rover = new Rover(2, 5);
        rover.forward();
        assertEquals("Rovers Position x", 3, rover.getX());
        assertEquals("Rovers pos y", 5, rover.getY());
        assertEquals("Direction", 0, rover.getDirection());
        rover.right();
        rover.forward();
        assertEquals("rover x pos", 3, rover.getX());
        assertEquals("rover y pos", 6, rover.getY());
        assertEquals("Direct", 1, rover.getDirection());
        rover.right();
        rover.forward();
        assertEquals("rover x pos", 2, rover.getX());
        assertEquals("rover y pos", 6, rover.getY());
        assertEquals("Direct", 2, rover.getDirection());
        rover.right();
        rover.forward();
        assertEquals("rover x pos", 2, rover.getX());
        assertEquals("rover y pos", 5, rover.getY());
        assertEquals("Direct", 3, rover.getDirection());
    }
    
    
    
    @Test
    public void commandBackwardShouldLoop() {
        Rover rover = new Rover(3, 5);
        rover.backwards();
        assertEquals("1. Rovers Position x", 2, rover.getX());
        assertEquals("1. Rovers pos y", 5, rover.getY());
        assertEquals("1. Direction", 0, rover.getDirection());
        rover.left();
        rover.backwards();
        assertEquals("2. rover x pos", 2, rover.getX());
        assertEquals("2. rover y pos", 6, rover.getY());
        assertEquals("2. Direct", 3, rover.getDirection());
        rover.left();
        rover.backwards();
        assertEquals("3. rover x pos", 3, rover.getX());
        assertEquals("3. rover y pos", 6, rover.getY());
        assertEquals("3. Direct", 2, rover.getDirection());
        rover.left();
        rover.backwards();
        assertEquals("4. rover x pos", 3, rover.getX());
        assertEquals("4. rover y pos", 5, rover.getY());
        assertEquals("4. Direct", 1, rover.getDirection());
    }

}
