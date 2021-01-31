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
public class DefaultTypeAdaptersTest_testDefaultDateSerialization_2000 extends junit.framework.TestCase {
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

    public void testDefaultDateSerialization_1999() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1998() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1997() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1996() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1995() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1994() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1993() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1992() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1991() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1990() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1989() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1988() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1987() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1986() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1985() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1984() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1983() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1982() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1981() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1980() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1979() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1978() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1977() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1976() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1975() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1974() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1973() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1972() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1971() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1970() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1969() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1968() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1967() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1966() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1965() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1964() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1963() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1962() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1961() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1960() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1959() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1958() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1957() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1956() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1955() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1954() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1953() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1952() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1951() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1950() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1949() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1948() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1947() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1946() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1945() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1944() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1943() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1942() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1941() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1940() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1939() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1938() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1937() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1936() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1935() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1934() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1933() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1932() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1931() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1930() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1929() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1928() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1927() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1926() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1925() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1924() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1923() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1922() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1921() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1920() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1919() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1918() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1917() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1916() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1915() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1914() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1913() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1912() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1911() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1910() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1909() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1908() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1907() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1906() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1905() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1904() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1903() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1902() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1901() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1900() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1899() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1898() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1897() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1896() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1895() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1894() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1893() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1892() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1891() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1890() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1889() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1888() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1887() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1886() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1885() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1884() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1883() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1882() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1881() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1880() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1879() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1878() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1877() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1876() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1875() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1874() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1873() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1872() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1871() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1870() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1869() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1868() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1867() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1866() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1865() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1864() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1863() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1862() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1861() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1860() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1859() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1858() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1857() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1856() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1855() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1854() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1853() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1852() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1851() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1850() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1849() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1848() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1847() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1846() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1845() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1844() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1843() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1842() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1841() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1840() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1839() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1838() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1837() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1836() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1835() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1834() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1833() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1832() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1831() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1830() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1829() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1828() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1827() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1826() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1825() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1824() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1823() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1822() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1821() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1820() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1819() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1818() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1817() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1816() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1815() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1814() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1813() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1812() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1811() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1810() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1809() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1808() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1807() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1806() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1805() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1804() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1803() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1802() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1801() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1800() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1799() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1798() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1797() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1796() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1795() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1794() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1793() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1792() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1791() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1790() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1789() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1788() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1787() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1786() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1785() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1784() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1783() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1782() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1781() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1780() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1779() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1778() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1777() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1776() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1775() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1774() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1773() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1772() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1771() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1770() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1769() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1768() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1767() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1766() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1765() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1764() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1763() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1762() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1761() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1760() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1759() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1758() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1757() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1756() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1755() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1754() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1753() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1752() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1751() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1750() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1749() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1748() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1747() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1746() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1745() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1744() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1743() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1742() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1741() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1740() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1739() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1738() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1737() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1736() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1735() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1734() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1733() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1732() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1731() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1730() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1729() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1728() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1727() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1726() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1725() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1724() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1723() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1722() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1721() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1720() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1719() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1718() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1717() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1716() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1715() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1714() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1713() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1712() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1711() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1710() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1709() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1708() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1707() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1706() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1705() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1704() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1703() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1702() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1701() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1700() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1699() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1698() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1697() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1696() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1695() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1694() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1693() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1692() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1691() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1690() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1689() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1688() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1687() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1686() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1685() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1684() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1683() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1682() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1681() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1680() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1679() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1678() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1677() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1676() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1675() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1674() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1673() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1672() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1671() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1670() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1669() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1668() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1667() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1666() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1665() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1664() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1663() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1662() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1661() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1660() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1659() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1658() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1657() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1656() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1655() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1654() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1653() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1652() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1651() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1650() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1649() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1648() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1647() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1646() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1645() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1644() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1643() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1642() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1641() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1640() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1639() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1638() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1637() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1636() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1635() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1634() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1633() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1632() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1631() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1630() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1629() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1628() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1627() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1626() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1625() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1624() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1623() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1622() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1621() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1620() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1619() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1618() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1617() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1616() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1615() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1614() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1613() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1612() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1611() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1610() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1609() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1608() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1607() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1606() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1605() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1604() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1603() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1602() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1601() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1600() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1599() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1598() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1597() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1596() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1595() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1594() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1593() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1592() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1591() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1590() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1589() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1588() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1587() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1586() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1585() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1584() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1583() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1582() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1581() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1580() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1579() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1578() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1577() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1576() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1575() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1574() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1573() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1572() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1571() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1570() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1569() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1568() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1567() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1566() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1565() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1564() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1563() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1562() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1561() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1560() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1559() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1558() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1557() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1556() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1555() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1554() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1553() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1552() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1551() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1550() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1549() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1548() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1547() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1546() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1545() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1544() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1543() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1542() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1541() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1540() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1539() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1538() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1537() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1536() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1535() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1534() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1533() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1532() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1531() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1530() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1529() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1528() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1527() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1526() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1525() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1524() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1523() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1522() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1521() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1520() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1519() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1518() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1517() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1516() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1515() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1514() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1513() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1512() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1511() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1510() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1509() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1508() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1507() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1506() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1505() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1504() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1503() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1502() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1501() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1500() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1499() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1498() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1497() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1496() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1495() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1494() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1493() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1492() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1491() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1490() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1489() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1488() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1487() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1486() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1485() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1484() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1483() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1482() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1481() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1480() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1479() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1478() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1477() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1476() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1475() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1474() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1473() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1472() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1471() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1470() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1469() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1468() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1467() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1466() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1465() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1464() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1463() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1462() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1461() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1460() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1459() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1458() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1457() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1456() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1455() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1454() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1453() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1452() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1451() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1450() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1449() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1448() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1447() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1446() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1445() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1444() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1443() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1442() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1441() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1440() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1439() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1438() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1437() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1436() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1435() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1434() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1433() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1432() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1431() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1430() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1429() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1428() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1427() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1426() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1425() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1424() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1423() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1422() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1421() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1420() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1419() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1418() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1417() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1416() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1415() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1414() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1413() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1412() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1411() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1410() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1409() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1408() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1407() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1406() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1405() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1404() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1403() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1402() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1401() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1400() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1399() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1398() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1397() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1396() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1395() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1394() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1393() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1392() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1391() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1390() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1389() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1388() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1387() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1386() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1385() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1384() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1383() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1382() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1381() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1380() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1379() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1378() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1377() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1376() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1375() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1374() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1373() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1372() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1371() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1370() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1369() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1368() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1367() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1366() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1365() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1364() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1363() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1362() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1361() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1360() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1359() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1358() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1357() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1356() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1355() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1354() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1353() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1352() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1351() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1350() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1349() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1348() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1347() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1346() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1345() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1344() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1343() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1342() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1341() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1340() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1339() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1338() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1337() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1336() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1335() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1334() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1333() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1332() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1331() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1330() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1329() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1328() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1327() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1326() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1325() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1324() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1323() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1322() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1321() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1320() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1319() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1318() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1317() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1316() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1315() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1314() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1313() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1312() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1311() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1310() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1309() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1308() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1307() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1306() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1305() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1304() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1303() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1302() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1301() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1300() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1299() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1298() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1297() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1296() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1295() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1294() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1293() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1292() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1291() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1290() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1289() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1288() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1287() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1286() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1285() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1284() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1283() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1282() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1281() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1280() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1279() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1278() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1277() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1276() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1275() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1274() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1273() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1272() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1271() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1270() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1269() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1268() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1267() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1266() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1265() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1264() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1263() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1262() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1261() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1260() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1259() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1258() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1257() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1256() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1255() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1254() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1253() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1252() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1251() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1250() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1249() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1248() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1247() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1246() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1245() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1244() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1243() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1242() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1241() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1240() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1239() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1238() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1237() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1236() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1235() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1234() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1233() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1232() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1231() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1230() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1229() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1228() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1227() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1226() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1225() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1224() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1223() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1222() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1221() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1220() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1219() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1218() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1217() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1216() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1215() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1214() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1213() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1212() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1211() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1210() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1209() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1208() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1207() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1206() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1205() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1204() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1203() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1202() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1201() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1200() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1199() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1198() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1197() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1196() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1195() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1194() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1193() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1192() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1191() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1190() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1189() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1188() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1187() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1186() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1185() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1184() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1183() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1182() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1181() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1180() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1179() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1178() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1177() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1176() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1175() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1174() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1173() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1172() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1171() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1170() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1169() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1168() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1167() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1166() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1165() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1164() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1163() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1162() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1161() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1160() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1159() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1158() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1157() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1156() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1155() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1154() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1153() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1152() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1151() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1150() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1149() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1148() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1147() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1146() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1145() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1144() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1143() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1142() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1141() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1140() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1139() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1138() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1137() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1136() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1135() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1134() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1133() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1132() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1131() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1130() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1129() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1128() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1127() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1126() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1125() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1124() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1123() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1122() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1121() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1120() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1119() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1118() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1117() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1116() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1115() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1114() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1113() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1112() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1111() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1110() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1109() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1108() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1107() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1106() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1105() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1104() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1103() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1102() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1101() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1100() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1099() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1098() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1097() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1096() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1095() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1094() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1093() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1092() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1091() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1090() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1089() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1088() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1087() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1086() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1085() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1084() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1083() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1082() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1081() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1080() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1079() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1078() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1077() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1076() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1075() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1074() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1073() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1072() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1071() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1070() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1069() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1068() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1067() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1066() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1065() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1064() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1063() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1062() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1061() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1060() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1059() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1058() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1057() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1056() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1055() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1054() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1053() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1052() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1051() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1050() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1049() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1048() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1047() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1046() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1045() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1044() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1043() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1042() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1041() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1040() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1039() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1038() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1037() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1036() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1035() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1034() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1033() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1032() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1031() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1030() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1029() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1028() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1027() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1026() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1025() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1024() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1023() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1022() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1021() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1020() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1019() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1018() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1017() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1016() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1015() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1014() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1013() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1012() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1011() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1010() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1009() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1008() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1007() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1006() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1005() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1004() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1003() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1002() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1001() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
    }

    public void testDefaultDateSerialization_1000() {
        java.util.Date now = new java.util.Date(1315806903103L);
        java.lang.String json = gson.toJson(now);
        junit.framework.Assert.assertEquals("\"Sep 11, 2011 10:55:03 PM\"", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testDefaultDateSerialization_2000.class) {}) {
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