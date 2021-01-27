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
public class SecurityTest_testNonExecutableJsonSerialization_1000 extends junit.framework.TestCase {
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

    public void testNonExecutableJsonSerialization_999() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_998() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_997() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_996() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_995() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_994() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_993() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_992() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_991() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_990() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_989() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_988() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_987() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_986() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_985() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_984() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_983() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_982() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_981() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_980() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_979() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_978() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_977() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_976() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_975() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_974() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_973() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_972() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_971() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_970() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_969() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_968() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_967() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_966() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_965() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_964() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_963() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_962() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_961() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_960() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_959() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_958() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_957() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_956() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_955() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_954() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_953() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_952() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_951() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_950() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_949() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_948() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_947() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_946() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_945() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_944() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_943() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_942() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_941() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_940() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_939() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_938() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_937() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_936() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_935() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_934() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_933() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_932() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_931() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_930() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_929() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_928() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_927() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_926() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_925() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_924() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_923() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_922() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_921() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_920() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_919() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_918() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_917() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_916() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_915() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_914() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_913() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_912() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_911() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_910() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_909() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_908() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_907() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_906() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_905() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_904() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_903() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_902() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_901() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_900() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_899() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_898() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_897() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_896() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_895() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_894() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_893() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_892() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_891() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_890() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_889() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_888() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_887() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_886() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_885() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_884() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_883() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_882() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_881() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_880() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_879() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_878() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_877() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_876() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_875() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_874() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_873() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_872() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_871() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_870() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_869() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_868() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_867() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_866() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_865() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_864() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_863() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_862() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_861() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_860() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_859() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_858() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_857() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_856() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_855() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_854() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_853() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_852() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_851() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_850() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_849() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_848() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_847() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_846() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_845() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_844() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_843() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_842() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_841() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_840() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_839() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_838() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_837() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_836() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_835() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_834() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_833() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_832() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_831() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_830() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_829() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_828() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_827() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_826() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_825() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_824() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_823() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_822() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_821() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_820() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_819() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_818() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_817() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_816() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_815() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_814() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_813() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_812() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_811() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_810() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_809() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_808() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_807() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_806() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_805() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_804() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_803() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_802() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_801() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_800() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_799() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_798() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_797() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_796() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_795() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_794() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_793() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_792() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_791() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_790() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_789() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_788() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_787() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_786() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_785() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_784() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_783() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_782() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_781() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_780() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_779() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_778() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_777() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_776() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_775() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_774() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_773() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_772() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_771() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_770() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_769() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_768() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_767() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_766() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_765() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_764() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_763() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_762() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_761() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_760() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_759() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_758() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_757() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_756() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_755() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_754() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_753() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_752() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_751() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_750() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_749() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_748() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_747() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_746() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_745() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_744() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_743() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_742() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_741() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_740() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_739() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_738() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_737() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_736() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_735() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_734() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_733() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_732() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_731() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_730() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_729() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_728() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_727() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_726() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_725() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_724() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_723() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_722() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_721() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_720() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_719() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_718() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_717() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_716() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_715() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_714() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_713() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_712() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_711() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_710() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_709() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_708() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_707() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_706() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_705() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_704() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_703() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_702() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_701() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_700() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_699() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_698() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_697() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_696() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_695() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_694() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_693() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_692() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_691() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_690() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_689() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_688() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_687() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_686() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_685() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_684() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_683() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_682() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_681() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_680() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_679() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_678() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_677() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_676() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_675() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_674() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_673() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_672() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_671() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_670() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_669() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_668() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_667() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_666() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_665() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_664() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_663() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_662() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_661() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_660() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_659() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_658() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_657() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_656() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_655() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_654() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_653() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_652() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_651() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_650() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_649() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_648() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_647() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_646() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_645() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_644() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_643() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_642() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_641() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_640() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_639() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_638() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_637() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_636() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_635() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_634() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_633() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_632() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_631() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_630() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_629() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_628() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_627() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_626() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_625() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_624() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_623() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_622() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_621() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_620() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_619() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_618() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_617() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_616() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_615() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_614() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_613() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_612() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_611() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_610() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_609() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_608() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_607() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_606() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_605() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_604() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_603() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_602() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_601() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_600() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_599() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_598() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_597() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_596() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_595() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_594() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_593() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_592() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_591() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_590() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_589() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_588() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_587() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_586() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_585() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_584() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_583() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_582() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_581() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_580() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_579() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_578() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_577() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_576() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_575() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_574() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_573() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_572() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_571() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_570() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_569() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_568() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_567() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_566() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_565() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_564() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_563() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_562() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_561() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_560() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_559() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_558() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_557() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_556() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_555() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_554() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_553() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_552() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_551() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_550() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_549() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_548() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_547() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_546() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_545() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_544() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_543() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_542() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_541() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_540() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_539() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_538() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_537() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_536() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_535() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_534() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_533() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_532() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_531() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_530() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_529() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_528() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_527() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_526() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_525() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_524() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_523() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_522() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_521() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_520() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_519() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_518() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_517() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_516() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_515() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_514() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_513() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_512() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_511() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_510() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_509() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_508() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_507() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_506() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_505() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_504() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_503() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_502() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_501() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_500() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_499() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_498() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_497() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_496() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_495() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_494() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_493() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_492() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_491() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_490() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_489() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_488() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_487() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_486() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_485() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_484() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_483() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_482() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_481() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_480() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_479() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_478() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_477() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_476() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_475() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_474() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_473() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_472() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_471() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_470() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_469() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_468() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_467() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_466() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_465() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_464() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_463() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_462() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_461() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_460() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_459() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_458() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_457() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_456() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_455() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_454() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_453() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_452() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_451() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_450() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_449() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_448() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_447() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_446() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_445() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_444() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_443() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_442() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_441() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_440() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_439() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_438() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_437() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_436() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_435() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_434() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_433() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_432() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_431() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_430() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_429() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_428() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_427() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_426() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_425() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_424() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_423() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_422() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_421() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_420() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_419() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_418() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_417() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_416() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_415() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_414() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_413() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_412() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_411() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_410() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_409() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_408() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_407() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_406() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_405() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_404() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_403() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_402() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_401() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_400() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_399() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_398() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_397() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_396() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_395() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_394() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_393() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_392() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_391() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_390() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_389() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_388() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_387() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_386() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_385() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_384() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_383() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_382() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_381() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_380() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_379() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_378() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_377() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_376() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_375() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_374() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_373() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_372() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_371() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_370() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_369() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_368() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_367() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_366() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_365() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_364() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_363() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_362() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_361() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_360() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_359() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_358() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_357() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_356() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_355() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_354() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_353() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_352() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_351() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_350() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_349() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_348() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_347() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_346() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_345() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_344() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_343() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_342() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_341() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_340() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_339() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_338() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_337() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_336() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_335() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_334() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_333() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_332() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_331() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_330() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_329() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_328() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_327() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_326() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_325() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_324() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_323() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_322() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_321() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_320() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_319() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_318() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_317() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_316() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_315() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_314() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_313() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_312() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_311() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_310() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_309() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_308() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_307() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_306() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_305() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_304() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_303() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_302() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_301() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_300() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_299() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_298() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_297() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_296() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_295() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_294() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_293() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_292() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_291() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_290() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_289() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_288() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_287() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_286() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_285() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_284() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_283() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_282() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_281() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_280() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_279() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_278() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_277() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_276() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_275() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_274() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_273() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_272() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_271() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_270() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_269() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_268() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_267() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_266() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_265() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_264() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_263() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_262() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_261() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_260() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_259() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_258() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_257() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_256() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_255() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_254() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_253() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_252() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_251() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_250() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_249() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_248() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_247() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_246() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_245() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_244() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_243() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_242() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_241() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_240() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_239() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_238() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_237() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_236() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_235() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_234() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_233() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_232() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_231() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_230() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_229() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_228() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_227() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_226() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_225() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_224() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_223() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_222() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_221() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_220() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_219() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_218() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_217() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_216() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_215() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_214() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_213() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_212() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_211() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_210() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_209() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_208() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_207() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_206() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_205() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_204() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_203() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_202() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_201() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_200() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_199() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_198() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_197() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_196() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_195() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_194() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_193() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_192() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_191() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_190() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_189() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_188() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_187() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_186() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_185() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_184() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_183() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_182() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_181() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_180() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_179() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_178() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_177() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_176() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_175() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_174() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_173() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_172() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_171() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_170() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_169() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_168() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_167() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_166() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_165() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_164() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_163() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_162() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_161() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_160() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_159() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_158() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_157() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_156() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_155() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_154() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_153() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_152() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_151() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_150() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_149() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_148() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_147() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_146() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_145() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_144() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_143() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_142() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_141() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_140() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_139() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_138() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_137() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_136() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_135() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_134() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_133() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_132() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_131() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_130() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_129() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_128() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_127() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_126() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_125() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_124() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_123() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_122() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_121() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_120() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_119() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_118() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_117() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_116() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_115() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_114() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_113() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_112() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_111() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_110() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_109() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_108() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_107() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_106() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_105() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_104() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_103() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_102() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_101() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_100() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_99() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_98() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_97() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_96() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_95() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_94() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_93() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_92() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_91() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_90() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_89() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_88() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_87() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_86() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_85() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_84() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_83() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_82() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_81() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_80() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_79() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_78() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_77() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_76() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_75() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_74() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_73() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_72() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_71() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_70() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_69() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_68() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_67() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_66() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_65() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_64() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_63() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_62() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_61() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_60() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_59() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_58() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_57() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_56() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_55() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_54() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_53() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_52() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_51() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_50() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_49() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_48() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_47() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_46() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_45() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_44() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_43() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_42() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_41() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_40() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_39() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_38() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_37() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_36() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_35() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_34() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_33() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_32() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_31() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_30() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_29() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_28() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_27() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_26() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_25() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_24() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_23() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_22() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_21() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_20() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_19() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_18() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_17() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_16() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_15() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_14() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_13() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_12() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_11() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_10() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_9() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_8() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_7() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_6() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_5() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_4() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_3() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_2() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_0() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_1000.class) {}) {
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