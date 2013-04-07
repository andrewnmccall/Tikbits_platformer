/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialinept.tikbits.m;

import com.socialinept.tikbits.m.cond.PhysicalObjectCondition;
import com.badlogic.gdx.math.Rectangle;

/**
 *
 * @author Andrew N McCall
 */
public class PhysicalObjectInstruction {
    PhysicalObject po;
    PhysicalObjectCondition startCondition, endCondition;
    public String nextAction = "";
    PhysicalObjectCommand command;
    public PhysicalObjectInstruction() {
    }
    public void update(){
        
    }
}
