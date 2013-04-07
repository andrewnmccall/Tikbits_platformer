/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialinept.tikbits.m.cond;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author lild227
 */
public class PhysicalObjectCondition {
    boolean absolute = true, percentage = false;
    public Vector2 orig_pos = new Vector2();
    public Rectangle orig_bounds = new Rectangle();
    public Vector2 orig_accel = new Vector2();
    public Vector2 orig_vel = new Vector2();
    
    public Vector2 pos = new Vector2();
    public Rectangle bounds = new Rectangle();
    public Vector2 accel = new Vector2();
    public Vector2 vel = new Vector2();
    
    public boolean checkCondition(){
        return false;
    }
}
