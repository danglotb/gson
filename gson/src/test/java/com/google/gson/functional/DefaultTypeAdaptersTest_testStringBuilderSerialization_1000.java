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
public class DefaultTypeAdaptersTest_testStringBuilderSerialization_1000 extends junit.framework.TestCase {
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

    public void testStringBuilderSerialization_999() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_998() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_997() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_996() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_995() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_994() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_993() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_992() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_991() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_990() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_989() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_988() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_987() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_986() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_985() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_984() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_983() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_982() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_981() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_980() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_979() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_978() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_977() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_976() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_975() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_974() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_973() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_972() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_971() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_970() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_969() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_968() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_967() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_966() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_965() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_964() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_963() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_962() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_961() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_960() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_959() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_958() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_957() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_956() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_955() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_954() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_953() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_952() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_951() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_950() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_949() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_948() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_947() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_946() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_945() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_944() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_943() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_942() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_941() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_940() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_939() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_938() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_937() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_936() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_935() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_934() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_933() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_932() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_931() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_930() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_929() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_928() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_927() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_926() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_925() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_924() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_923() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_922() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_921() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_920() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_919() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_918() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_917() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_916() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_915() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_914() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_913() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_912() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_911() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_910() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_909() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_908() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_907() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_906() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_905() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_904() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_903() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_902() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_901() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_900() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_899() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_898() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_897() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_896() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_895() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_894() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_893() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_892() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_891() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_890() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_889() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_888() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_887() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_886() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_885() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_884() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_883() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_882() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_881() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_880() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_879() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_878() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_877() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_876() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_875() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_874() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_873() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_872() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_871() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_870() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_869() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_868() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_867() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_866() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_865() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_864() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_863() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_862() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_861() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_860() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_859() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_858() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_857() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_856() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_855() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_854() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_853() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_852() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_851() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_850() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_849() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_848() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_847() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_846() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_845() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_844() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_843() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_842() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_841() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_840() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_839() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_838() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_837() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_836() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_835() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_834() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_833() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_832() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_831() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_830() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_829() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_828() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_827() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_826() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_825() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_824() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_823() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_822() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_821() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_820() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_819() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_818() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_817() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_816() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_815() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_814() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_813() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_812() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_811() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_810() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_809() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_808() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_807() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_806() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_805() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_804() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_803() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_802() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_801() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_800() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_799() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_798() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_797() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_796() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_795() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_794() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_793() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_792() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_791() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_790() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_789() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_788() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_787() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_786() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_785() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_784() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_783() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_782() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_781() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_780() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_779() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_778() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_777() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_776() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_775() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_774() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_773() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_772() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_771() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_770() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_769() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_768() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_767() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_766() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_765() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_764() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_763() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_762() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_761() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_760() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_759() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_758() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_757() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_756() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_755() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_754() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_753() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_752() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_751() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_750() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_749() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_748() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_747() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_746() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_745() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_744() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_743() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_742() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_741() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_740() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_739() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_738() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_737() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_736() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_735() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_734() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_733() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_732() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_731() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_730() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_729() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_728() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_727() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_726() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_725() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_724() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_723() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_722() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_721() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_720() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_719() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_718() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_717() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_716() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_715() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_714() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_713() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_712() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_711() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_710() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_709() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_708() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_707() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_706() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_705() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_704() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_703() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_702() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_701() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_700() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_699() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_698() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_697() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_696() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_695() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_694() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_693() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_692() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_691() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_690() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_689() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_688() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_687() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_686() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_685() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_684() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_683() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_682() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_681() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_680() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_679() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_678() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_677() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_676() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_675() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_674() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_673() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_672() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_671() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_670() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_669() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_668() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_667() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_666() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_665() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_664() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_663() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_662() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_661() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_660() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_659() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_658() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_657() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_656() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_655() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_654() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_653() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_652() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_651() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_650() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_649() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_648() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_647() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_646() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_645() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_644() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_643() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_642() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_641() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_640() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_639() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_638() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_637() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_636() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_635() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_634() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_633() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_632() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_631() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_630() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_629() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_628() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_627() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_626() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_625() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_624() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_623() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_622() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_621() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_620() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_619() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_618() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_617() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_616() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_615() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_614() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_613() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_612() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_611() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_610() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_609() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_608() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_607() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_606() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_605() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_604() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_603() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_602() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_601() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_600() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_599() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_598() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_597() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_596() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_595() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_594() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_593() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_592() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_591() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_590() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_589() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_588() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_587() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_586() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_585() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_584() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_583() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_582() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_581() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_580() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_579() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_578() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_577() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_576() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_575() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_574() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_573() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_572() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_571() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_570() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_569() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_568() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_567() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_566() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_565() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_564() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_563() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_562() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_561() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_560() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_559() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_558() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_557() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_556() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_555() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_554() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_553() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_552() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_551() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_550() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_549() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_548() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_547() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_546() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_545() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_544() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_543() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_542() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_541() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_540() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_539() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_538() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_537() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_536() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_535() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_534() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_533() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_532() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_531() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_530() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_529() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_528() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_527() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_526() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_525() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_524() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_523() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_522() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_521() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_520() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_519() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_518() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_517() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_516() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_515() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_514() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_513() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_512() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_511() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_510() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_509() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_508() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_507() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_506() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_505() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_504() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_503() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_502() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_501() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_500() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_499() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_498() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_497() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_496() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_495() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_494() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_493() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_492() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_491() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_490() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_489() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_488() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_487() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_486() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_485() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_484() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_483() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_482() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_481() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_480() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_479() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_478() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_477() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_476() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_475() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_474() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_473() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_472() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_471() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_470() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_469() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_468() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_467() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_466() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_465() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_464() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_463() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_462() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_461() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_460() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_459() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_458() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_457() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_456() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_455() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_454() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_453() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_452() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_451() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_450() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_449() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_448() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_447() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_446() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_445() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_444() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_443() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_442() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_441() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_440() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_439() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_438() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_437() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_436() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_435() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_434() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_433() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_432() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_431() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_430() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_429() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_428() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_427() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_426() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_425() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_424() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_423() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_422() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_421() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_420() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_419() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_418() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_417() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_416() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_415() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_414() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_413() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_412() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_411() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_410() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_409() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_408() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_407() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_406() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_405() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_404() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_403() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_402() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_401() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_400() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_399() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_398() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_397() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_396() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_395() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_394() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_393() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_392() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_391() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_390() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_389() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_388() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_387() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_386() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_385() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_384() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_383() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_382() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_381() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_380() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_379() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_378() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_377() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_376() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_375() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_374() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_373() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_372() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_371() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_370() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_369() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_368() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_367() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_366() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_365() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_364() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_363() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_362() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_361() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_360() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_359() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_358() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_357() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_356() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_355() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_354() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_353() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_352() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_351() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_350() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_349() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_348() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_347() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_346() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_345() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_344() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_343() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_342() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_341() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_340() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_339() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_338() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_337() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_336() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_335() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_334() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_333() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_332() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_331() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_330() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_329() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_328() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_327() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_326() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_325() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_324() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_323() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_322() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_321() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_320() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_319() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_318() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_317() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_316() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_315() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_314() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_313() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_312() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_311() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_310() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_309() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_308() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_307() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_306() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_305() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_304() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_303() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_302() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_301() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_300() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_299() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_298() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_297() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_296() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_295() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_294() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_293() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_292() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_291() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_290() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_289() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_288() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_287() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_286() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_285() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_284() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_283() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_282() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_281() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_280() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_279() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_278() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_277() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_276() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_275() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_274() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_273() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_272() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_271() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_270() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_269() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_268() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_267() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_266() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_265() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_264() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_263() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_262() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_261() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_260() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_259() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_258() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_257() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_256() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_255() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_254() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_253() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_252() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_251() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_250() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_249() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_248() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_247() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_246() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_245() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_244() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_243() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_242() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_241() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_240() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_239() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_238() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_237() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_236() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_235() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_234() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_233() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_232() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_231() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_230() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_229() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_228() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_227() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_226() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_225() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_224() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_223() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_222() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_221() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_220() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_219() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_218() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_217() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_216() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_215() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_214() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_213() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_212() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_211() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_210() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_209() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_208() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_207() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_206() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_205() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_204() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_203() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_202() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_201() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_200() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_199() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_198() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_197() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_196() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_195() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_194() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_193() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_192() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_191() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_190() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_189() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_188() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_187() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_186() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_185() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_184() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_183() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_182() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_181() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_180() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_179() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_178() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_177() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_176() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_175() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_174() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_173() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_172() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_171() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_170() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_169() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_168() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_167() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_166() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_165() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_164() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_163() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_162() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_161() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_160() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_159() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_158() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_157() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_156() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_155() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_154() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_153() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_152() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_151() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_150() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_149() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_148() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_147() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_146() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_145() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_144() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_143() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_142() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_141() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_140() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_139() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_138() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_137() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_136() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_135() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_134() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_133() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_132() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_131() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_130() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_129() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_128() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_127() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_126() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_125() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_124() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_123() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_122() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_121() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_120() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_119() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_118() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_117() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_116() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_115() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_114() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_113() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_112() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_111() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_110() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_109() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_108() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_107() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_106() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_105() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_104() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_103() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_102() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_101() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
    }

    public void testStringBuilderSerialization_100() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abc");
        java.lang.String json = gson.toJson(sb);
        junit.framework.Assert.assertEquals("\"abc\"", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testStringBuilderSerialization_1000.class) {}) {
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