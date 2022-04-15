/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zagrf;

public class Math {

    public static double period;

    public static double freqToPeriod(double frequency, double units) {
        period = 1 / (frequency * units);
        return period;
    }

    public static double periodtoFreq(double frequency, double units) {
        frequency = 1 / (period * units);
        return frequency;
    }

    // period = 1 / frequency

}
