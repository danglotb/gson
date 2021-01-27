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
public class SecurityTest_testNonExecutableJsonSerialization_100 extends junit.framework.TestCase {
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

    public void testNonExecutableJsonSerialization_99() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_98() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_97() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_96() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_95() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_94() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_93() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_92() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_91() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_90() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_89() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_88() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_87() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_86() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_85() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_84() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_83() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_82() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_81() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_80() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_79() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_78() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_77() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_76() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_75() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_74() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_73() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_72() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_71() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_70() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_69() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_68() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_67() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_66() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_65() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_64() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_63() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_62() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_61() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_60() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_59() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_58() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_57() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_56() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_55() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_54() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_53() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_52() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_51() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_50() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_49() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_48() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_47() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_46() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_45() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_44() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_43() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_42() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_41() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_40() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_39() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_38() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_37() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_36() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_35() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_34() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_33() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_32() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_31() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_30() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_29() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_28() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_27() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_26() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_25() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_24() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_23() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_22() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_21() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_20() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_19() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_18() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_17() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_16() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_15() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_14() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_13() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_12() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_11() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_10() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_9() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_8() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_7() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_6() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_5() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_4() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_3() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_2() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_0() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.JSON_NON_EXECUTABLE_PREFIX));
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_100.class) {}) {
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