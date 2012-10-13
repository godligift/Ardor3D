/**
 * Copyright (c) 2008-2012 Ardor Labs, Inc.
 *
 * This file is part of Ardor3D.
 *
 * Ardor3D is free software: you can redistribute it and/or modify it 
 * under the terms of its license which may be found in the accompanying
 * LICENSE file or at <http://www.ardor3d.com/LICENSE>.
 */

package com.ardor3d.extension.model.md2;

import com.ardor3d.math.Vector3;

final class Md2Normals {
    /** Pre-generated md2 normals. See also http://tfc.duke.free.fr/coding/src/anorms.h */
    final static float[] NORMALS = { //
    -0.525731f, 0.000000f, 0.850651f, //  
            -0.442863f, 0.238856f, 0.864188f, //  
            -0.295242f, 0.000000f, 0.955423f, //  
            -0.309017f, 0.500000f, 0.809017f, //  
            -0.162460f, 0.262866f, 0.951056f, //  
            0.000000f, 0.000000f, 1.000000f, //  
            0.000000f, 0.850651f, 0.525731f, //  
            -0.147621f, 0.716567f, 0.681718f, //  
            0.147621f, 0.716567f, 0.681718f, //  
            0.000000f, 0.525731f, 0.850651f, //  
            0.309017f, 0.500000f, 0.809017f, //  
            0.525731f, 0.000000f, 0.850651f, //  
            0.295242f, 0.000000f, 0.955423f, //  
            0.442863f, 0.238856f, 0.864188f, //  
            0.162460f, 0.262866f, 0.951056f, //  
            -0.681718f, 0.147621f, 0.716567f, //  
            -0.809017f, 0.309017f, 0.500000f, //  
            -0.587785f, 0.425325f, 0.688191f, //  
            -0.850651f, 0.525731f, 0.000000f, //  
            -0.864188f, 0.442863f, 0.238856f, //  
            -0.716567f, 0.681718f, 0.147621f, //  
            -0.688191f, 0.587785f, 0.425325f, //  
            -0.500000f, 0.809017f, 0.309017f, //  
            -0.238856f, 0.864188f, 0.442863f, //  
            -0.425325f, 0.688191f, 0.587785f, //  
            -0.716567f, 0.681718f, -0.147621f, //  
            -0.500000f, 0.809017f, -0.309017f, //  
            -0.525731f, 0.850651f, 0.000000f, //  
            0.000000f, 0.850651f, -0.525731f, //  
            -0.238856f, 0.864188f, -0.442863f, //  
            0.000000f, 0.955423f, -0.295242f, //  
            -0.262866f, 0.951056f, -0.162460f, //  
            0.000000f, 1.000000f, 0.000000f, //  
            0.000000f, 0.955423f, 0.295242f, //  
            -0.262866f, 0.951056f, 0.162460f, //  
            0.238856f, 0.864188f, 0.442863f, //  
            0.262866f, 0.951056f, 0.162460f, //  
            0.500000f, 0.809017f, 0.309017f, //  
            0.238856f, 0.864188f, -0.442863f, //  
            0.262866f, 0.951056f, -0.162460f, //  
            0.500000f, 0.809017f, -0.309017f, //  
            0.850651f, 0.525731f, 0.000000f, //  
            0.716567f, 0.681718f, 0.147621f, //  
            0.716567f, 0.681718f, -0.147621f, //  
            0.525731f, 0.850651f, 0.000000f, //  
            0.425325f, 0.688191f, 0.587785f, //  
            0.864188f, 0.442863f, 0.238856f, //  
            0.688191f, 0.587785f, 0.425325f, //  
            0.809017f, 0.309017f, 0.500000f, //  
            0.681718f, 0.147621f, 0.716567f, //  
            0.587785f, 0.425325f, 0.688191f, //  
            0.955423f, 0.295242f, 0.000000f, //  
            1.000000f, 0.000000f, 0.000000f, //  
            0.951056f, 0.162460f, 0.262866f, //  
            0.850651f, -0.525731f, 0.000000f, //  
            0.955423f, -0.295242f, 0.000000f, //  
            0.864188f, -0.442863f, 0.238856f, //  
            0.951056f, -0.162460f, 0.262866f, //  
            0.809017f, -0.309017f, 0.500000f, //  
            0.681718f, -0.147621f, 0.716567f, //  
            0.850651f, 0.000000f, 0.525731f, //  
            0.864188f, 0.442863f, -0.238856f, //  
            0.809017f, 0.309017f, -0.500000f, //  
            0.951056f, 0.162460f, -0.262866f, //  
            0.525731f, 0.000000f, -0.850651f, //  
            0.681718f, 0.147621f, -0.716567f, //  
            0.681718f, -0.147621f, -0.716567f, //  
            0.850651f, 0.000000f, -0.525731f, //  
            0.809017f, -0.309017f, -0.500000f, //  
            0.864188f, -0.442863f, -0.238856f, //  
            0.951056f, -0.162460f, -0.262866f, //  
            0.147621f, 0.716567f, -0.681718f, //  
            0.309017f, 0.500000f, -0.809017f, //  
            0.425325f, 0.688191f, -0.587785f, //  
            0.442863f, 0.238856f, -0.864188f, //  
            0.587785f, 0.425325f, -0.688191f, //  
            0.688191f, 0.587785f, -0.425325f, //  
            -0.147621f, 0.716567f, -0.681718f, //  
            -0.309017f, 0.500000f, -0.809017f, //  
            0.000000f, 0.525731f, -0.850651f, //  
            -0.525731f, 0.000000f, -0.850651f, //  
            -0.442863f, 0.238856f, -0.864188f, //  
            -0.295242f, 0.000000f, -0.955423f, //  
            -0.162460f, 0.262866f, -0.951056f, //  
            0.000000f, 0.000000f, -1.000000f, //  
            0.295242f, 0.000000f, -0.955423f, //  
            0.162460f, 0.262866f, -0.951056f, //  
            -0.442863f, -0.238856f, -0.864188f, //  
            -0.309017f, -0.500000f, -0.809017f, //  
            -0.162460f, -0.262866f, -0.951056f, //  
            0.000000f, -0.850651f, -0.525731f, //  
            -0.147621f, -0.716567f, -0.681718f, //  
            0.147621f, -0.716567f, -0.681718f, //  
            0.000000f, -0.525731f, -0.850651f, //  
            0.309017f, -0.500000f, -0.809017f, //  
            0.442863f, -0.238856f, -0.864188f, //  
            0.162460f, -0.262866f, -0.951056f, //  
            0.238856f, -0.864188f, -0.442863f, //  
            0.500000f, -0.809017f, -0.309017f, //  
            0.425325f, -0.688191f, -0.587785f, //  
            0.716567f, -0.681718f, -0.147621f, //  
            0.688191f, -0.587785f, -0.425325f, //  
            0.587785f, -0.425325f, -0.688191f, //  
            0.000000f, -0.955423f, -0.295242f, //  
            0.000000f, -1.000000f, 0.000000f, //  
            0.262866f, -0.951056f, -0.162460f, //  
            0.000000f, -0.850651f, 0.525731f, //  
            0.000000f, -0.955423f, 0.295242f, //  
            0.238856f, -0.864188f, 0.442863f, //  
            0.262866f, -0.951056f, 0.162460f, //  
            0.500000f, -0.809017f, 0.309017f, //  
            0.716567f, -0.681718f, 0.147621f, //  
            0.525731f, -0.850651f, 0.000000f, //  
            -0.238856f, -0.864188f, -0.442863f, //  
            -0.500000f, -0.809017f, -0.309017f, //  
            -0.262866f, -0.951056f, -0.162460f, //  
            -0.850651f, -0.525731f, 0.000000f, //  
            -0.716567f, -0.681718f, -0.147621f, //  
            -0.716567f, -0.681718f, 0.147621f, //  
            -0.525731f, -0.850651f, 0.000000f, //  
            -0.500000f, -0.809017f, 0.309017f, //  
            -0.238856f, -0.864188f, 0.442863f, //  
            -0.262866f, -0.951056f, 0.162460f, //  
            -0.864188f, -0.442863f, 0.238856f, //  
            -0.809017f, -0.309017f, 0.500000f, //  
            -0.688191f, -0.587785f, 0.425325f, //  
            -0.681718f, -0.147621f, 0.716567f, //  
            -0.442863f, -0.238856f, 0.864188f, //  
            -0.587785f, -0.425325f, 0.688191f, //  
            -0.309017f, -0.500000f, 0.809017f, //  
            -0.147621f, -0.716567f, 0.681718f, //  
            -0.425325f, -0.688191f, 0.587785f, //  
            -0.162460f, -0.262866f, 0.951056f, //  
            0.442863f, -0.238856f, 0.864188f, //  
            0.162460f, -0.262866f, 0.951056f, //  
            0.309017f, -0.500000f, 0.809017f, //  
            0.147621f, -0.716567f, 0.681718f, //  
            0.000000f, -0.525731f, 0.850651f, //  
            0.425325f, -0.688191f, 0.587785f, //  
            0.587785f, -0.425325f, 0.688191f, //  
            0.688191f, -0.587785f, 0.425325f, //  
            -0.955423f, 0.295242f, 0.000000f, //  
            -0.951056f, 0.162460f, 0.262866f, //  
            -1.000000f, 0.000000f, 0.000000f, //  
            -0.850651f, 0.000000f, 0.525731f, //  
            -0.955423f, -0.295242f, 0.000000f, //  
            -0.951056f, -0.162460f, 0.262866f, //  
            -0.864188f, 0.442863f, -0.238856f, //  
            -0.951056f, 0.162460f, -0.262866f, //  
            -0.809017f, 0.309017f, -0.500000f, //  
            -0.864188f, -0.442863f, -0.238856f, //  
            -0.951056f, -0.162460f, -0.262866f, //  
            -0.809017f, -0.309017f, -0.500000f, //  
            -0.681718f, 0.147621f, -0.716567f, //  
            -0.681718f, -0.147621f, -0.716567f, //  
            -0.850651f, 0.000000f, -0.525731f, //  
            -0.688191f, 0.587785f, -0.425325f, //  
            -0.587785f, 0.425325f, -0.688191f, //  
            -0.425325f, 0.688191f, -0.587785f, //  
            -0.425325f, -0.688191f, -0.587785f, //  
            -0.587785f, -0.425325f, -0.688191f, //  
            -0.688191f, -0.587785f, -0.425325f //
    };

    public static void getNormalVector(final byte i, final Vector3 store) {
        final int index = 3 * (i & 0xff);
        if (index < 0 || index > Md2Normals.NORMALS.length) {
            store.set(0, 1, 0);
        } else {
            store.set(Md2Normals.NORMALS[index + 0], Md2Normals.NORMALS[index + 1], Md2Normals.NORMALS[index + 2]);
        }
    }
}
