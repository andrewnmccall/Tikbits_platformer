package com.socialinept.tikbits.m.draw;

import java.util.Comparator;

/**
 *
 * @author Andrew N McCall
 */
public class DrawingInstructionComparator implements Comparator<DrawingInstruction> {

    public DrawingInstructionComparator() {
    }

    @Override
    public int compare(DrawingInstruction o1, DrawingInstruction o2) {
        return Float.compare(o1.z, o2.z);
    }
}
