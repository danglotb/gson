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
public class PrettyPrintingTest_testMap_10 extends junit.framework.TestCase {
    private static final boolean DEBUG = false;

    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
    }

    public void testMap_9() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_8() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_7() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_6() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_5() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_4() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_3() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_2() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_1() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap_0() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    public void testMap() {
        java.util.Map<java.lang.String, java.lang.Integer> map = new java.util.LinkedHashMap<java.lang.String, java.lang.Integer>();
        map.put("abc", 1);
        map.put("def", 5);
        java.lang.String json = gson.toJson(map);
        junit.framework.Assert.assertEquals("{\n  \"abc\": 1,\n  \"def\": 5\n}", json);
    }

    @java.lang.SuppressWarnings("unused")
    private static class ClassWithMap {
        java.util.Map<java.lang.String, java.lang.Integer> map;

        int value = 2;
    }

    private void print(java.lang.String msg) {
        if (com.google.gson.functional.PrettyPrintingTest_testMap_10.DEBUG) {
            java.lang.System.out.println(msg);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.PrettyPrintingTest_testMap_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.PrettyPrintingTest", "testMap");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}