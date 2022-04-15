/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zagrf.units;

// Java imports
import java.lang.Math;

/** This is an interface which contains all of the common units of period. */
public interface Period {
    // Second
    public static final double s = Math.pow(10.0, 0.0);

    // Millisecond
    public static final double ms = Math.pow(10.0, 3.0 * -1.0);

    // Nanosecond
    public static final double ns = Math.pow(10.0, 9.0 * -1.0);
}
