/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zagrf.units;

// Java imports
import java.lang.Math;

/** This is an interface which contains all of the common units of frequency. */
public interface Frequency {
    // Millihertz
    public static final double mHz = Math.pow(10.0, 3.0 * -1.0);

    // Hertz
    public static final double Hz = Math.pow(10.0, 0.0);

    // Kilohertz
    public static final double kHz = Math.pow(10.0, 3.0);

    // Megahertz
    public static final double MHz = Math.pow(10.0, 6.0);

    // Gigahertz
    public static final double GHz = Math.pow(10.0, 9.0);

    // Terahertz
    public static final double THz = Math.pow(10.0, 12.0);
}
