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
public class PrettyPrintingTest_testMultipleArrays_1000 extends junit.framework.TestCase {
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

    public void testMultipleArrays_999() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_998() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_997() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_996() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_995() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_994() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_993() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_992() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_991() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_990() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_989() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_988() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_987() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_986() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_985() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_984() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_983() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_982() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_981() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_980() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_979() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_978() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_977() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_976() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_975() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_974() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_973() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_972() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_971() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_970() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_969() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_968() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_967() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_966() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_965() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_964() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_963() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_962() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_961() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_960() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_959() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_958() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_957() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_956() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_955() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_954() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_953() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_952() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_951() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_950() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_949() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_948() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_947() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_946() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_945() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_944() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_943() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_942() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_941() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_940() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_939() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_938() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_937() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_936() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_935() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_934() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_933() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_932() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_931() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_930() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_929() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_928() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_927() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_926() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_925() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_924() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_923() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_922() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_921() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_920() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_919() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_918() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_917() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_916() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_915() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_914() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_913() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_912() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_911() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_910() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_909() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_908() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_907() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_906() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_905() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_904() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_903() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_902() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_901() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_900() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_899() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_898() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_897() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_896() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_895() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_894() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_893() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_892() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_891() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_890() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_889() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_888() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_887() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_886() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_885() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_884() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_883() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_882() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_881() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_880() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_879() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_878() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_877() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_876() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_875() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_874() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_873() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_872() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_871() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_870() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_869() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_868() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_867() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_866() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_865() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_864() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_863() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_862() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_861() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_860() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_859() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_858() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_857() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_856() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_855() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_854() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_853() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_852() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_851() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_850() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_849() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_848() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_847() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_846() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_845() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_844() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_843() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_842() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_841() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_840() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_839() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_838() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_837() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_836() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_835() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_834() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_833() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_832() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_831() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_830() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_829() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_828() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_827() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_826() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_825() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_824() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_823() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_822() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_821() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_820() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_819() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_818() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_817() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_816() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_815() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_814() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_813() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_812() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_811() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_810() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_809() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_808() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_807() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_806() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_805() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_804() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_803() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_802() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_801() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_800() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_799() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_798() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_797() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_796() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_795() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_794() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_793() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_792() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_791() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_790() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_789() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_788() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_787() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_786() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_785() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_784() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_783() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_782() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_781() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_780() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_779() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_778() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_777() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_776() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_775() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_774() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_773() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_772() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_771() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_770() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_769() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_768() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_767() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_766() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_765() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_764() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_763() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_762() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_761() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_760() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_759() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_758() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_757() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_756() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_755() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_754() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_753() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_752() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_751() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_750() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_749() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_748() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_747() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_746() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_745() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_744() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_743() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_742() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_741() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_740() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_739() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_738() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_737() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_736() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_735() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_734() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_733() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_732() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_731() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_730() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_729() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_728() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_727() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_726() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_725() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_724() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_723() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_722() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_721() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_720() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_719() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_718() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_717() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_716() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_715() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_714() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_713() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_712() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_711() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_710() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_709() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_708() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_707() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_706() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_705() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_704() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_703() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_702() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_701() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_700() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_699() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_698() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_697() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_696() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_695() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_694() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_693() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_692() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_691() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_690() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_689() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_688() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_687() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_686() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_685() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_684() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_683() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_682() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_681() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_680() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_679() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_678() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_677() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_676() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_675() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_674() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_673() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_672() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_671() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_670() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_669() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_668() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_667() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_666() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_665() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_664() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_663() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_662() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_661() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_660() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_659() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_658() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_657() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_656() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_655() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_654() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_653() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_652() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_651() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_650() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_649() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_648() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_647() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_646() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_645() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_644() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_643() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_642() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_641() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_640() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_639() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_638() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_637() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_636() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_635() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_634() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_633() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_632() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_631() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_630() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_629() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_628() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_627() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_626() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_625() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_624() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_623() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_622() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_621() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_620() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_619() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_618() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_617() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_616() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_615() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_614() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_613() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_612() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_611() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_610() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_609() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_608() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_607() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_606() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_605() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_604() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_603() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_602() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_601() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_600() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_599() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_598() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_597() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_596() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_595() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_594() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_593() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_592() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_591() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_590() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_589() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_588() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_587() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_586() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_585() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_584() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_583() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_582() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_581() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_580() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_579() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_578() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_577() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_576() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_575() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_574() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_573() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_572() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_571() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_570() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_569() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_568() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_567() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_566() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_565() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_564() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_563() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_562() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_561() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_560() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_559() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_558() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_557() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_556() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_555() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_554() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_553() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_552() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_551() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_550() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_549() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_548() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_547() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_546() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_545() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_544() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_543() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_542() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_541() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_540() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_539() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_538() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_537() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_536() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_535() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_534() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_533() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_532() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_531() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_530() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_529() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_528() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_527() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_526() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_525() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_524() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_523() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_522() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_521() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_520() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_519() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_518() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_517() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_516() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_515() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_514() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_513() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_512() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_511() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_510() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_509() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_508() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_507() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_506() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_505() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_504() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_503() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_502() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_501() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_500() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_499() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_498() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_497() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_496() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_495() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_494() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_493() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_492() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_491() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_490() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_489() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_488() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_487() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_486() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_485() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_484() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_483() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_482() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_481() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_480() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_479() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_478() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_477() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_476() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_475() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_474() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_473() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_472() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_471() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_470() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_469() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_468() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_467() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_466() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_465() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_464() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_463() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_462() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_461() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_460() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_459() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_458() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_457() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_456() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_455() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_454() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_453() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_452() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_451() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_450() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_449() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_448() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_447() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_446() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_445() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_444() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_443() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_442() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_441() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_440() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_439() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_438() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_437() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_436() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_435() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_434() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_433() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_432() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_431() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_430() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_429() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_428() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_427() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_426() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_425() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_424() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_423() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_422() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_421() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_420() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_419() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_418() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_417() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_416() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_415() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_414() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_413() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_412() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_411() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_410() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_409() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_408() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_407() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_406() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_405() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_404() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_403() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_402() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_401() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_400() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_399() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_398() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_397() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_396() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_395() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_394() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_393() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_392() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_391() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_390() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_389() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_388() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_387() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_386() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_385() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_384() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_383() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_382() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_381() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_380() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_379() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_378() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_377() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_376() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_375() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_374() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_373() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_372() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_371() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_370() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_369() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_368() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_367() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_366() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_365() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_364() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_363() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_362() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_361() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_360() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_359() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_358() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_357() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_356() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_355() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_354() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_353() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_352() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_351() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_350() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_349() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_348() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_347() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_346() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_345() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_344() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_343() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_342() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_341() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_340() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_339() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_338() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_337() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_336() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_335() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_334() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_333() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_332() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_331() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_330() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_329() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_328() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_327() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_326() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_325() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_324() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_323() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_322() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_321() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_320() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_319() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_318() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_317() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_316() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_315() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_314() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_313() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_312() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_311() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_310() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_309() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_308() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_307() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_306() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_305() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_304() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_303() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_302() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_301() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_300() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_299() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_298() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_297() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_296() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_295() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_294() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_293() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_292() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_291() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_290() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_289() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_288() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_287() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_286() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_285() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_284() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_283() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_282() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_281() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_280() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_279() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_278() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_277() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_276() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_275() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_274() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_273() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_272() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_271() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_270() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_269() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_268() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_267() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_266() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_265() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_264() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_263() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_262() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_261() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_260() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_259() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_258() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_257() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_256() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_255() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_254() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_253() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_252() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_251() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_250() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_249() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_248() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_247() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_246() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_245() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_244() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_243() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_242() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_241() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_240() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_239() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_238() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_237() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_236() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_235() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_234() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_233() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_232() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_231() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_230() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_229() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_228() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_227() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_226() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_225() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_224() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_223() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_222() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_221() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_220() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_219() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_218() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_217() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_216() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_215() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_214() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_213() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_212() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_211() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_210() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_209() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_208() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_207() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_206() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_205() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_204() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_203() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_202() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_201() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_200() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_199() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_198() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_197() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_196() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_195() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_194() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_193() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_192() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_191() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_190() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_189() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_188() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_187() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_186() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_185() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_184() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_183() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_182() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_181() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_180() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_179() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_178() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_177() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_176() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_175() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_174() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_173() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_172() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_171() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_170() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_169() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_168() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_167() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_166() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_165() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_164() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_163() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_162() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_161() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_160() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_159() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_158() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_157() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_156() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_155() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_154() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_153() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_152() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_151() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_150() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_149() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_148() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_147() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_146() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_145() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_144() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_143() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_142() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_141() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_140() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_139() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_138() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_137() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_136() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_135() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_134() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_133() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_132() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_131() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_130() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_129() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_128() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_127() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_126() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_125() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_124() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_123() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_122() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_121() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_120() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_119() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_118() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_117() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_116() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_115() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_114() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_113() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_112() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_111() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_110() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_109() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_108() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_107() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_106() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_105() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_104() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_103() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_102() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_101() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
    }

    public void testMultipleArrays_100() {
        int[][][] ints = new int[][][]{ new int[][]{ new int[]{ 1 }, new int[]{ 2 } } };
        java.lang.String json = gson.toJson(ints);
        junit.framework.Assert.assertEquals("[\n  [\n    [\n      1\n    ],\n    [\n      2\n    ]\n  ]\n]", json);
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
        if (com.google.gson.functional.PrettyPrintingTest_testMultipleArrays_1000.DEBUG) {
            java.lang.System.out.println(msg);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.PrettyPrintingTest_testMultipleArrays_1000.class) {}) {
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