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
public class DefaultTypeAdaptersTest_testStringBuilderSerialization_100 extends junit.framework.TestCase {
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

    public void testStringBuilderSerialization_99() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_98() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_97() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_96() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_95() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_94() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_93() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_92() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_91() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_90() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_89() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_88() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_87() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_86() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_85() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_84() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_83() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_82() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_81() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_80() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_79() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_78() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_77() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_76() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_75() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_74() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_73() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_72() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_71() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_70() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_69() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_68() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_67() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_66() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_65() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_64() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_63() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_62() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_61() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_60() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_59() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_58() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_57() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_56() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_55() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_54() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_53() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_52() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_51() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_50() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_49() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_48() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_47() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_46() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_45() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_44() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_43() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_42() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_41() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_40() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_39() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_38() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_37() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_36() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_35() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_34() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_33() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_32() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_31() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_30() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_29() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_28() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_27() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_26() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_25() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_24() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_23() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_22() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_21() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_20() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_19() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_18() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_17() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_16() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_15() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_14() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_13() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_12() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_11() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_10() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_9() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_8() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_7() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_6() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_5() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_4() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_3() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_2() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_1() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_0() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testStringBuilderSerialization_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.DefaultTypeAdaptersTest", "testStringBuilderSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}