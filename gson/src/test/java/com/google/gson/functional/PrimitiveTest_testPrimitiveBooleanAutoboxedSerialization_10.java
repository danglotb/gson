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
 * Functional tests for Json primitive values: integers, and floating point numbers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrimitiveTest_testPrimitiveBooleanAutoboxedSerialization_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testPrimitiveBooleanAutoboxedSerialization_9() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_8() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_7() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_6() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_5() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_4() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_3() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_2() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_1() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization_0() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    public void testPrimitiveBooleanAutoboxedSerialization() {
        junit.framework.Assert.assertEquals("true", gson.toJson(true));
        junit.framework.Assert.assertEquals("false", gson.toJson(false));
    }

    private java.lang.String extractElementFromArray(java.lang.String json) {
        return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
    }

    private static class ClassWithIntegerField {
        java.lang.Integer i;
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.PrimitiveTest_testPrimitiveBooleanAutoboxedSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.PrimitiveTest", "testPrimitiveBooleanAutoboxedSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}