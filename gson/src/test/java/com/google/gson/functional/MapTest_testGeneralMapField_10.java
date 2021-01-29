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
 * Functional test for Json serialization and deserialization for Maps
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class MapTest_testGeneralMapField_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    private static class MyParameterizedMap<K, V> extends java.util.LinkedHashMap<K, V> {
        private static final long serialVersionUID = 1L;

        @java.lang.SuppressWarnings("unused")
        int foo = 10;
    }

    /**
     * Created in response to http://code.google.com/p/google-gson/issues/detail?id=99
     */
    private static class ClassWithAMap {
        java.util.Map<java.lang.String, java.lang.String> map = new java.util.TreeMap<java.lang.String, java.lang.String>();
    }

    private static class MyMap extends java.util.LinkedHashMap<java.lang.String, java.lang.String> {
        private static final long serialVersionUID = 1L;

        @java.lang.SuppressWarnings("unused")
        int foo = 10;
    }

    public void testGeneralMapField_9() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_8() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_7() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_6() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_5() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_4() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_3() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_2() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_1() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_0() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_10.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    static final class MapClass {
        private final java.util.Map<java.lang.String, com.google.gson.common.TestTypes.Base> bases = new java.util.HashMap<java.lang.String, com.google.gson.common.TestTypes.Base>();

        private final java.util.Map<java.lang.String, com.google.gson.common.TestTypes.Sub> subs = new java.util.HashMap<java.lang.String, com.google.gson.common.TestTypes.Sub>();

        public final void addBase(java.lang.String name, com.google.gson.common.TestTypes.Base value) {
            bases.put(name, value);
        }

        public final void addSub(java.lang.String name, com.google.gson.common.TestTypes.Sub value) {
            subs.put(name, value);
        }
    }

    @java.lang.SuppressWarnings("unchecked")
    static final class MapWithGeneralMapParameters {
        final java.util.Map<java.lang.String, java.lang.Object> map = new java.util.LinkedHashMap();
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.MapTest_testGeneralMapField_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.MapTest", "testGeneralMapField");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}