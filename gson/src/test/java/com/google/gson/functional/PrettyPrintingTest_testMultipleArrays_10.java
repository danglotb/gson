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
public class PrettyPrintingTest_testMultipleArrays_10 extends junit.framework.TestCase {
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
        if (com.google.gson.functional.PrettyPrintingTest_testMultipleArrays_10.DEBUG) {
            java.lang.System.out.println(msg);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.PrettyPrintingTest_testMultipleArrays_10.class) {}) {
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