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
public class DefaultTypeAdaptersTest_testDefaultJavaSqlDateSerialization_100 extends junit.framework.TestCase {
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

    public void testDefaultJavaSqlDateSerialization_99() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_98() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_97() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_96() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_95() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_94() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_93() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_92() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_91() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_90() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_89() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_88() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_87() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_86() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_85() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_84() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_83() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_82() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_81() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_80() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_79() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_78() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_77() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_76() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_75() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_74() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_73() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_72() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_71() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_70() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_69() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_68() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_67() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_66() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_65() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_64() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_63() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_62() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_61() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_60() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_59() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_58() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_57() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_56() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_55() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_54() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_53() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_52() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_51() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_50() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_49() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_48() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_47() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_46() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_45() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_44() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_43() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_42() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_41() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_40() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_39() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_38() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_37() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_36() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_35() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_34() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_33() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_32() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_31() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_30() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_29() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_28() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_27() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_26() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_25() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_24() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_23() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_22() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_21() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_20() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_19() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_18() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_17() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_16() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_15() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_14() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_13() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_12() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_11() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_10() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_9() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_8() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_7() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_6() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_5() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_4() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_3() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_2() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_0() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testDefaultJavaSqlDateSerialization_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.DefaultTypeAdaptersTest", "testDefaultJavaSqlDateSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}