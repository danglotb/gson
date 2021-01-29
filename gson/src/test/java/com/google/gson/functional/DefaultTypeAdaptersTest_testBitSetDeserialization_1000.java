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
 * Functional test for Json serialization and deserialization for common classes for which default
 * support is provided in Gson. The tests for Map types are available in {@link MapTest}.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class DefaultTypeAdaptersTest_testBitSetDeserialization_1000 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    private java.util.TimeZone oldTimeZone;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        this.oldTimeZone = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("America/Los_Angeles"));
        java.util.Locale.setDefault(java.util.Locale.US);
        gson = new com.google.gson.Gson();
    }

    @java.lang.Override
    protected void tearDown() throws java.lang.Exception {
        java.util.TimeZone.setDefault(oldTimeZone);
        super.tearDown();
    }

    private static class ClassWithUrlField {
        java.net.URL url;
    }

    public void testBitSetDeserialization_999() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_998() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_997() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_996() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_995() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_994() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_993() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_992() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_991() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_990() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_989() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_988() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_987() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_986() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_985() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_984() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_983() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_982() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_981() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_980() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_979() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_978() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_977() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_976() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_975() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_974() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_973() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_972() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_971() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_970() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_969() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_968() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_967() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_966() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_965() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_964() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_963() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_962() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_961() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_960() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_959() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_958() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_957() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_956() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_955() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_954() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_953() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_952() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_951() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_950() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_949() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_948() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_947() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_946() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_945() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_944() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_943() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_942() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_941() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_940() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_939() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_938() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_937() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_936() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_935() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_934() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_933() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_932() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_931() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_930() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_929() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_928() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_927() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_926() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_925() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_924() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_923() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_922() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_921() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_920() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_919() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_918() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_917() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_916() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_915() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_914() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_913() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_912() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_911() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_910() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_909() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_908() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_907() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_906() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_905() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_904() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_903() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_902() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_901() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_900() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_899() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_898() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_897() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_896() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_895() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_894() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_893() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_892() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_891() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_890() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_889() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_888() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_887() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_886() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_885() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_884() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_883() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_882() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_881() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_880() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_879() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_878() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_877() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_876() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_875() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_874() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_873() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_872() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_871() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_870() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_869() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_868() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_867() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_866() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_865() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_864() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_863() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_862() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_861() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_860() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_859() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_858() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_857() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_856() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_855() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_854() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_853() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_852() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_851() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_850() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_849() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_848() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_847() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_846() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_845() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_844() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_843() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_842() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_841() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_840() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_839() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_838() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_837() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_836() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_835() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_834() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_833() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_832() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_831() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_830() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_829() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_828() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_827() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_826() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_825() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_824() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_823() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_822() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_821() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_820() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_819() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_818() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_817() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_816() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_815() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_814() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_813() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_812() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_811() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_810() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_809() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_808() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_807() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_806() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_805() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_804() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_803() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_802() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_801() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_800() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_799() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_798() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_797() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_796() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_795() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_794() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_793() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_792() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_791() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_790() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_789() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_788() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_787() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_786() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_785() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_784() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_783() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_782() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_781() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_780() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_779() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_778() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_777() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_776() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_775() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_774() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_773() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_772() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_771() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_770() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_769() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_768() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_767() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_766() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_765() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_764() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_763() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_762() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_761() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_760() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_759() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_758() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_757() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_756() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_755() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_754() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_753() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_752() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_751() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_750() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_749() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_748() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_747() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_746() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_745() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_744() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_743() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_742() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_741() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_740() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_739() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_738() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_737() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_736() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_735() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_734() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_733() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_732() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_731() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_730() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_729() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_728() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_727() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_726() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_725() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_724() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_723() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_722() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_721() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_720() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_719() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_718() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_717() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_716() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_715() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_714() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_713() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_712() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_711() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_710() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_709() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_708() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_707() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_706() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_705() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_704() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_703() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_702() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_701() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_700() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_699() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_698() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_697() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_696() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_695() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_694() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_693() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_692() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_691() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_690() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_689() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_688() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_687() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_686() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_685() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_684() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_683() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_682() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_681() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_680() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_679() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_678() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_677() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_676() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_675() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_674() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_673() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_672() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_671() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_670() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_669() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_668() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_667() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_666() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_665() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_664() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_663() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_662() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_661() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_660() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_659() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_658() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_657() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_656() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_655() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_654() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_653() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_652() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_651() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_650() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_649() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_648() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_647() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_646() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_645() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_644() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_643() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_642() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_641() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_640() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_639() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_638() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_637() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_636() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_635() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_634() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_633() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_632() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_631() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_630() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_629() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_628() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_627() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_626() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_625() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_624() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_623() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_622() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_621() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_620() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_619() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_618() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_617() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_616() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_615() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_614() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_613() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_612() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_611() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_610() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_609() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_608() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_607() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_606() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_605() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_604() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_603() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_602() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_601() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_600() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_599() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_598() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_597() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_596() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_595() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_594() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_593() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_592() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_591() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_590() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_589() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_588() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_587() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_586() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_585() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_584() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_583() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_582() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_581() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_580() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_579() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_578() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_577() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_576() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_575() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_574() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_573() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_572() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_571() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_570() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_569() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_568() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_567() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_566() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_565() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_564() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_563() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_562() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_561() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_560() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_559() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_558() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_557() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_556() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_555() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_554() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_553() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_552() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_551() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_550() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_549() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_548() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_547() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_546() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_545() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_544() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_543() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_542() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_541() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_540() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_539() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_538() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_537() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_536() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_535() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_534() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_533() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_532() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_531() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_530() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_529() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_528() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_527() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_526() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_525() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_524() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_523() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_522() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_521() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_520() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_519() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_518() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_517() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_516() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_515() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_514() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_513() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_512() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_511() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_510() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_509() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_508() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_507() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_506() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_505() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_504() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_503() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_502() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_501() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_500() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_499() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_498() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_497() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_496() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_495() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_494() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_493() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_492() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_491() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_490() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_489() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_488() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_487() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_486() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_485() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_484() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_483() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_482() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_481() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_480() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_479() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_478() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_477() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_476() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_475() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_474() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_473() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_472() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_471() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_470() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_469() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_468() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_467() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_466() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_465() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_464() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_463() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_462() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_461() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_460() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_459() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_458() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_457() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_456() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_455() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_454() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_453() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_452() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_451() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_450() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_449() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_448() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_447() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_446() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_445() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_444() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_443() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_442() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_441() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_440() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_439() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_438() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_437() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_436() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_435() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_434() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_433() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_432() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_431() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_430() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_429() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_428() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_427() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_426() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_425() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_424() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_423() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_422() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_421() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_420() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_419() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_418() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_417() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_416() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_415() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_414() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_413() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_412() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_411() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_410() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_409() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_408() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_407() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_406() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_405() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_404() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_403() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_402() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_401() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_400() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_399() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_398() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_397() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_396() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_395() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_394() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_393() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_392() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_391() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_390() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_389() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_388() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_387() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_386() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_385() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_384() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_383() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_382() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_381() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_380() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_379() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_378() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_377() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_376() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_375() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_374() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_373() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_372() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_371() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_370() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_369() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_368() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_367() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_366() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_365() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_364() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_363() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_362() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_361() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_360() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_359() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_358() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_357() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_356() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_355() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_354() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_353() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_352() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_351() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_350() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_349() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_348() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_347() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_346() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_345() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_344() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_343() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_342() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_341() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_340() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_339() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_338() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_337() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_336() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_335() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_334() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_333() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_332() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_331() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_330() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_329() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_328() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_327() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_326() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_325() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_324() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_323() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_322() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_321() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_320() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_319() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_318() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_317() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_316() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_315() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_314() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_313() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_312() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_311() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_310() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_309() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_308() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_307() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_306() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_305() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_304() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_303() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_302() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_301() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_300() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_299() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_298() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_297() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_296() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_295() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_294() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_293() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_292() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_291() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_290() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_289() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_288() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_287() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_286() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_285() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_284() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_283() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_282() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_281() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_280() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_279() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_278() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_277() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_276() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_275() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_274() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_273() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_272() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_271() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_270() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_269() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_268() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_267() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_266() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_265() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_264() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_263() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_262() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_261() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_260() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_259() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_258() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_257() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_256() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_255() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_254() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_253() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_252() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_251() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_250() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_249() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_248() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_247() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_246() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_245() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_244() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_243() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_242() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_241() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_240() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_239() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_238() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_237() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_236() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_235() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_234() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_233() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_232() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_231() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_230() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_229() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_228() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_227() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_226() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_225() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_224() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_223() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_222() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_221() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_220() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_219() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_218() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_217() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_216() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_215() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_214() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_213() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_212() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_211() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_210() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_209() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_208() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_207() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_206() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_205() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_204() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_203() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_202() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_201() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_200() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_199() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_198() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_197() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_196() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_195() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_194() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_193() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_192() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_191() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_190() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_189() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_188() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_187() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_186() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_185() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_184() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_183() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_182() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_181() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_180() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_179() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_178() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_177() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_176() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_175() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_174() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_173() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_172() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_171() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_170() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_169() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_168() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_167() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_166() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_165() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_164() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_163() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_162() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_161() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_160() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_159() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_158() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_157() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_156() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_155() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_154() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_153() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_152() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_151() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_150() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_149() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_148() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_147() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_146() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_145() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_144() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_143() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_142() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_141() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_140() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_139() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_138() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_137() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_136() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_135() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_134() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_133() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_132() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_131() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_130() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_129() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_128() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_127() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_126() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_125() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_124() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_123() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_122() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_121() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_120() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_119() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_118() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_117() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_116() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_115() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_114() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_113() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_112() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_111() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_110() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_109() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_108() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_107() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_106() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_105() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_104() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_103() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_102() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_101() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_100() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_99() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_98() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_97() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_96() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_95() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_94() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_93() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_92() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_91() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_90() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_89() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_88() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_87() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_86() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_85() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_84() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_83() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_82() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_81() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_80() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_79() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_78() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_77() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_76() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_75() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_74() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_73() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_72() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_71() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_70() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_69() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_68() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_67() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_66() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_65() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_64() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_63() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_62() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_61() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_60() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_59() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_58() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_57() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_56() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_55() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_54() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_53() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_52() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_51() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_50() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_49() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_48() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_47() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_46() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_45() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_44() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_43() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_42() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_41() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_40() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_39() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_38() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_37() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_36() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_35() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_34() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_33() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_32() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_31() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_30() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_29() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_28() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_27() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_26() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_25() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_24() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_23() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_22() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_21() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_20() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_19() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_18() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_17() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_16() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_15() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_14() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_13() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_12() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_11() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_10() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_9() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_8() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_7() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_6() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_5() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_4() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_3() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_2() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_1() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    public void testBitSetDeserialization_0() throws java.lang.Exception {
        java.util.BitSet expected = new java.util.BitSet();
        expected.set(0);
        expected.set(2, 6);
        expected.set(8);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[1,0,1,1,1,1,0,0,1,0,0,0]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[\"1\",\"0\",\"1\",\"1\",\"1\",\"1\",\"0\",\"0\",\"1\"]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
        json = "[true,false,true,true,true,true,false,false,true,false,false]";
        junit.framework.Assert.assertEquals(expected, gson.fromJson(json, java.util.BitSet.class));
    }

    // Date can not directly be compared with another instance since the deserialization loses the
    // millisecond portion.
    @java.lang.SuppressWarnings("deprecation")
    private void assertEqualsDate(java.util.Date date, int year, int month, int day) {
        junit.framework.Assert.assertEquals(year - 1900, date.getYear());
        junit.framework.Assert.assertEquals(month, date.getMonth());
        junit.framework.Assert.assertEquals(day, date.getDate());
    }

    @java.lang.SuppressWarnings("deprecation")
    private void assertEqualsTime(java.util.Date date, int hours, int minutes, int seconds) {
        junit.framework.Assert.assertEquals(hours, date.getHours());
        junit.framework.Assert.assertEquals(minutes, date.getMinutes());
        junit.framework.Assert.assertEquals(seconds, date.getSeconds());
    }

    private static class ClassWithBigDecimal {
        java.math.BigDecimal value;

        ClassWithBigDecimal(java.lang.String value) {
            this.value = new java.math.BigDecimal(value);
        }

        java.lang.String getExpectedJson() {
            return ("{\"value\":" + value.toEngineeringString()) + "}";
        }
    }

    private static class ClassWithBigInteger {
        java.math.BigInteger value;

        ClassWithBigInteger(java.lang.String value) {
            this.value = new java.math.BigInteger(value);
        }

        java.lang.String getExpectedJson() {
            return ("{\"value\":" + value) + "}";
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testBitSetDeserialization_1000.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.DefaultTypeAdaptersTest", "testBitSetDeserialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}