/* Copyright (C) 2008 Google Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.google.gson.functional;
/**
 * Functional tests for pretty printing option.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrettyPrintingTest_testMultipleArrays_100 extends junit.framework.TestCase {
    private static final boolean DEBUG = false;

    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
    }

    @java.lang.SuppressWarnings("unused")
    private static class ClassWithMap {
        java.util.Map<java.lang.String, java.lang.Integer> map;

        int value = 2;
    }

    public void testMultipleArrays_99() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_98() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_97() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_96() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_95() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_94() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_93() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_92() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_91() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_90() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_89() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_88() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_87() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_86() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_85() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_84() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_83() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_82() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_81() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_80() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_79() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_78() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_77() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_76() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_75() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_74() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_73() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_72() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_71() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_70() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_69() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_68() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_67() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_66() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_65() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_64() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_63() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_62() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_61() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_60() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_59() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_58() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_57() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_56() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_55() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_54() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_53() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_52() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_51() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_50() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_49() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_48() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_47() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_46() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_45() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_44() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_43() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_42() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_41() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_40() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_39() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_38() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_37() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_36() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_35() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_34() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_33() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_32() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_31() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_30() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_29() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_28() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_27() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_26() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_25() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_24() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_23() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_22() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_21() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_20() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_19() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_18() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_17() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_16() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_15() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_14() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_13() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_12() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_11() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_10() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_9() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_8() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_7() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_6() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_5() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_4() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_3() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_2() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_1() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_0() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    private void print(java.lang.String msg) {
        if (com.google.gson.functional.PrettyPrintingTest_testMultipleArrays_100.DEBUG) {
            java.lang.System.out.println(msg);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.PrettyPrintingTest_testMultipleArrays_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.PrettyPrintingTest", "testMultipleArrays");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}