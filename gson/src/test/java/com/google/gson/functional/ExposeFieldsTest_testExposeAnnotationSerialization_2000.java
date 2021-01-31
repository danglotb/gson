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
 * Unit tests for the regarding functional "@Expose" type tests.
 *
 * @author Joel Leitch
 */
public class ExposeFieldsTest_testExposeAnnotationSerialization_2000 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().excludeFieldsWithoutExposeAnnotation().registerTypeAdapter(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.SomeInterface.class, new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.SomeInterfaceInstanceCreator()).create();
    }

    public void testExposeAnnotationSerialization_1999() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1998() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1997() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1996() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1995() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1994() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1993() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1992() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1991() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1990() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1989() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1988() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1987() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1986() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1985() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1984() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1983() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1982() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1981() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1980() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1979() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1978() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1977() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1976() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1975() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1974() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1973() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1972() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1971() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1970() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1969() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1968() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1967() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1966() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1965() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1964() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1963() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1962() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1961() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1960() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1959() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1958() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1957() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1956() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1955() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1954() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1953() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1952() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1951() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1950() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1949() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1948() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1947() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1946() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1945() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1944() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1943() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1942() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1941() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1940() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1939() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1938() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1937() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1936() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1935() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1934() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1933() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1932() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1931() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1930() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1929() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1928() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1927() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1926() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1925() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1924() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1923() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1922() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1921() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1920() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1919() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1918() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1917() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1916() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1915() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1914() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1913() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1912() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1911() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1910() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1909() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1908() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1907() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1906() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1905() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1904() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1903() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1902() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1901() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1900() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1899() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1898() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1897() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1896() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1895() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1894() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1893() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1892() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1891() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1890() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1889() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1888() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1887() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1886() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1885() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1884() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1883() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1882() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1881() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1880() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1879() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1878() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1877() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1876() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1875() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1874() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1873() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1872() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1871() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1870() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1869() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1868() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1867() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1866() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1865() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1864() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1863() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1862() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1861() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1860() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1859() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1858() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1857() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1856() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1855() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1854() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1853() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1852() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1851() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1850() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1849() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1848() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1847() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1846() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1845() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1844() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1843() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1842() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1841() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1840() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1839() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1838() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1837() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1836() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1835() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1834() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1833() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1832() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1831() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1830() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1829() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1828() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1827() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1826() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1825() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1824() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1823() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1822() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1821() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1820() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1819() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1818() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1817() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1816() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1815() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1814() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1813() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1812() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1811() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1810() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1809() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1808() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1807() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1806() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1805() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1804() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1803() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1802() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1801() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1800() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1799() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1798() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1797() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1796() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1795() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1794() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1793() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1792() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1791() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1790() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1789() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1788() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1787() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1786() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1785() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1784() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1783() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1782() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1781() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1780() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1779() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1778() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1777() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1776() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1775() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1774() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1773() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1772() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1771() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1770() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1769() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1768() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1767() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1766() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1765() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1764() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1763() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1762() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1761() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1760() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1759() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1758() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1757() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1756() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1755() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1754() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1753() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1752() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1751() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1750() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1749() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1748() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1747() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1746() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1745() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1744() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1743() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1742() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1741() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1740() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1739() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1738() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1737() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1736() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1735() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1734() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1733() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1732() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1731() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1730() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1729() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1728() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1727() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1726() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1725() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1724() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1723() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1722() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1721() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1720() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1719() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1718() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1717() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1716() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1715() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1714() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1713() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1712() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1711() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1710() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1709() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1708() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1707() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1706() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1705() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1704() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1703() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1702() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1701() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1700() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1699() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1698() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1697() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1696() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1695() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1694() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1693() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1692() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1691() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1690() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1689() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1688() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1687() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1686() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1685() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1684() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1683() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1682() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1681() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1680() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1679() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1678() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1677() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1676() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1675() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1674() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1673() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1672() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1671() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1670() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1669() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1668() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1667() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1666() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1665() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1664() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1663() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1662() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1661() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1660() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1659() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1658() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1657() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1656() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1655() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1654() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1653() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1652() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1651() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1650() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1649() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1648() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1647() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1646() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1645() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1644() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1643() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1642() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1641() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1640() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1639() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1638() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1637() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1636() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1635() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1634() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1633() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1632() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1631() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1630() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1629() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1628() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1627() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1626() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1625() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1624() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1623() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1622() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1621() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1620() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1619() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1618() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1617() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1616() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1615() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1614() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1613() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1612() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1611() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1610() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1609() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1608() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1607() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1606() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1605() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1604() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1603() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1602() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1601() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1600() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1599() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1598() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1597() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1596() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1595() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1594() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1593() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1592() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1591() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1590() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1589() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1588() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1587() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1586() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1585() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1584() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1583() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1582() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1581() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1580() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1579() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1578() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1577() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1576() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1575() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1574() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1573() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1572() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1571() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1570() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1569() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1568() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1567() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1566() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1565() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1564() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1563() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1562() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1561() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1560() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1559() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1558() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1557() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1556() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1555() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1554() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1553() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1552() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1551() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1550() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1549() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1548() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1547() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1546() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1545() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1544() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1543() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1542() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1541() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1540() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1539() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1538() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1537() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1536() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1535() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1534() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1533() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1532() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1531() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1530() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1529() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1528() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1527() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1526() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1525() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1524() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1523() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1522() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1521() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1520() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1519() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1518() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1517() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1516() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1515() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1514() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1513() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1512() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1511() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1510() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1509() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1508() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1507() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1506() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1505() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1504() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1503() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1502() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1501() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1500() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1499() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1498() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1497() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1496() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1495() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1494() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1493() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1492() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1491() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1490() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1489() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1488() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1487() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1486() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1485() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1484() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1483() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1482() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1481() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1480() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1479() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1478() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1477() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1476() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1475() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1474() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1473() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1472() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1471() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1470() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1469() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1468() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1467() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1466() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1465() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1464() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1463() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1462() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1461() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1460() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1459() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1458() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1457() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1456() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1455() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1454() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1453() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1452() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1451() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1450() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1449() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1448() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1447() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1446() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1445() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1444() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1443() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1442() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1441() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1440() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1439() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1438() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1437() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1436() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1435() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1434() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1433() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1432() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1431() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1430() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1429() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1428() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1427() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1426() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1425() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1424() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1423() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1422() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1421() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1420() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1419() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1418() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1417() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1416() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1415() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1414() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1413() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1412() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1411() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1410() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1409() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1408() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1407() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1406() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1405() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1404() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1403() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1402() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1401() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1400() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1399() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1398() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1397() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1396() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1395() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1394() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1393() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1392() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1391() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1390() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1389() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1388() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1387() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1386() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1385() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1384() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1383() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1382() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1381() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1380() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1379() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1378() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1377() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1376() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1375() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1374() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1373() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1372() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1371() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1370() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1369() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1368() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1367() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1366() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1365() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1364() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1363() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1362() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1361() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1360() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1359() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1358() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1357() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1356() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1355() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1354() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1353() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1352() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1351() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1350() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1349() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1348() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1347() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1346() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1345() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1344() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1343() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1342() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1341() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1340() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1339() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1338() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1337() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1336() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1335() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1334() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1333() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1332() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1331() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1330() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1329() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1328() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1327() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1326() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1325() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1324() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1323() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1322() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1321() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1320() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1319() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1318() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1317() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1316() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1315() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1314() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1313() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1312() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1311() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1310() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1309() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1308() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1307() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1306() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1305() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1304() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1303() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1302() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1301() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1300() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1299() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1298() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1297() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1296() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1295() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1294() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1293() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1292() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1291() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1290() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1289() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1288() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1287() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1286() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1285() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1284() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1283() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1282() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1281() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1280() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1279() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1278() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1277() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1276() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1275() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1274() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1273() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1272() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1271() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1270() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1269() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1268() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1267() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1266() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1265() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1264() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1263() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1262() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1261() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1260() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1259() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1258() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1257() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1256() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1255() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1254() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1253() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1252() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1251() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1250() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1249() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1248() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1247() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1246() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1245() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1244() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1243() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1242() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1241() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1240() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1239() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1238() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1237() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1236() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1235() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1234() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1233() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1232() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1231() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1230() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1229() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1228() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1227() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1226() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1225() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1224() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1223() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1222() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1221() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1220() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1219() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1218() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1217() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1216() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1215() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1214() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1213() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1212() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1211() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1210() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1209() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1208() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1207() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1206() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1205() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1204() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1203() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1202() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1201() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1200() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1199() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1198() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1197() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1196() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1195() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1194() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1193() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1192() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1191() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1190() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1189() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1188() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1187() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1186() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1185() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1184() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1183() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1182() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1181() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1180() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1179() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1178() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1177() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1176() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1175() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1174() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1173() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1172() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1171() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1170() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1169() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1168() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1167() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1166() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1165() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1164() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1163() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1162() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1161() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1160() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1159() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1158() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1157() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1156() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1155() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1154() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1153() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1152() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1151() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1150() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1149() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1148() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1147() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1146() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1145() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1144() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1143() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1142() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1141() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1140() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1139() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1138() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1137() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1136() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1135() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1134() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1133() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1132() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1131() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1130() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1129() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1128() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1127() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1126() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1125() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1124() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1123() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1122() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1121() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1120() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1119() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1118() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1117() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1116() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1115() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1114() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1113() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1112() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1111() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1110() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1109() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1108() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1107() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1106() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1105() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1104() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1103() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1102() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1101() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1100() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1099() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1098() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1097() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1096() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1095() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1094() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1093() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1092() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1091() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1090() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1089() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1088() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1087() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1086() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1085() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1084() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1083() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1082() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1081() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1080() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1079() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1078() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1077() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1076() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1075() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1074() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1073() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1072() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1071() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1070() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1069() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1068() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1067() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1066() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1065() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1064() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1063() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1062() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1061() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1060() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1059() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1058() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1057() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1056() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1055() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1054() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1053() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1052() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1051() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1050() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1049() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1048() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1047() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1046() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1045() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1044() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1043() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1042() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1041() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1040() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1039() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1038() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1037() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1036() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1035() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1034() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1033() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1032() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1031() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1030() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1029() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1028() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1027() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1026() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1025() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1024() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1023() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1022() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1021() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1020() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1019() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1018() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1017() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1016() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1015() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1014() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1013() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1012() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1011() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1010() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1009() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1008() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1007() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1006() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1005() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1004() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1003() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1002() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1001() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1000() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_999() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_998() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_997() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_996() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_995() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_994() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_993() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_992() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_991() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_990() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_989() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_988() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_987() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_986() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_985() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_984() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_983() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_982() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_981() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_980() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_979() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_978() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_977() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_976() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_975() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_974() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_973() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_972() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_971() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_970() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_969() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_968() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_967() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_966() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_965() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_964() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_963() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_962() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_961() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_960() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_959() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_958() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_957() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_956() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_955() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_954() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_953() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_952() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_951() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_950() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_949() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_948() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_947() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_946() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_945() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_944() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_943() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_942() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_941() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_940() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_939() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_938() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_937() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_936() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_935() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_934() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_933() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_932() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_931() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_930() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_929() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_928() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_927() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_926() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_925() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_924() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_923() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_922() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_921() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_920() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_919() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_918() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_917() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_916() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_915() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_914() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_913() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_912() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_911() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_910() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_909() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_908() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_907() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_906() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_905() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_904() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_903() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_902() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_901() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_900() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_899() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_898() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_897() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_896() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_895() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_894() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_893() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_892() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_891() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_890() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_889() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_888() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_887() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_886() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_885() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_884() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_883() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_882() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_881() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_880() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_879() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_878() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_877() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_876() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_875() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_874() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_873() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_872() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_871() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_870() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_869() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_868() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_867() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_866() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_865() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_864() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_863() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_862() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_861() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_860() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_859() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_858() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_857() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_856() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_855() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_854() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_853() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_852() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_851() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_850() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_849() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_848() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_847() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_846() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_845() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_844() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_843() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_842() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_841() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_840() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_839() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_838() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_837() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_836() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_835() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_834() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_833() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_832() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_831() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_830() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_829() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_828() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_827() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_826() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_825() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_824() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_823() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_822() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_821() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_820() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_819() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_818() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_817() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_816() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_815() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_814() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_813() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_812() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_811() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_810() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_809() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_808() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_807() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_806() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_805() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_804() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_803() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_802() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_801() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_800() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_799() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_798() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_797() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_796() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_795() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_794() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_793() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_792() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_791() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_790() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_789() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_788() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_787() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_786() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_785() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_784() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_783() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_782() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_781() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_780() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_779() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_778() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_777() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_776() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_775() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_774() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_773() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_772() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_771() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_770() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_769() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_768() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_767() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_766() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_765() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_764() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_763() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_762() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_761() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_760() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_759() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_758() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_757() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_756() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_755() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_754() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_753() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_752() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_751() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_750() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_749() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_748() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_747() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_746() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_745() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_744() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_743() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_742() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_741() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_740() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_739() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_738() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_737() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_736() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_735() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_734() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_733() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_732() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_731() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_730() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_729() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_728() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_727() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_726() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_725() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_724() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_723() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_722() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_721() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_720() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_719() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_718() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_717() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_716() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_715() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_714() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_713() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_712() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_711() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_710() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_709() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_708() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_707() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_706() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_705() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_704() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_703() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_702() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_701() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_700() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_699() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_698() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_697() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_696() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_695() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_694() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_693() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_692() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_691() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_690() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_689() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_688() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_687() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_686() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_685() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_684() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_683() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_682() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_681() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_680() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_679() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_678() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_677() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_676() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_675() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_674() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_673() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_672() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_671() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_670() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_669() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_668() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_667() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_666() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_665() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_664() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_663() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_662() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_661() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_660() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_659() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_658() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_657() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_656() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_655() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_654() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_653() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_652() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_651() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_650() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_649() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_648() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_647() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_646() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_645() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_644() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_643() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_642() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_641() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_640() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_639() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_638() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_637() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_636() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_635() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_634() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_633() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_632() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_631() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_630() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_629() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_628() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_627() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_626() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_625() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_624() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_623() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_622() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_621() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_620() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_619() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_618() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_617() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_616() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_615() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_614() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_613() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_612() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_611() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_610() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_609() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_608() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_607() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_606() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_605() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_604() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_603() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_602() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_601() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_600() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_599() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_598() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_597() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_596() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_595() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_594() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_593() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_592() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_591() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_590() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_589() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_588() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_587() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_586() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_585() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_584() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_583() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_582() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_581() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_580() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_579() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_578() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_577() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_576() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_575() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_574() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_573() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_572() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_571() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_570() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_569() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_568() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_567() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_566() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_565() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_564() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_563() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_562() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_561() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_560() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_559() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_558() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_557() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_556() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_555() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_554() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_553() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_552() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_551() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_550() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_549() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_548() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_547() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_546() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_545() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_544() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_543() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_542() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_541() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_540() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_539() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_538() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_537() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_536() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_535() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_534() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_533() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_532() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_531() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_530() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_529() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_528() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_527() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_526() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_525() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_524() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_523() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_522() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_521() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_520() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_519() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_518() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_517() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_516() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_515() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_514() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_513() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_512() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_511() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_510() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_509() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_508() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_507() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_506() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_505() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_504() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_503() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_502() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_501() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_500() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_499() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_498() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_497() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_496() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_495() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_494() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_493() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_492() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_491() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_490() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_489() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_488() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_487() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_486() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_485() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_484() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_483() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_482() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_481() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_480() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_479() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_478() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_477() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_476() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_475() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_474() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_473() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_472() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_471() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_470() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_469() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_468() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_467() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_466() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_465() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_464() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_463() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_462() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_461() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_460() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_459() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_458() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_457() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_456() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_455() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_454() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_453() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_452() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_451() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_450() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_449() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_448() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_447() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_446() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_445() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_444() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_443() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_442() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_441() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_440() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_439() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_438() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_437() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_436() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_435() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_434() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_433() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_432() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_431() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_430() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_429() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_428() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_427() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_426() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_425() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_424() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_423() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_422() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_421() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_420() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_419() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_418() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_417() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_416() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_415() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_414() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_413() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_412() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_411() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_410() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_409() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_408() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_407() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_406() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_405() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_404() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_403() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_402() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_401() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_400() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_399() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_398() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_397() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_396() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_395() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_394() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_393() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_392() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_391() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_390() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_389() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_388() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_387() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_386() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_385() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_384() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_383() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_382() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_381() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_380() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_379() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_378() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_377() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_376() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_375() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_374() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_373() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_372() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_371() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_370() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_369() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_368() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_367() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_366() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_365() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_364() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_363() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_362() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_361() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_360() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_359() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_358() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_357() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_356() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_355() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_354() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_353() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_352() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_351() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_350() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_349() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_348() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_347() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_346() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_345() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_344() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_343() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_342() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_341() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_340() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_339() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_338() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_337() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_336() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_335() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_334() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_333() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_332() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_331() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_330() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_329() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_328() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_327() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_326() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_325() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_324() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_323() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_322() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_321() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_320() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_319() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_318() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_317() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_316() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_315() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_314() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_313() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_312() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_311() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_310() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_309() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_308() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_307() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_306() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_305() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_304() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_303() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_302() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_301() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_300() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_299() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_298() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_297() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_296() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_295() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_294() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_293() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_292() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_291() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_290() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_289() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_288() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_287() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_286() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_285() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_284() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_283() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_282() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_281() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_280() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_279() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_278() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_277() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_276() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_275() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_274() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_273() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_272() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_271() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_270() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_269() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_268() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_267() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_266() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_265() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_264() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_263() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_262() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_261() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_260() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_259() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_258() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_257() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_256() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_255() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_254() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_253() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_252() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_251() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_250() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_249() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_248() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_247() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_246() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_245() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_244() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_243() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_242() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_241() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_240() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_239() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_238() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_237() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_236() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_235() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_234() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_233() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_232() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_231() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_230() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_229() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_228() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_227() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_226() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_225() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_224() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_223() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_222() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_221() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_220() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_219() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_218() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_217() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_216() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_215() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_214() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_213() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_212() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_211() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_210() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_209() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_208() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_207() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_206() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_205() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_204() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_203() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_202() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_201() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_200() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_199() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_198() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_197() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_196() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_195() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_194() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_193() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_192() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_191() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_190() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_189() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_188() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_187() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_186() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_185() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_184() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_183() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_182() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_181() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_180() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_179() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_178() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_177() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_176() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_175() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_174() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_173() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_172() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_171() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_170() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_169() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_168() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_167() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_166() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_165() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_164() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_163() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_162() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_161() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_160() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_159() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_158() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_157() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_156() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_155() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_154() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_153() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_152() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_151() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_150() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_149() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_148() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_147() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_146() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_145() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_144() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_143() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_142() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_141() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_140() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_139() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_138() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_137() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_136() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_135() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_134() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_133() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_132() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_131() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_130() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_129() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_128() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_127() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_126() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_125() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_124() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_123() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_122() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_121() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_120() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_119() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_118() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_117() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_116() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_115() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_114() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_113() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_112() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_111() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_110() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_109() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_108() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_107() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_106() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_105() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_104() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_103() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_102() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_101() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_100() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_99() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_98() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_97() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_96() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_95() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_94() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_93() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_92() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_91() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_90() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_89() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_88() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_87() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_86() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_85() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_84() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_83() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_82() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_81() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_80() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_79() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_78() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_77() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_76() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_75() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_74() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_73() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_72() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_71() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_70() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_69() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_68() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_67() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_66() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_65() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_64() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_63() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_62() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_61() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_60() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_59() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_58() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_57() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_56() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_55() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_54() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_53() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_52() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_51() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_50() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_49() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_48() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_47() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_46() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_45() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_44() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_43() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_42() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_41() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_40() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_39() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_38() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_37() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_36() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_35() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_34() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_33() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_32() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_31() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_30() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_29() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_28() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_27() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_26() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_25() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_24() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_23() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_22() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_21() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_20() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_19() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_18() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_17() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_16() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_15() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_14() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_13() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_12() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_11() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_10() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_9() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_8() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_7() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_6() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_5() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_4() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_3() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_2() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_0() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    @java.lang.SuppressWarnings("unused")
    private static class ClassWithExposedFields {
        @com.google.gson.annotations.Expose
        private final java.lang.Integer a;

        private final java.lang.Integer b;

        @com.google.gson.annotations.Expose(serialize = false)
        final long c;

        @com.google.gson.annotations.Expose(deserialize = false)
        final double d;

        @com.google.gson.annotations.Expose(serialize = false, deserialize = false)
        final char e;

        public ClassWithExposedFields(java.lang.Integer a, java.lang.Integer b) {
            this(a, b, 1L, 2.0, 'a');
        }

        public ClassWithExposedFields(java.lang.Integer a, java.lang.Integer b, long c, double d, char e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }

        public java.lang.String getExpectedJson() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
            if (a != null) {
                sb.append("\"a\":").append(a).append(",");
            }
            sb.append("\"d\":").append(d);
            sb.append("}");
            return sb.toString();
        }
    }

    private static class ClassWithNoExposedFields {
        private final int a = 0;

        private final int b = 1;
    }

    // Empty interface
    private static interface SomeInterface {}

    // Do nothing
    private static class SomeObject implements com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.SomeInterface {}

    private static class SomeInterfaceInstanceCreator implements com.google.gson.InstanceCreator<com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.SomeInterface> {
        public com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.SomeInterface createInstance(java.lang.reflect.Type type) {
            return new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.SomeObject();
        }
    }

    private static class ClassWithInterfaceField {
        @com.google.gson.annotations.Expose
        private final com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.SomeInterface interfaceField;

        public ClassWithInterfaceField(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.SomeInterface interfaceField) {
            this.interfaceField = interfaceField;
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_2000.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.ExposeFieldsTest", "testExposeAnnotationSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}