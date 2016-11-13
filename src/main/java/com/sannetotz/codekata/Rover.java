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

    private int x;
    private int y;
    private int direction;

    public int getDirection() {
        return direction;
    }

    public Rover(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {

        return y;
    }

    public void forward() {
        if (direction == 0) {
            x++;
        }
        if (direction == 1) {
            y++;
        }
        if (direction == 2) {
            x--;

        }
        if (direction == 3) {
            y--;
        }
    }

    public void backwards() {

        if (direction == 0) {
            x--;
        }
        if (direction == 1) {
            y--;
        }
        if (direction == 2) {
            x++;
        }
        if (direction == 3) {
            y++;
        }

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
