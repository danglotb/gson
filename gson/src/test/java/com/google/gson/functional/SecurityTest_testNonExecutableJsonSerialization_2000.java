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
public class SecurityTest_testNonExecutableJsonSerialization_2000 extends junit.framework.TestCase {
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

    public void testNonExecutableJsonSerialization_1999() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1998() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1997() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1996() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1995() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1994() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1993() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1992() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1991() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1990() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1989() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1988() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1987() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1986() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1985() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1984() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1983() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1982() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1981() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1980() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1979() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1978() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1977() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1976() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1975() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1974() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1973() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1972() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1971() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1970() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1969() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1968() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1967() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1966() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1965() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1964() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1963() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1962() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1961() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1960() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1959() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1958() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1957() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1956() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1955() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1954() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1953() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1952() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1951() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1950() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1949() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1948() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1947() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1946() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1945() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1944() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1943() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1942() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1941() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1940() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1939() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1938() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1937() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1936() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1935() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1934() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1933() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1932() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1931() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1930() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1929() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1928() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1927() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1926() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1925() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1924() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1923() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1922() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1921() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1920() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1919() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1918() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1917() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1916() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1915() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1914() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1913() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1912() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1911() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1910() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1909() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1908() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1907() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1906() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1905() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1904() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1903() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1902() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1901() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1900() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1899() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1898() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1897() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1896() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1895() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1894() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1893() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1892() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1891() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1890() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1889() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1888() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1887() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1886() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1885() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1884() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1883() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1882() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1881() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1880() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1879() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1878() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1877() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1876() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1875() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1874() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1873() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1872() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1871() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1870() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1869() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1868() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1867() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1866() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1865() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1864() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1863() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1862() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1861() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1860() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1859() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1858() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1857() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1856() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1855() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1854() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1853() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1852() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1851() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1850() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1849() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1848() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1847() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1846() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1845() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1844() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1843() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1842() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1841() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1840() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1839() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1838() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1837() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1836() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1835() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1834() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1833() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1832() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1831() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1830() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1829() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1828() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1827() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1826() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1825() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1824() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1823() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1822() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1821() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1820() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1819() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1818() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1817() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1816() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1815() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1814() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1813() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1812() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1811() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1810() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1809() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1808() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1807() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1806() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1805() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1804() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1803() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1802() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1801() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1800() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1799() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1798() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1797() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1796() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1795() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1794() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1793() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1792() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1791() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1790() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1789() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1788() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1787() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1786() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1785() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1784() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1783() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1782() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1781() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1780() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1779() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1778() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1777() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1776() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1775() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1774() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1773() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1772() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1771() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1770() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1769() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1768() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1767() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1766() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1765() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1764() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1763() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1762() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1761() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1760() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1759() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1758() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1757() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1756() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1755() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1754() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1753() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1752() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1751() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1750() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1749() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1748() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1747() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1746() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1745() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1744() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1743() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1742() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1741() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1740() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1739() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1738() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1737() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1736() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1735() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1734() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1733() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1732() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1731() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1730() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1729() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1728() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1727() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1726() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1725() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1724() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1723() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1722() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1721() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1720() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1719() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1718() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1717() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1716() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1715() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1714() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1713() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1712() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1711() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1710() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1709() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1708() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1707() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1706() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1705() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1704() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1703() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1702() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1701() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1700() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1699() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1698() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1697() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1696() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1695() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1694() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1693() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1692() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1691() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1690() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1689() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1688() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1687() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1686() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1685() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1684() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1683() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1682() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1681() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1680() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1679() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1678() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1677() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1676() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1675() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1674() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1673() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1672() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1671() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1670() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1669() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1668() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1667() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1666() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1665() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1664() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1663() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1662() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1661() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1660() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1659() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1658() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1657() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1656() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1655() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1654() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1653() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1652() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1651() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1650() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1649() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1648() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1647() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1646() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1645() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1644() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1643() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1642() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1641() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1640() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1639() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1638() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1637() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1636() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1635() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1634() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1633() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1632() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1631() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1630() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1629() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1628() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1627() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1626() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1625() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1624() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1623() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1622() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1621() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1620() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1619() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1618() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1617() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1616() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1615() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1614() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1613() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1612() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1611() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1610() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1609() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1608() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1607() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1606() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1605() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1604() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1603() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1602() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1601() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1600() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1599() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1598() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1597() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1596() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1595() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1594() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1593() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1592() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1591() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1590() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1589() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1588() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1587() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1586() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1585() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1584() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1583() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1582() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1581() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1580() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1579() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1578() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1577() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1576() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1575() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1574() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1573() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1572() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1571() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1570() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1569() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1568() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1567() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1566() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1565() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1564() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1563() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1562() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1561() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1560() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1559() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1558() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1557() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1556() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1555() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1554() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1553() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1552() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1551() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1550() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1549() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1548() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1547() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1546() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1545() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1544() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1543() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1542() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1541() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1540() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1539() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1538() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1537() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1536() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1535() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1534() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1533() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1532() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1531() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1530() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1529() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1528() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1527() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1526() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1525() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1524() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1523() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1522() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1521() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1520() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1519() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1518() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1517() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1516() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1515() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1514() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1513() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1512() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1511() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1510() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1509() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1508() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1507() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1506() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1505() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1504() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1503() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1502() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1501() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1500() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1499() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1498() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1497() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1496() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1495() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1494() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1493() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1492() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1491() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1490() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1489() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1488() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1487() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1486() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1485() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1484() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1483() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1482() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1481() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1480() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1479() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1478() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1477() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1476() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1475() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1474() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1473() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1472() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1471() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1470() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1469() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1468() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1467() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1466() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1465() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1464() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1463() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1462() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1461() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1460() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1459() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1458() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1457() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1456() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1455() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1454() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1453() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1452() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1451() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1450() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1449() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1448() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1447() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1446() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1445() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1444() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1443() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1442() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1441() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1440() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1439() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1438() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1437() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1436() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1435() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1434() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1433() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1432() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1431() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1430() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1429() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1428() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1427() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1426() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1425() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1424() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1423() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1422() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1421() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1420() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1419() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1418() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1417() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1416() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1415() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1414() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1413() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1412() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1411() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1410() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1409() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1408() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1407() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1406() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1405() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1404() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1403() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1402() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1401() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1400() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1399() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1398() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1397() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1396() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1395() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1394() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1393() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1392() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1391() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1390() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1389() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1388() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1387() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1386() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1385() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1384() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1383() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1382() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1381() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1380() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1379() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1378() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1377() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1376() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1375() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1374() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1373() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1372() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1371() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1370() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1369() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1368() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1367() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1366() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1365() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1364() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1363() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1362() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1361() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1360() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1359() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1358() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1357() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1356() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1355() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1354() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1353() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1352() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1351() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1350() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1349() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1348() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1347() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1346() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1345() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1344() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1343() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1342() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1341() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1340() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1339() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1338() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1337() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1336() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1335() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1334() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1333() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1332() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1331() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1330() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1329() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1328() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1327() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1326() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1325() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1324() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1323() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1322() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1321() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1320() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1319() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1318() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1317() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1316() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1315() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1314() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1313() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1312() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1311() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1310() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1309() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1308() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1307() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1306() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1305() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1304() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1303() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1302() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1301() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1300() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1299() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1298() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1297() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1296() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1295() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1294() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1293() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1292() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1291() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1290() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1289() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1288() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1287() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1286() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1285() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1284() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1283() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1282() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1281() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1280() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1279() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1278() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1277() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1276() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1275() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1274() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1273() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1272() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1271() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1270() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1269() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1268() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1267() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1266() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1265() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1264() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1263() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1262() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1261() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1260() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1259() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1258() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1257() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1256() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1255() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1254() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1253() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1252() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1251() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1250() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1249() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1248() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1247() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1246() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1245() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1244() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1243() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1242() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1241() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1240() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1239() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1238() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1237() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1236() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1235() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1234() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1233() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1232() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1231() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1230() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1229() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1228() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1227() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1226() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1225() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1224() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1223() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1222() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1221() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1220() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1219() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1218() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1217() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1216() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1215() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1214() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1213() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1212() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1211() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1210() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1209() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1208() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1207() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1206() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1205() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1204() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1203() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1202() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1201() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1200() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1199() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1198() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1197() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1196() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1195() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1194() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1193() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1192() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1191() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1190() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1189() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1188() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1187() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1186() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1185() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1184() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1183() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1182() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1181() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1180() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1179() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1178() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1177() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1176() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1175() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1174() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1173() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1172() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1171() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1170() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1169() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1168() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1167() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1166() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1165() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1164() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1163() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1162() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1161() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1160() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1159() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1158() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1157() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1156() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1155() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1154() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1153() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1152() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1151() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1150() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1149() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1148() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1147() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1146() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1145() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1144() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1143() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1142() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1141() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1140() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1139() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1138() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1137() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1136() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1135() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1134() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1133() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1132() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1131() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1130() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1129() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1128() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1127() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1126() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1125() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1124() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1123() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1122() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1121() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1120() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1119() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1118() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1117() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1116() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1115() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1114() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1113() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1112() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1111() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1110() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1109() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1108() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1107() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1106() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1105() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1104() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1103() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1102() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1101() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1100() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1099() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1098() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1097() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1096() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1095() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1094() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1093() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1092() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1091() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1090() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1089() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1088() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1087() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1086() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1085() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1084() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1083() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1082() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1081() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1080() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1079() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1078() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1077() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1076() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1075() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1074() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1073() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1072() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1071() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1070() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1069() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1068() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1067() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1066() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1065() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1064() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1063() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1062() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1061() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1060() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1059() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1058() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1057() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1056() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1055() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1054() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1053() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1052() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1051() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1050() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1049() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1048() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1047() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1046() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1045() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1044() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1043() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1042() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1041() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1040() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1039() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1038() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1037() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1036() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1035() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1034() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1033() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1032() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1031() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1030() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1029() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1028() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1027() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1026() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1025() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1024() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1023() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1022() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1021() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1020() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1019() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1018() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1017() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1016() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1015() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1014() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1013() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1012() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1011() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1010() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1009() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1008() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1007() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1006() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1005() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1004() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1003() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1002() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1001() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1000() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_999() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_998() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_997() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_996() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_995() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_994() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_993() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_992() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_991() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_990() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_989() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_988() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_987() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_986() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_985() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_984() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_983() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_982() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_981() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_980() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_979() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_978() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_977() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_976() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_975() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_974() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_973() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_972() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_971() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_970() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_969() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_968() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_967() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_966() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_965() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_964() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_963() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_962() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_961() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_960() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_959() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_958() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_957() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_956() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_955() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_954() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_953() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_952() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_951() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_950() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_949() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_948() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_947() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_946() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_945() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_944() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_943() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_942() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_941() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_940() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_939() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_938() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_937() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_936() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_935() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_934() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_933() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_932() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_931() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_930() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_929() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_928() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_927() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_926() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_925() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_924() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_923() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_922() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_921() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_920() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_919() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_918() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_917() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_916() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_915() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_914() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_913() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_912() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_911() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_910() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_909() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_908() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_907() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_906() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_905() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_904() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_903() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_902() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_901() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_900() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_899() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_898() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_897() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_896() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_895() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_894() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_893() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_892() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_891() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_890() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_889() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_888() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_887() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_886() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_885() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_884() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_883() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_882() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_881() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_880() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_879() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_878() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_877() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_876() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_875() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_874() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_873() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_872() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_871() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_870() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_869() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_868() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_867() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_866() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_865() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_864() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_863() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_862() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_861() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_860() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_859() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_858() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_857() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_856() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_855() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_854() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_853() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_852() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_851() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_850() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_849() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_848() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_847() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_846() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_845() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_844() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_843() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_842() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_841() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_840() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_839() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_838() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_837() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_836() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_835() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_834() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_833() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_832() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_831() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_830() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_829() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_828() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_827() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_826() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_825() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_824() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_823() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_822() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_821() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_820() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_819() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_818() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_817() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_816() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_815() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_814() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_813() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_812() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_811() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_810() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_809() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_808() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_807() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_806() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_805() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_804() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_803() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_802() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_801() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_800() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_799() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_798() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_797() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_796() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_795() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_794() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_793() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_792() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_791() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_790() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_789() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_788() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_787() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_786() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_785() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_784() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_783() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_782() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_781() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_780() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_779() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_778() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_777() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_776() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_775() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_774() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_773() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_772() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_771() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_770() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_769() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_768() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_767() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_766() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_765() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_764() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_763() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_762() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_761() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_760() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_759() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_758() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_757() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_756() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_755() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_754() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_753() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_752() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_751() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_750() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_749() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_748() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_747() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_746() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_745() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_744() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_743() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_742() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_741() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_740() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_739() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_738() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_737() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_736() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_735() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_734() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_733() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_732() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_731() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_730() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_729() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_728() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_727() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_726() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_725() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_724() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_723() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_722() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_721() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_720() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_719() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_718() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_717() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_716() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_715() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_714() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_713() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_712() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_711() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_710() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_709() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_708() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_707() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_706() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_705() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_704() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_703() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_702() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_701() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_700() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_699() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_698() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_697() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_696() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_695() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_694() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_693() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_692() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_691() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_690() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_689() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_688() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_687() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_686() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_685() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_684() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_683() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_682() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_681() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_680() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_679() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_678() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_677() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_676() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_675() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_674() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_673() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_672() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_671() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_670() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_669() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_668() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_667() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_666() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_665() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_664() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_663() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_662() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_661() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_660() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_659() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_658() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_657() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_656() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_655() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_654() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_653() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_652() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_651() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_650() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_649() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_648() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_647() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_646() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_645() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_644() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_643() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_642() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_641() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_640() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_639() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_638() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_637() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_636() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_635() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_634() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_633() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_632() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_631() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_630() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_629() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_628() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_627() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_626() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_625() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_624() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_623() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_622() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_621() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_620() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_619() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_618() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_617() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_616() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_615() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_614() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_613() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_612() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_611() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_610() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_609() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_608() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_607() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_606() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_605() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_604() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_603() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_602() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_601() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_600() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_599() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_598() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_597() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_596() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_595() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_594() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_593() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_592() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_591() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_590() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_589() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_588() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_587() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_586() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_585() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_584() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_583() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_582() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_581() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_580() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_579() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_578() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_577() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_576() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_575() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_574() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_573() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_572() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_571() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_570() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_569() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_568() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_567() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_566() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_565() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_564() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_563() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_562() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_561() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_560() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_559() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_558() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_557() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_556() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_555() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_554() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_553() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_552() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_551() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_550() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_549() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_548() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_547() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_546() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_545() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_544() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_543() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_542() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_541() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_540() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_539() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_538() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_537() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_536() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_535() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_534() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_533() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_532() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_531() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_530() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_529() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_528() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_527() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_526() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_525() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_524() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_523() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_522() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_521() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_520() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_519() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_518() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_517() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_516() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_515() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_514() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_513() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_512() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_511() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_510() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_509() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_508() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_507() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_506() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_505() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_504() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_503() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_502() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_501() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_500() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_499() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_498() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_497() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_496() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_495() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_494() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_493() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_492() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_491() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_490() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_489() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_488() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_487() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_486() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_485() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_484() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_483() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_482() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_481() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_480() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_479() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_478() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_477() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_476() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_475() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_474() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_473() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_472() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_471() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_470() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_469() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_468() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_467() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_466() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_465() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_464() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_463() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_462() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_461() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_460() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_459() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_458() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_457() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_456() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_455() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_454() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_453() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_452() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_451() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_450() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_449() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_448() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_447() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_446() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_445() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_444() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_443() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_442() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_441() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_440() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_439() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_438() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_437() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_436() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_435() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_434() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_433() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_432() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_431() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_430() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_429() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_428() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_427() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_426() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_425() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_424() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_423() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_422() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_421() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_420() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_419() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_418() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_417() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_416() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_415() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_414() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_413() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_412() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_411() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_410() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_409() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_408() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_407() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_406() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_405() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_404() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_403() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_402() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_401() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_400() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_399() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_398() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_397() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_396() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_395() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_394() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_393() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_392() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_391() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_390() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_389() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_388() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_387() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_386() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_385() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_384() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_383() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_382() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_381() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_380() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_379() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_378() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_377() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_376() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_375() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_374() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_373() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_372() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_371() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_370() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_369() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_368() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_367() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_366() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_365() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_364() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_363() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_362() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_361() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_360() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_359() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_358() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_357() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_356() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_355() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_354() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_353() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_352() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_351() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_350() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_349() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_348() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_347() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_346() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_345() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_344() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_343() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_342() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_341() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_340() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_339() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_338() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_337() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_336() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_335() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_334() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_333() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_332() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_331() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_330() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_329() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_328() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_327() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_326() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_325() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_324() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_323() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_322() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_321() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_320() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_319() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_318() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_317() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_316() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_315() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_314() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_313() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_312() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_311() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_310() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_309() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_308() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_307() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_306() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_305() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_304() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_303() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_302() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_301() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_300() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_299() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_298() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_297() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_296() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_295() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_294() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_293() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_292() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_291() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_290() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_289() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_288() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_287() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_286() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_285() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_284() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_283() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_282() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_281() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_280() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_279() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_278() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_277() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_276() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_275() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_274() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_273() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_272() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_271() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_270() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_269() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_268() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_267() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_266() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_265() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_264() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_263() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_262() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_261() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_260() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_259() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_258() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_257() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_256() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_255() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_254() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_253() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_252() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_251() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_250() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_249() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_248() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_247() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_246() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_245() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_244() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_243() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_242() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_241() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_240() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_239() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_238() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_237() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_236() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_235() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_234() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_233() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_232() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_231() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_230() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_229() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_228() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_227() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_226() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_225() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_224() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_223() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_222() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_221() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_220() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_219() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_218() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_217() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_216() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_215() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_214() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_213() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_212() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_211() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_210() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_209() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_208() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_207() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_206() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_205() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_204() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_203() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_202() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_201() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_200() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_199() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_198() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_197() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_196() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_195() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_194() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_193() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_192() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_191() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_190() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_189() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_188() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_187() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_186() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_185() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_184() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_183() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_182() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_181() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_180() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_179() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_178() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_177() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_176() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_175() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_174() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_173() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_172() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_171() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_170() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_169() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_168() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_167() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_166() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_165() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_164() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_163() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_162() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_161() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_160() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_159() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_158() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_157() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_156() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_155() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_154() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_153() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_152() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_151() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_150() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_149() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_148() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_147() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_146() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_145() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_144() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_143() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_142() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_141() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_140() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_139() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_138() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_137() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_136() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_135() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_134() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_133() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_132() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_131() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_130() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_129() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_128() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_127() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_126() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_125() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_124() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_123() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_122() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_121() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_120() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_119() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_118() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_117() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_116() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_115() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_114() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_113() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_112() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_111() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_110() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_109() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_108() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_107() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_106() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_105() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_104() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_103() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_102() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_101() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_100() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_99() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_98() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_97() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_96() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_95() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_94() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_93() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_92() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_91() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_90() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_89() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_88() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_87() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_86() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_85() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_84() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_83() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_82() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_81() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_80() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_79() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_78() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_77() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_76() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_75() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_74() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_73() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_72() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_71() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_70() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_69() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_68() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_67() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_66() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_65() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_64() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_63() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_62() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_61() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_60() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_59() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_58() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_57() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_56() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_55() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_54() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_53() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_52() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_51() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_50() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_49() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_48() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_47() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_46() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_45() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_44() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_43() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_42() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_41() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_40() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_39() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_38() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_37() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_36() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_35() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_34() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_33() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_32() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_31() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_30() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_29() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_28() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_27() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_26() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_25() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_24() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_23() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_22() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_21() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_20() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_19() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_18() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_17() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_16() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_15() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_14() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_13() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_12() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_11() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_10() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_9() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_8() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_7() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_6() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_5() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_4() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_3() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_2() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_1() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization_0() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public void testNonExecutableJsonSerialization() {
        com.google.gson.Gson gson = gsonBuilder.generateNonExecutableJson().create();
        java.lang.String json = gson.toJson(new com.google.gson.common.TestTypes.BagOfPrimitives());
        junit.framework.Assert.assertTrue(json.startsWith(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.JSON_NON_EXECUTABLE_PREFIX));
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.SecurityTest_testNonExecutableJsonSerialization_2000.class) {}) {
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