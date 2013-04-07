/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialinept.tikbits.m.draw;

import com.badlogic.gdx.math.Rectangle;
import java.util.Comparator;

/**
 *
 * @author Andrew McCall <andrewnmccall@gmail.com>
 */
public class DrawingInstruction {

    public boolean repeat_top = false, repeat_right = false, 
            repeat_bottom = false, repeat_left = false, relative = false;
    public Rectangle bounds = new Rectangle();
    public String resource = "";
    public DrawCommand command = DrawCommand.Line;
    public float fcolor_A = 1, fcolor_R = 1, fcolor_G = 1, fcolor_B = 1,
            bcolor_A = 1, bcolor_R = 1, bcolor_G = 1, bcolor_B = 1, z = 0;

    public DrawingInstruction() {
    }
    public void update(){
        
    }
}

