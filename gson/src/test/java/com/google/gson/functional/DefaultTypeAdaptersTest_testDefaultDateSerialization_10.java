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
public class DefaultTypeAdaptersTest_testDefaultDateSerialization_10 extends junit.framework.TestCase {
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testDefaultDateSerialization_10.class) {}) {
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