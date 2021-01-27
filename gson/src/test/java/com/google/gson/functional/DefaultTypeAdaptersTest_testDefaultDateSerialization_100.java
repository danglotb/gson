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
public class DefaultTypeAdaptersTest_testDefaultDateSerialization_100 extends junit.framework.TestCase {
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

    public void testDefaultDateSerialization_99() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_98() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_97() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_96() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_95() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_94() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_93() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_92() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_91() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_90() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_89() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_88() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_87() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_86() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_85() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_84() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_83() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_82() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_81() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_80() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_79() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_78() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_77() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_76() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_75() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_74() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_73() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_72() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_71() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_70() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_69() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_68() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_67() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_66() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_65() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_64() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_63() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_62() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_61() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_60() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_59() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_58() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_57() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_56() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_55() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_54() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_53() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_52() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_51() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_50() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_49() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_48() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_47() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_46() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_45() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_44() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_43() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_42() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_41() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_40() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_39() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_38() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_37() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_36() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_35() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_34() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_33() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_32() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_31() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_30() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_29() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_28() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_27() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_26() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_25() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_24() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_23() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_22() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_21() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_20() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_19() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_18() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_17() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_16() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_15() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_14() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_13() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_12() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_11() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_10() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_9() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_8() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_7() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_6() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_5() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_4() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_3() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_2() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_0() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testDefaultDateSerialization_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.DefaultTypeAdaptersTest", "testDefaultDateSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}