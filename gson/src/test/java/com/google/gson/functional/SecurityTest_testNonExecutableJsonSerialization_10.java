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
 * Tests for security-related aspects of Gson
 *
 * @author Inderjeet Singh
 */
public class SecurityTest_testNonExecutableJsonSerialization_10 extends junit.framework.TestCase {
    /**
     * Keep this in sync with Gson.JSON_NON_EXECUTABLE_PREFIX
     */
    private static final java.lang.String JSON_NON_EXECUTABLE_PREFIX = ")]}\'\n";

    private com.google.gson.GsonBuilder gsonBuilder;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gsonBuilder = new com.google.gson.GsonBuilder();
    }

    public void testNonExecutableJsonSerialization_9() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_8() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_7() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_6() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_5() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_4() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_3() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_2() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_0() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.JSON_NON_EXECUTABLE_PREFIX));
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.SecurityTest", "testNonExecutableJsonSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}