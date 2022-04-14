/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zagrf;

import xyz.zagdrath.zagrf.GUI;
import xyz.zagdrath.zagrf.units.Frequency;

public class Math {
    private static double period;
    public static double units;

    public static double freqToPeriod(double frequency) {
        period = 1 / (frequency * units);
        return period;
    }

    // period = 1 / frequency

}
