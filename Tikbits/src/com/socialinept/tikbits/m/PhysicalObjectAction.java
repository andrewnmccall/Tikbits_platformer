/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialinept.tikbits.m;

import com.socialinept.tikbits.m.cond.PhysicalObjectCondition;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author Andrew N McCall
 */
public class PhysicalObjectAction  implements IUpdatable{
    PhysicalObject po;
    PhysicalObjectCondition startCondition, endCondition;
    public Vector2 pos = new Vector2();
    public Rectangle bounds = new Rectangle();
    public Vector2 accel = new Vector2();
    public Vector2 vel = new Vector2();
    /**
     *
     * @param t
     */
    @Override
    public void update(float t){
            po.vel.x = vel.x;
            po.vel.y = vel.y;
    }

    public void init(PhysicalObject p){
        po = p;
    }
    
    @Override
    public void preupdate(float time) {
    }

    @Override
    public void postupdate(float time) {
    }
}
