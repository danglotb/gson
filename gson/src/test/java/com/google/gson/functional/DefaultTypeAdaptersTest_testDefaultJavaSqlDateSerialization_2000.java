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
public class DefaultTypeAdaptersTest_testDefaultJavaSqlDateSerialization_2000 extends junit.framework.TestCase {
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

    public void testDefaultJavaSqlDateSerialization_1999() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1998() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1997() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1996() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1995() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1994() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1993() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1992() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1991() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1990() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1989() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1988() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1987() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1986() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1985() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1984() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1983() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1982() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1981() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1980() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1979() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1978() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1977() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1976() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1975() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1974() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1973() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1972() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1971() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1970() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1969() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1968() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1967() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1966() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1965() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1964() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1963() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1962() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1961() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1960() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1959() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1958() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1957() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1956() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1955() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1954() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1953() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1952() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1951() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1950() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1949() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1948() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1947() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1946() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1945() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1944() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1943() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1942() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1941() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1940() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1939() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1938() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1937() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1936() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1935() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1934() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1933() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1932() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1931() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1930() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1929() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1928() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1927() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1926() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1925() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1924() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1923() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1922() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1921() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1920() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1919() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1918() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1917() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1916() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1915() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1914() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1913() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1912() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1911() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1910() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1909() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1908() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1907() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1906() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1905() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1904() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1903() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1902() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1901() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1900() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1899() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1898() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1897() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1896() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1895() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1894() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1893() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1892() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1891() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1890() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1889() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1888() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1887() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1886() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1885() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1884() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1883() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1882() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1881() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1880() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1879() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1878() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1877() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1876() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1875() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1874() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1873() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1872() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1871() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1870() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1869() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1868() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1867() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1866() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1865() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1864() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1863() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1862() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1861() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1860() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1859() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1858() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1857() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1856() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1855() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1854() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1853() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1852() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1851() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1850() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1849() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1848() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1847() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1846() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1845() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1844() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1843() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1842() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1841() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1840() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1839() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1838() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1837() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1836() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1835() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1834() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1833() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1832() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1831() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1830() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1829() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1828() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1827() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1826() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1825() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1824() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1823() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1822() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1821() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1820() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1819() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1818() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1817() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1816() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1815() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1814() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1813() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1812() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1811() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1810() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1809() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1808() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1807() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1806() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1805() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1804() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1803() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1802() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1801() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1800() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1799() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1798() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1797() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1796() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1795() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1794() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1793() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1792() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1791() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1790() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1789() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1788() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1787() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1786() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1785() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1784() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1783() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1782() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1781() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1780() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1779() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1778() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1777() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1776() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1775() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1774() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1773() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1772() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1771() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1770() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1769() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1768() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1767() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1766() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1765() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1764() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1763() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1762() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1761() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1760() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1759() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1758() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1757() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1756() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1755() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1754() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1753() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1752() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1751() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1750() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1749() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1748() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1747() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1746() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1745() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1744() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1743() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1742() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1741() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1740() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1739() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1738() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1737() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1736() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1735() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1734() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1733() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1732() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1731() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1730() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1729() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1728() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1727() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1726() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1725() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1724() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1723() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1722() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1721() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1720() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1719() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1718() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1717() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1716() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1715() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1714() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1713() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1712() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1711() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1710() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1709() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1708() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1707() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1706() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1705() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1704() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1703() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1702() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1701() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1700() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1699() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1698() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1697() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1696() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1695() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1694() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1693() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1692() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1691() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1690() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1689() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1688() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1687() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1686() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1685() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1684() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1683() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1682() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1681() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1680() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1679() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1678() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1677() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1676() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1675() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1674() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1673() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1672() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1671() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1670() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1669() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1668() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1667() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1666() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1665() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1664() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1663() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1662() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1661() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1660() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1659() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1658() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1657() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1656() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1655() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1654() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1653() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1652() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1651() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1650() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1649() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1648() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1647() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1646() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1645() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1644() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1643() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1642() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1641() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1640() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1639() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1638() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1637() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1636() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1635() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1634() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1633() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1632() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1631() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1630() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1629() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1628() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1627() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1626() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1625() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1624() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1623() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1622() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1621() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1620() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1619() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1618() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1617() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1616() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1615() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1614() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1613() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1612() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1611() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1610() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1609() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1608() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1607() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1606() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1605() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1604() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1603() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1602() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1601() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1600() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1599() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1598() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1597() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1596() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1595() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1594() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1593() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1592() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1591() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1590() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1589() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1588() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1587() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1586() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1585() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1584() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1583() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1582() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1581() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1580() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1579() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1578() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1577() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1576() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1575() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1574() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1573() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1572() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1571() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1570() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1569() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1568() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1567() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1566() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1565() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1564() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1563() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1562() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1561() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1560() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1559() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1558() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1557() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1556() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1555() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1554() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1553() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1552() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1551() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1550() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1549() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1548() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1547() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1546() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1545() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1544() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1543() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1542() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1541() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1540() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1539() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1538() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1537() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1536() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1535() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1534() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1533() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1532() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1531() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1530() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1529() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1528() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1527() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1526() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1525() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1524() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1523() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1522() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1521() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1520() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1519() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1518() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1517() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1516() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1515() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1514() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1513() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1512() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1511() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1510() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1509() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1508() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1507() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1506() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1505() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1504() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1503() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1502() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1501() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1500() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1499() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1498() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1497() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1496() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1495() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1494() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1493() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1492() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1491() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1490() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1489() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1488() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1487() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1486() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1485() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1484() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1483() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1482() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1481() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1480() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1479() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1478() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1477() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1476() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1475() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1474() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1473() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1472() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1471() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1470() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1469() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1468() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1467() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1466() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1465() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1464() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1463() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1462() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1461() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1460() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1459() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1458() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1457() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1456() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1455() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1454() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1453() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1452() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1451() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1450() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1449() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1448() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1447() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1446() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1445() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1444() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1443() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1442() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1441() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1440() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1439() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1438() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1437() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1436() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1435() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1434() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1433() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1432() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1431() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1430() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1429() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1428() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1427() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1426() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1425() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1424() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1423() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1422() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1421() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1420() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1419() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1418() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1417() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1416() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1415() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1414() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1413() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1412() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1411() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1410() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1409() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1408() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1407() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1406() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1405() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1404() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1403() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1402() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1401() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1400() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1399() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1398() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1397() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1396() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1395() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1394() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1393() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1392() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1391() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1390() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1389() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1388() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1387() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1386() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1385() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1384() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1383() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1382() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1381() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1380() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1379() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1378() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1377() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1376() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1375() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1374() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1373() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1372() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1371() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1370() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1369() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1368() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1367() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1366() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1365() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1364() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1363() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1362() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1361() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1360() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1359() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1358() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1357() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1356() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1355() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1354() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1353() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1352() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1351() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1350() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1349() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1348() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1347() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1346() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1345() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1344() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1343() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1342() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1341() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1340() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1339() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1338() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1337() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1336() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1335() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1334() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1333() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1332() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1331() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1330() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1329() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1328() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1327() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1326() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1325() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1324() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1323() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1322() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1321() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1320() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1319() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1318() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1317() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1316() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1315() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1314() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1313() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1312() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1311() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1310() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1309() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1308() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1307() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1306() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1305() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1304() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1303() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1302() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1301() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1300() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1299() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1298() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1297() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1296() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1295() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1294() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1293() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1292() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1291() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1290() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1289() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1288() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1287() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1286() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1285() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1284() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1283() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1282() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1281() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1280() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1279() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1278() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1277() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1276() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1275() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1274() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1273() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1272() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1271() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1270() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1269() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1268() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1267() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1266() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1265() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1264() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1263() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1262() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1261() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1260() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1259() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1258() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1257() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1256() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1255() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1254() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1253() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1252() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1251() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1250() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1249() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1248() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1247() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1246() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1245() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1244() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1243() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1242() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1241() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1240() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1239() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1238() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1237() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1236() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1235() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1234() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1233() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1232() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1231() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1230() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1229() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1228() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1227() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1226() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1225() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1224() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1223() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1222() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1221() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1220() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1219() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1218() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1217() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1216() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1215() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1214() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1213() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1212() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1211() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1210() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1209() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1208() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1207() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1206() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1205() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1204() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1203() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1202() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1201() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1200() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1199() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1198() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1197() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1196() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1195() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1194() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1193() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1192() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1191() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1190() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1189() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1188() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1187() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1186() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1185() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1184() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1183() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1182() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1181() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1180() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1179() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1178() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1177() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1176() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1175() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1174() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1173() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1172() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1171() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1170() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1169() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1168() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1167() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1166() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1165() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1164() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1163() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1162() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1161() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1160() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1159() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1158() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1157() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1156() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1155() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1154() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1153() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1152() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1151() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1150() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1149() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1148() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1147() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1146() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1145() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1144() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1143() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1142() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1141() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1140() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1139() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1138() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1137() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1136() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1135() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1134() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1133() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1132() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1131() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1130() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1129() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1128() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1127() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1126() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1125() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1124() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1123() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1122() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1121() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1120() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1119() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1118() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1117() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1116() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1115() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1114() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1113() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1112() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1111() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1110() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1109() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1108() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1107() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1106() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1105() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1104() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1103() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1102() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1101() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1100() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1099() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1098() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1097() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1096() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1095() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1094() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1093() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1092() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1091() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1090() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1089() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1088() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1087() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1086() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1085() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1084() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1083() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1082() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1081() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1080() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1079() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1078() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1077() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1076() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1075() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1074() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1073() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1072() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1071() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1070() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1069() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1068() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1067() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1066() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1065() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1064() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1063() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1062() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1061() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1060() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1059() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1058() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1057() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1056() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1055() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1054() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1053() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1052() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1051() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1050() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1049() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1048() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1047() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1046() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1045() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1044() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1043() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1042() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1041() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1040() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1039() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1038() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1037() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1036() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1035() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1034() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1033() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1032() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1031() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1030() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1029() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1028() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1027() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1026() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1025() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1024() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1023() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1022() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1021() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1020() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1019() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1018() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1017() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1016() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1015() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1014() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1013() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1012() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1011() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1010() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1009() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1008() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1007() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1006() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1005() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1004() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1003() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1002() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1001() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_1000() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_999() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_998() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_997() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_996() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_995() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_994() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_993() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_992() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_991() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_990() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_989() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_988() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_987() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_986() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_985() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_984() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_983() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_982() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_981() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_980() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_979() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_978() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_977() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_976() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_975() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_974() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_973() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_972() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_971() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_970() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_969() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_968() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_967() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_966() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_965() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_964() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_963() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_962() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_961() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_960() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_959() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_958() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_957() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_956() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_955() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_954() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_953() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_952() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_951() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_950() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_949() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_948() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_947() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_946() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_945() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_944() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_943() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_942() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_941() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_940() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_939() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_938() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_937() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_936() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_935() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_934() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_933() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_932() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_931() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_930() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_929() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_928() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_927() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_926() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_925() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_924() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_923() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_922() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_921() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_920() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_919() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_918() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_917() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_916() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_915() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_914() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_913() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_912() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_911() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_910() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_909() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_908() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_907() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_906() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_905() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_904() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_903() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_902() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_901() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_900() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_899() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_898() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_897() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_896() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_895() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_894() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_893() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_892() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_891() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_890() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_889() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_888() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_887() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_886() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_885() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_884() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_883() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_882() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_881() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_880() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_879() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_878() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_877() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_876() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_875() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_874() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_873() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_872() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_871() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_870() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_869() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_868() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_867() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_866() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_865() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_864() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_863() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_862() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_861() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_860() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_859() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_858() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_857() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_856() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_855() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_854() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_853() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_852() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_851() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_850() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_849() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_848() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_847() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_846() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_845() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_844() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_843() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_842() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_841() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_840() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_839() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_838() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_837() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_836() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_835() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_834() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_833() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_832() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_831() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_830() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_829() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_828() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_827() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_826() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_825() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_824() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_823() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_822() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_821() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_820() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_819() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_818() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_817() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_816() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_815() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_814() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_813() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_812() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_811() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_810() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_809() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_808() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_807() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_806() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_805() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_804() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_803() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_802() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_801() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_800() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_799() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_798() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_797() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_796() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_795() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_794() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_793() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_792() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_791() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_790() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_789() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_788() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_787() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_786() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_785() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_784() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_783() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_782() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_781() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_780() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_779() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_778() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_777() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_776() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_775() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_774() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_773() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_772() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_771() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_770() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_769() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_768() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_767() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_766() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_765() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_764() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_763() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_762() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_761() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_760() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_759() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_758() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_757() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_756() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_755() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_754() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_753() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_752() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_751() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_750() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_749() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_748() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_747() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_746() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_745() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_744() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_743() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_742() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_741() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_740() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_739() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_738() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_737() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_736() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_735() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_734() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_733() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_732() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_731() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_730() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_729() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_728() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_727() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_726() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_725() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_724() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_723() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_722() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_721() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_720() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_719() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_718() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_717() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_716() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_715() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_714() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_713() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_712() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_711() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_710() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_709() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_708() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_707() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_706() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_705() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_704() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_703() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_702() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_701() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_700() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_699() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_698() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_697() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_696() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_695() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_694() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_693() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_692() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_691() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_690() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_689() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_688() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_687() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_686() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_685() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_684() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_683() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_682() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_681() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_680() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_679() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_678() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_677() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_676() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_675() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_674() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_673() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_672() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_671() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_670() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_669() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_668() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_667() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_666() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_665() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_664() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_663() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_662() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_661() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_660() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_659() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_658() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_657() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_656() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_655() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_654() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_653() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_652() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_651() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_650() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_649() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_648() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_647() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_646() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_645() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_644() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_643() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_642() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_641() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_640() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_639() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_638() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_637() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_636() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_635() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_634() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_633() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_632() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_631() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_630() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_629() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_628() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_627() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_626() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_625() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_624() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_623() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_622() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_621() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_620() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_619() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_618() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_617() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_616() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_615() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_614() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_613() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_612() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_611() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_610() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_609() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_608() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_607() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_606() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_605() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_604() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_603() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_602() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_601() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_600() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_599() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_598() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_597() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_596() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_595() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_594() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_593() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_592() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_591() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_590() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_589() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_588() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_587() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_586() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_585() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_584() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_583() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_582() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_581() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_580() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_579() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_578() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_577() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_576() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_575() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_574() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_573() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_572() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_571() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_570() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_569() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_568() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_567() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_566() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_565() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_564() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_563() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_562() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_561() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_560() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_559() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_558() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_557() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_556() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_555() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_554() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_553() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_552() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_551() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_550() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_549() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_548() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_547() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_546() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_545() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_544() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_543() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_542() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_541() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_540() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_539() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_538() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_537() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_536() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_535() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_534() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_533() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_532() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_531() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_530() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_529() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_528() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_527() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_526() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_525() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_524() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_523() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_522() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_521() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_520() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_519() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_518() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_517() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_516() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_515() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_514() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_513() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_512() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_511() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_510() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_509() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_508() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_507() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_506() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_505() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_504() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_503() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_502() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_501() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_500() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_499() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_498() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_497() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_496() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_495() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_494() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_493() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_492() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_491() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_490() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_489() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_488() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_487() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_486() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_485() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_484() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_483() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_482() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_481() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_480() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_479() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_478() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_477() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_476() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_475() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_474() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_473() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_472() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_471() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_470() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_469() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_468() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_467() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_466() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_465() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_464() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_463() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_462() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_461() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_460() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_459() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_458() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_457() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_456() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_455() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_454() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_453() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_452() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_451() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_450() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_449() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_448() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_447() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_446() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_445() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_444() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_443() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_442() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_441() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_440() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_439() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_438() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_437() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_436() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_435() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_434() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_433() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_432() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_431() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_430() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_429() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_428() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_427() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_426() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_425() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_424() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_423() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_422() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_421() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_420() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_419() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_418() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_417() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_416() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_415() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_414() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_413() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_412() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_411() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_410() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_409() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_408() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_407() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_406() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_405() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_404() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_403() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_402() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_401() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_400() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_399() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_398() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_397() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_396() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_395() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_394() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_393() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_392() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_391() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_390() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_389() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_388() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_387() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_386() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_385() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_384() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_383() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_382() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_381() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_380() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_379() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_378() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_377() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_376() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_375() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_374() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_373() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_372() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_371() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_370() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_369() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_368() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_367() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_366() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_365() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_364() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_363() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_362() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_361() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_360() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_359() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_358() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_357() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_356() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_355() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_354() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_353() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_352() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_351() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_350() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_349() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_348() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_347() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_346() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_345() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_344() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_343() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_342() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_341() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_340() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_339() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_338() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_337() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_336() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_335() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_334() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_333() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_332() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_331() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_330() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_329() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_328() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_327() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_326() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_325() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_324() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_323() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_322() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_321() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_320() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_319() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_318() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_317() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_316() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_315() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_314() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_313() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_312() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_311() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_310() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_309() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_308() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_307() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_306() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_305() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_304() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_303() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_302() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_301() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_300() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_299() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_298() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_297() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_296() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_295() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_294() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_293() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_292() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_291() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_290() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_289() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_288() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_287() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_286() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_285() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_284() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_283() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_282() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_281() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_280() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_279() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_278() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_277() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_276() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_275() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_274() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_273() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_272() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_271() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_270() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_269() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_268() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_267() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_266() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_265() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_264() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_263() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_262() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_261() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_260() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_259() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_258() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_257() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_256() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_255() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_254() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_253() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_252() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_251() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_250() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_249() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_248() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_247() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_246() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_245() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_244() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_243() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_242() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_241() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_240() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_239() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_238() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_237() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_236() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_235() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_234() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_233() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_232() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_231() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_230() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_229() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_228() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_227() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_226() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_225() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_224() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_223() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_222() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_221() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_220() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_219() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_218() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_217() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_216() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_215() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_214() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_213() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_212() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_211() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_210() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_209() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_208() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_207() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_206() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_205() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_204() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_203() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_202() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_201() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_200() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_199() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_198() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_197() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_196() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_195() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_194() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_193() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_192() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_191() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_190() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_189() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_188() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_187() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_186() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_185() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_184() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_183() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_182() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_181() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_180() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_179() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_178() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_177() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_176() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_175() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_174() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_173() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_172() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_171() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_170() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_169() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_168() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_167() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_166() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_165() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_164() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_163() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_162() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_161() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_160() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_159() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_158() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_157() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_156() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_155() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_154() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_153() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_152() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_151() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_150() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_149() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_148() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_147() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_146() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_145() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_144() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_143() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_142() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_141() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_140() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_139() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_138() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_137() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_136() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_135() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_134() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_133() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_132() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_131() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_130() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_129() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_128() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_127() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_126() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_125() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_124() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_123() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_122() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_121() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_120() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_119() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_118() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_117() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_116() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_115() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_114() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_113() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_112() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_111() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_110() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_109() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_108() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_107() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_106() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_105() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_104() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_103() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_102() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_101() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
    }

    public void testDefaultJavaSqlDateSerialization_100() {
        java.sql.Date instant = new java.sql.Date(1259875082000L);
        java.lang.String json = gson.toJson(instant);
        junit.framework.Assert.assertEquals("\"Dec 3, 2009\"", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.DefaultTypeAdaptersTest_testDefaultJavaSqlDateSerialization_2000.class) {}) {
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