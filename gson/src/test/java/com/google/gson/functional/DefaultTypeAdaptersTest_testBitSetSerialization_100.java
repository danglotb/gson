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
public class DefaultTypeAdaptersTest_testBitSetSerialization_100 extends junit.framework.TestCase {
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testBitSetSerialization_100.class) {}) {
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