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
public class DefaultTypeAdaptersTest_testBitSetSerialization_1000 extends junit.framework.TestCase {
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

    public void testBitSetSerialization_999() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_998() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_997() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_996() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_995() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_994() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_993() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_992() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_991() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_990() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_989() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_988() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_987() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_986() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_985() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_984() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_983() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_982() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_981() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_980() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_979() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_978() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_977() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_976() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_975() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_974() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_973() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_972() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_971() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_970() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_969() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_968() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_967() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_966() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_965() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_964() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_963() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_962() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_961() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_960() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_959() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_958() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_957() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_956() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_955() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_954() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_953() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_952() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_951() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_950() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_949() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_948() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_947() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_946() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_945() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_944() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_943() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_942() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_941() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_940() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_939() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_938() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_937() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_936() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_935() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_934() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_933() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_932() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_931() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_930() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_929() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_928() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_927() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_926() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_925() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_924() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_923() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_922() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_921() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_920() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_919() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_918() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_917() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_916() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_915() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_914() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_913() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_912() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_911() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_910() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_909() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_908() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_907() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_906() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_905() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_904() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_903() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_902() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_901() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_900() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_899() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_898() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_897() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_896() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_895() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_894() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_893() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_892() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_891() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_890() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_889() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_888() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_887() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_886() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_885() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_884() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_883() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_882() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_881() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_880() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_879() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_878() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_877() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_876() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_875() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_874() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_873() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_872() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_871() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_870() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_869() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_868() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_867() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_866() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_865() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_864() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_863() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_862() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_861() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_860() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_859() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_858() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_857() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_856() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_855() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_854() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_853() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_852() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_851() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_850() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_849() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_848() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_847() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_846() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_845() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_844() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_843() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_842() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_841() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_840() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_839() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_838() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_837() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_836() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_835() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_834() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_833() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_832() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_831() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_830() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_829() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_828() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_827() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_826() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_825() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_824() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_823() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_822() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_821() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_820() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_819() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_818() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_817() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_816() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_815() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_814() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_813() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_812() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_811() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_810() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_809() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_808() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_807() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_806() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_805() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_804() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_803() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_802() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_801() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_800() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_799() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_798() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_797() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_796() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_795() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_794() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_793() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_792() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_791() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_790() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_789() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_788() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_787() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_786() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_785() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_784() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_783() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_782() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_781() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_780() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_779() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_778() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_777() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_776() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_775() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_774() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_773() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_772() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_771() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_770() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_769() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_768() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_767() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_766() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_765() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_764() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_763() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_762() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_761() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_760() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_759() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_758() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_757() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_756() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_755() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_754() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_753() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_752() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_751() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_750() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_749() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_748() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_747() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_746() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_745() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_744() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_743() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_742() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_741() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_740() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_739() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_738() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_737() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_736() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_735() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_734() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_733() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_732() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_731() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_730() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_729() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_728() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_727() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_726() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_725() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_724() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_723() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_722() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_721() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_720() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_719() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_718() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_717() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_716() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_715() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_714() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_713() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_712() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_711() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_710() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_709() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_708() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_707() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_706() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_705() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_704() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_703() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_702() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_701() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_700() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_699() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_698() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_697() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_696() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_695() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_694() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_693() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_692() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_691() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_690() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_689() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_688() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_687() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_686() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_685() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_684() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_683() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_682() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_681() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_680() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_679() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_678() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_677() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_676() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_675() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_674() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_673() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_672() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_671() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_670() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_669() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_668() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_667() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_666() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_665() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_664() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_663() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_662() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_661() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_660() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_659() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_658() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_657() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_656() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_655() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_654() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_653() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_652() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_651() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_650() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_649() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_648() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_647() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_646() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_645() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_644() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_643() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_642() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_641() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_640() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_639() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_638() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_637() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_636() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_635() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_634() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_633() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_632() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_631() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_630() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_629() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_628() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_627() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_626() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_625() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_624() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_623() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_622() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_621() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_620() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_619() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_618() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_617() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_616() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_615() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_614() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_613() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_612() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_611() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_610() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_609() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_608() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_607() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_606() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_605() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_604() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_603() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_602() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_601() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_600() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_599() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_598() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_597() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_596() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_595() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_594() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_593() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_592() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_591() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_590() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_589() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_588() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_587() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_586() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_585() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_584() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_583() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_582() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_581() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_580() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_579() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_578() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_577() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_576() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_575() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_574() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_573() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_572() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_571() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_570() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_569() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_568() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_567() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_566() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_565() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_564() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_563() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_562() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_561() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_560() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_559() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_558() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_557() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_556() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_555() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_554() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_553() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_552() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_551() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_550() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_549() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_548() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_547() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_546() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_545() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_544() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_543() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_542() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_541() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_540() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_539() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_538() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_537() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_536() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_535() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_534() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_533() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_532() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_531() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_530() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_529() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_528() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_527() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_526() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_525() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_524() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_523() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_522() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_521() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_520() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_519() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_518() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_517() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_516() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_515() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_514() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_513() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_512() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_511() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_510() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_509() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_508() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_507() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_506() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_505() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_504() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_503() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_502() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_501() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_500() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_499() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_498() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_497() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_496() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_495() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_494() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_493() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_492() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_491() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_490() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_489() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_488() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_487() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_486() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_485() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_484() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_483() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_482() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_481() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_480() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_479() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_478() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_477() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_476() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_475() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_474() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_473() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_472() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_471() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_470() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_469() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_468() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_467() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_466() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_465() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_464() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_463() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_462() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_461() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_460() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_459() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_458() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_457() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_456() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_455() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_454() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_453() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_452() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_451() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_450() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_449() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_448() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_447() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_446() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_445() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_444() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_443() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_442() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_441() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_440() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_439() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_438() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_437() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_436() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_435() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_434() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_433() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_432() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_431() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_430() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_429() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_428() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_427() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_426() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_425() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_424() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_423() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_422() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_421() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_420() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_419() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_418() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_417() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_416() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_415() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_414() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_413() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_412() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_411() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_410() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_409() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_408() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_407() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_406() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_405() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_404() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_403() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_402() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_401() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_400() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_399() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_398() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_397() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_396() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_395() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_394() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_393() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_392() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_391() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_390() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_389() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_388() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_387() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_386() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_385() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_384() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_383() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_382() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_381() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_380() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_379() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_378() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_377() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_376() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_375() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_374() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_373() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_372() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_371() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_370() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_369() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_368() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_367() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_366() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_365() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_364() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_363() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_362() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_361() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_360() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_359() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_358() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_357() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_356() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_355() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_354() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_353() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_352() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_351() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_350() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_349() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_348() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_347() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_346() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_345() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_344() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_343() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_342() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_341() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_340() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_339() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_338() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_337() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_336() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_335() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_334() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_333() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_332() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_331() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_330() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_329() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_328() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_327() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_326() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_325() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_324() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_323() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_322() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_321() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_320() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_319() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_318() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_317() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_316() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_315() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_314() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_313() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_312() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_311() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_310() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_309() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_308() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_307() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_306() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_305() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_304() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_303() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_302() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_301() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_300() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_299() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_298() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_297() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_296() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_295() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_294() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_293() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_292() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_291() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_290() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_289() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_288() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_287() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_286() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_285() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_284() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_283() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_282() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_281() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_280() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_279() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_278() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_277() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_276() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_275() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_274() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_273() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_272() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_271() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_270() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_269() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_268() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_267() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_266() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_265() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_264() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_263() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_262() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_261() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_260() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_259() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_258() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_257() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_256() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_255() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_254() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_253() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_252() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_251() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_250() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_249() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_248() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_247() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_246() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_245() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_244() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_243() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_242() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_241() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_240() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_239() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_238() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_237() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_236() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_235() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_234() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_233() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_232() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_231() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_230() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_229() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_228() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_227() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_226() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_225() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_224() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_223() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_222() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_221() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_220() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_219() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_218() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_217() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_216() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_215() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_214() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_213() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_212() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_211() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_210() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_209() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_208() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_207() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_206() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_205() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_204() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_203() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_202() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_201() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_200() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_199() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_198() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_197() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_196() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_195() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_194() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_193() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_192() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_191() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_190() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_189() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_188() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_187() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_186() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_185() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_184() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_183() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_182() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_181() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_180() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_179() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_178() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_177() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_176() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_175() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_174() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_173() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_172() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_171() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_170() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_169() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_168() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_167() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_166() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_165() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_164() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_163() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_162() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_161() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_160() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_159() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_158() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_157() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_156() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_155() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_154() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_153() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_152() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_151() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_150() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_149() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_148() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_147() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_146() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_145() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_144() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_143() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_142() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_141() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_140() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_139() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_138() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_137() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_136() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_135() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_134() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_133() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_132() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_131() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_130() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_129() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_128() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_127() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_126() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_125() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_124() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_123() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_122() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_121() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_120() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_119() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_118() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_117() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_116() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_115() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_114() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_113() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_112() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_111() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_110() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_109() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_108() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_107() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_106() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_105() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_104() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_103() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_102() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_101() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_100() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_99() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_98() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_97() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_96() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_95() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_94() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_93() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_92() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_91() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_90() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_89() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_88() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_87() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_86() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_85() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_84() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_83() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_82() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_81() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_80() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_79() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_78() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_77() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_76() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_75() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_74() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_73() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_72() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_71() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_70() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_69() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_68() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_67() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_66() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_65() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_64() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_63() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_62() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_61() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_60() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_59() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_58() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_57() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_56() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_55() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_54() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_53() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_52() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_51() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_50() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_49() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_48() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_47() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_46() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_45() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_44() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_43() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_42() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_41() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_40() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_39() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_38() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_37() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_36() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_35() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_34() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_33() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_32() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_31() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_30() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_29() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_28() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_27() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_26() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_25() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_24() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_23() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_22() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_21() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_20() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_19() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_18() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_17() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_16() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_15() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_14() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_13() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_12() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_11() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_10() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_9() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_8() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_7() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_6() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_5() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_4() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_3() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_2() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_1() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
    }

    public void testBitSetSerialization_0() throws java.lang.Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.util.BitSet bits = new java.util.BitSet();
        bits.set(1);
        bits.set(3, 6);
        bits.set(9);
        java.lang.String json = gson.toJson(bits);
        junit.framework.Assert.assertEquals("[0,1,0,1,1,1,0,0,0,1]", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testBitSetSerialization_1000.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.DefaultTypeAdaptersTest", "testBitSetSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}