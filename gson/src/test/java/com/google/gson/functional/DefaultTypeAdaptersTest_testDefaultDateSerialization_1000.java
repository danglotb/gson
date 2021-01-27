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
public class DefaultTypeAdaptersTest_testDefaultDateSerialization_1000 extends junit.framework.TestCase {
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

    public void testDefaultDateSerialization_999() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_998() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_997() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_996() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_995() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_994() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_993() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_992() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_991() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_990() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_989() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_988() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_987() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_986() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_985() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_984() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_983() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_982() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_981() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_980() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_979() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_978() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_977() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_976() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_975() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_974() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_973() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_972() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_971() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_970() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_969() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_968() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_967() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_966() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_965() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_964() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_963() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_962() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_961() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_960() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_959() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_958() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_957() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_956() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_955() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_954() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_953() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_952() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_951() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_950() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_949() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_948() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_947() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_946() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_945() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_944() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_943() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_942() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_941() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_940() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_939() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_938() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_937() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_936() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_935() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_934() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_933() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_932() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_931() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_930() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_929() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_928() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_927() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_926() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_925() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_924() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_923() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_922() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_921() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_920() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_919() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_918() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_917() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_916() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_915() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_914() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_913() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_912() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_911() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_910() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_909() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_908() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_907() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_906() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_905() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_904() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_903() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_902() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_901() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_900() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_899() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_898() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_897() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_896() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_895() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_894() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_893() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_892() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_891() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_890() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_889() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_888() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_887() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_886() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_885() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_884() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_883() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_882() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_881() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_880() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_879() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_878() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_877() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_876() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_875() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_874() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_873() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_872() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_871() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_870() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_869() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_868() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_867() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_866() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_865() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_864() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_863() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_862() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_861() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_860() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_859() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_858() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_857() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_856() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_855() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_854() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_853() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_852() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_851() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_850() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_849() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_848() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_847() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_846() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_845() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_844() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_843() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_842() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_841() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_840() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_839() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_838() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_837() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_836() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_835() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_834() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_833() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_832() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_831() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_830() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_829() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_828() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_827() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_826() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_825() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_824() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_823() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_822() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_821() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_820() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_819() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_818() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_817() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_816() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_815() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_814() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_813() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_812() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_811() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_810() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_809() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_808() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_807() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_806() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_805() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_804() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_803() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_802() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_801() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_800() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_799() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_798() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_797() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_796() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_795() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_794() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_793() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_792() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_791() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_790() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_789() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_788() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_787() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_786() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_785() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_784() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_783() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_782() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_781() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_780() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_779() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_778() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_777() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_776() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_775() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_774() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_773() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_772() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_771() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_770() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_769() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_768() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_767() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_766() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_765() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_764() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_763() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_762() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_761() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_760() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_759() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_758() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_757() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_756() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_755() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_754() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_753() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_752() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_751() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_750() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_749() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_748() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_747() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_746() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_745() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_744() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_743() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_742() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_741() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_740() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_739() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_738() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_737() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_736() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_735() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_734() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_733() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_732() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_731() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_730() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_729() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_728() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_727() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_726() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_725() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_724() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_723() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_722() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_721() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_720() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_719() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_718() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_717() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_716() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_715() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_714() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_713() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_712() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_711() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_710() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_709() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_708() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_707() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_706() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_705() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_704() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_703() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_702() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_701() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_700() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_699() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_698() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_697() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_696() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_695() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_694() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_693() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_692() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_691() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_690() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_689() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_688() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_687() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_686() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_685() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_684() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_683() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_682() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_681() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_680() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_679() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_678() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_677() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_676() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_675() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_674() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_673() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_672() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_671() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_670() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_669() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_668() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_667() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_666() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_665() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_664() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_663() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_662() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_661() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_660() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_659() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_658() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_657() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_656() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_655() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_654() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_653() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_652() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_651() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_650() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_649() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_648() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_647() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_646() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_645() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_644() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_643() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_642() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_641() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_640() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_639() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_638() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_637() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_636() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_635() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_634() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_633() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_632() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_631() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_630() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_629() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_628() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_627() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_626() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_625() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_624() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_623() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_622() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_621() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_620() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_619() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_618() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_617() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_616() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_615() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_614() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_613() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_612() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_611() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_610() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_609() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_608() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_607() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_606() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_605() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_604() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_603() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_602() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_601() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_600() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_599() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_598() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_597() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_596() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_595() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_594() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_593() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_592() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_591() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_590() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_589() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_588() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_587() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_586() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_585() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_584() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_583() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_582() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_581() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_580() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_579() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_578() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_577() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_576() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_575() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_574() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_573() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_572() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_571() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_570() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_569() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_568() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_567() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_566() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_565() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_564() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_563() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_562() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_561() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_560() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_559() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_558() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_557() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_556() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_555() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_554() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_553() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_552() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_551() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_550() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_549() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_548() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_547() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_546() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_545() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_544() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_543() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_542() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_541() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_540() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_539() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_538() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_537() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_536() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_535() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_534() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_533() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_532() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_531() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_530() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_529() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_528() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_527() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_526() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_525() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_524() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_523() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_522() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_521() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_520() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_519() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_518() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_517() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_516() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_515() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_514() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_513() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_512() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_511() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_510() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_509() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_508() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_507() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_506() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_505() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_504() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_503() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_502() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_501() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_500() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_499() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_498() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_497() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_496() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_495() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_494() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_493() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_492() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_491() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_490() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_489() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_488() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_487() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_486() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_485() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_484() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_483() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_482() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_481() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_480() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_479() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_478() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_477() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_476() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_475() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_474() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_473() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_472() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_471() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_470() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_469() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_468() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_467() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_466() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_465() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_464() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_463() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_462() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_461() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_460() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_459() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_458() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_457() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_456() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_455() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_454() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_453() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_452() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_451() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_450() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_449() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_448() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_447() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_446() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_445() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_444() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_443() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_442() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_441() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_440() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_439() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_438() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_437() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_436() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_435() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_434() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_433() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_432() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_431() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_430() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_429() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_428() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_427() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_426() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_425() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_424() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_423() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_422() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_421() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_420() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_419() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_418() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_417() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_416() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_415() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_414() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_413() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_412() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_411() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_410() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_409() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_408() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_407() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_406() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_405() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_404() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_403() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_402() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_401() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_400() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_399() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_398() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_397() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_396() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_395() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_394() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_393() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_392() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_391() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_390() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_389() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_388() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_387() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_386() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_385() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_384() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_383() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_382() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_381() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_380() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_379() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_378() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_377() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_376() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_375() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_374() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_373() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_372() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_371() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_370() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_369() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_368() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_367() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_366() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_365() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_364() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_363() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_362() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_361() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_360() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_359() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_358() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_357() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_356() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_355() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_354() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_353() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_352() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_351() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_350() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_349() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_348() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_347() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_346() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_345() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_344() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_343() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_342() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_341() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_340() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_339() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_338() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_337() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_336() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_335() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_334() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_333() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_332() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_331() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_330() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_329() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_328() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_327() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_326() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_325() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_324() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_323() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_322() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_321() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_320() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_319() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_318() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_317() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_316() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_315() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_314() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_313() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_312() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_311() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_310() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_309() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_308() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_307() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_306() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_305() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_304() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_303() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_302() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_301() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_300() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_299() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_298() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_297() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_296() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_295() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_294() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_293() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_292() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_291() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_290() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_289() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_288() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_287() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_286() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_285() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_284() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_283() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_282() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_281() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_280() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_279() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_278() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_277() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_276() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_275() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_274() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_273() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_272() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_271() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_270() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_269() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_268() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_267() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_266() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_265() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_264() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_263() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_262() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_261() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_260() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_259() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_258() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_257() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_256() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_255() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_254() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_253() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_252() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_251() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_250() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_249() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_248() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_247() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_246() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_245() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_244() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_243() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_242() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_241() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_240() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_239() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_238() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_237() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_236() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_235() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_234() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_233() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_232() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_231() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_230() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_229() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_228() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_227() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_226() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_225() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_224() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_223() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_222() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_221() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_220() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_219() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_218() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_217() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_216() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_215() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_214() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_213() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_212() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_211() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_210() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_209() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_208() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_207() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_206() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_205() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_204() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_203() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_202() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_201() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_200() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_199() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_198() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_197() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_196() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_195() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_194() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_193() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_192() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_191() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_190() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_189() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_188() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_187() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_186() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_185() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_184() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_183() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_182() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_181() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_180() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_179() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_178() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_177() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_176() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_175() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_174() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_173() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_172() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_171() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_170() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_169() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_168() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_167() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_166() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_165() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_164() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_163() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_162() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_161() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_160() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_159() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_158() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_157() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_156() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_155() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_154() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_153() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_152() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_151() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_150() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_149() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_148() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_147() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_146() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_145() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_144() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_143() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_142() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_141() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_140() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_139() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_138() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_137() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_136() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_135() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_134() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_133() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_132() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_131() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_130() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_129() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_128() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_127() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_126() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_125() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_124() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_123() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_122() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_121() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_120() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_119() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_118() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_117() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_116() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_115() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_114() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_113() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_112() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_111() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_110() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_109() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_108() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_107() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_106() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_105() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_104() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_103() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_102() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_101() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_100() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testDefaultDateSerialization_1000.class) {}) {
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