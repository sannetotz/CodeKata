/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sannetotz.codekata;

/**
 *
 * @author sanne
 */
public class Rover {
    private static final int[] xvalues = new int[]{1, 0, -1, 0};
    private static final int[] yvalues = new int[]{0, 1, 0, -1};

    private int x;
    private int y;
    private int direction;

    public Rover(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 0;
    }

    public int getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {

        return y;
    }

    public void forward() {
        x += xvalues[direction];
        y += yvalues[direction];
    }

    public void backwards() {
        x -= xvalues[direction];
        y -= yvalues[direction];
    }

    public void right() {
        direction++;
        if (direction == 4) {
            direction = 0;
        }
    }

    public void left() {
        direction--;
        if (direction == -1) {
            direction = 3;
        }
    }

}
