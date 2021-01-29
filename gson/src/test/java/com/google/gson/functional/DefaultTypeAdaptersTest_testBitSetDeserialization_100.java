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
public class DefaultTypeAdaptersTest_testBitSetDeserialization_100 extends junit.framework.TestCase {
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testBitSetDeserialization_100.class) {}) {
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