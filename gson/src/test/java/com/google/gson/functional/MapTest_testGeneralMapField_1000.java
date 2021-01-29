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
public class MapTest_testGeneralMapField_1000 extends junit.framework.TestCase {
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

    public void testGeneralMapField_999() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_998() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_997() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_996() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_995() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_994() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_993() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_992() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_991() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_990() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_989() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_988() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_987() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_986() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_985() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_984() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_983() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_982() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_981() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_980() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_979() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_978() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_977() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_976() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_975() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_974() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_973() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_972() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_971() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_970() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_969() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_968() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_967() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_966() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_965() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_964() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_963() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_962() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_961() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_960() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_959() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_958() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_957() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_956() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_955() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_954() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_953() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_952() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_951() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_950() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_949() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_948() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_947() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_946() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_945() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_944() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_943() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_942() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_941() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_940() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_939() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_938() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_937() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_936() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_935() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_934() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_933() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_932() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_931() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_930() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_929() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_928() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_927() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_926() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_925() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_924() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_923() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_922() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_921() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_920() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_919() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_918() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_917() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_916() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_915() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_914() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_913() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_912() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_911() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_910() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_909() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_908() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_907() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_906() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_905() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_904() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_903() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_902() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_901() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_900() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_899() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_898() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_897() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_896() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_895() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_894() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_893() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_892() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_891() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_890() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_889() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_888() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_887() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_886() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_885() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_884() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_883() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_882() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_881() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_880() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_879() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_878() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_877() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_876() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_875() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_874() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_873() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_872() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_871() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_870() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_869() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_868() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_867() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_866() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_865() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_864() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_863() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_862() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_861() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_860() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_859() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_858() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_857() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_856() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_855() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_854() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_853() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_852() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_851() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_850() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_849() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_848() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_847() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_846() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_845() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_844() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_843() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_842() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_841() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_840() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_839() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_838() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_837() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_836() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_835() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_834() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_833() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_832() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_831() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_830() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_829() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_828() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_827() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_826() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_825() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_824() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_823() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_822() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_821() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_820() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_819() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_818() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_817() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_816() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_815() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_814() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_813() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_812() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_811() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_810() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_809() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_808() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_807() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_806() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_805() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_804() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_803() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_802() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_801() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_800() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_799() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_798() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_797() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_796() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_795() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_794() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_793() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_792() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_791() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_790() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_789() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_788() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_787() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_786() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_785() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_784() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_783() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_782() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_781() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_780() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_779() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_778() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_777() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_776() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_775() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_774() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_773() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_772() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_771() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_770() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_769() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_768() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_767() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_766() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_765() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_764() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_763() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_762() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_761() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_760() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_759() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_758() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_757() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_756() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_755() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_754() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_753() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_752() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_751() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_750() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_749() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_748() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_747() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_746() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_745() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_744() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_743() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_742() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_741() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_740() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_739() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_738() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_737() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_736() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_735() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_734() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_733() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_732() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_731() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_730() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_729() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_728() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_727() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_726() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_725() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_724() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_723() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_722() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_721() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_720() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_719() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_718() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_717() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_716() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_715() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_714() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_713() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_712() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_711() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_710() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_709() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_708() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_707() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_706() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_705() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_704() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_703() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_702() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_701() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_700() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_699() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_698() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_697() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_696() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_695() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_694() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_693() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_692() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_691() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_690() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_689() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_688() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_687() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_686() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_685() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_684() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_683() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_682() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_681() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_680() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_679() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_678() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_677() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_676() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_675() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_674() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_673() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_672() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_671() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_670() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_669() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_668() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_667() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_666() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_665() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_664() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_663() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_662() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_661() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_660() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_659() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_658() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_657() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_656() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_655() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_654() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_653() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_652() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_651() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_650() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_649() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_648() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_647() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_646() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_645() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_644() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_643() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_642() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_641() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_640() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_639() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_638() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_637() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_636() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_635() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_634() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_633() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_632() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_631() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_630() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_629() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_628() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_627() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_626() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_625() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_624() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_623() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_622() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_621() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_620() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_619() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_618() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_617() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_616() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_615() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_614() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_613() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_612() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_611() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_610() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_609() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_608() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_607() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_606() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_605() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_604() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_603() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_602() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_601() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_600() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_599() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_598() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_597() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_596() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_595() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_594() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_593() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_592() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_591() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_590() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_589() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_588() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_587() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_586() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_585() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_584() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_583() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_582() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_581() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_580() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_579() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_578() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_577() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_576() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_575() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_574() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_573() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_572() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_571() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_570() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_569() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_568() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_567() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_566() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_565() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_564() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_563() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_562() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_561() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_560() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_559() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_558() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_557() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_556() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_555() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_554() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_553() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_552() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_551() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_550() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_549() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_548() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_547() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_546() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_545() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_544() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_543() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_542() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_541() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_540() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_539() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_538() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_537() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_536() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_535() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_534() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_533() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_532() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_531() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_530() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_529() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_528() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_527() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_526() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_525() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_524() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_523() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_522() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_521() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_520() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_519() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_518() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_517() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_516() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_515() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_514() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_513() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_512() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_511() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_510() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_509() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_508() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_507() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_506() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_505() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_504() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_503() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_502() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_501() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_500() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_499() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_498() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_497() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_496() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_495() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_494() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_493() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_492() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_491() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_490() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_489() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_488() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_487() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_486() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_485() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_484() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_483() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_482() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_481() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_480() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_479() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_478() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_477() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_476() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_475() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_474() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_473() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_472() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_471() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_470() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_469() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_468() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_467() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_466() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_465() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_464() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_463() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_462() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_461() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_460() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_459() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_458() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_457() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_456() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_455() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_454() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_453() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_452() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_451() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_450() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_449() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_448() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_447() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_446() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_445() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_444() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_443() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_442() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_441() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_440() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_439() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_438() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_437() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_436() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_435() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_434() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_433() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_432() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_431() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_430() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_429() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_428() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_427() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_426() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_425() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_424() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_423() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_422() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_421() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_420() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_419() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_418() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_417() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_416() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_415() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_414() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_413() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_412() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_411() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_410() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_409() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_408() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_407() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_406() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_405() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_404() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_403() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_402() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_401() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_400() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_399() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_398() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_397() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_396() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_395() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_394() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_393() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_392() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_391() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_390() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_389() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_388() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_387() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_386() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_385() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_384() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_383() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_382() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_381() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_380() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_379() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_378() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_377() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_376() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_375() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_374() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_373() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_372() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_371() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_370() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_369() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_368() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_367() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_366() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_365() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_364() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_363() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_362() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_361() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_360() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_359() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_358() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_357() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_356() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_355() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_354() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_353() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_352() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_351() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_350() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_349() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_348() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_347() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_346() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_345() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_344() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_343() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_342() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_341() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_340() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_339() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_338() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_337() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_336() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_335() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_334() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_333() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_332() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_331() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_330() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_329() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_328() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_327() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_326() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_325() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_324() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_323() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_322() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_321() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_320() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_319() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_318() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_317() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_316() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_315() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_314() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_313() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_312() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_311() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_310() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_309() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_308() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_307() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_306() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_305() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_304() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_303() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_302() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_301() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_300() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_299() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_298() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_297() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_296() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_295() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_294() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_293() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_292() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_291() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_290() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_289() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_288() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_287() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_286() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_285() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_284() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_283() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_282() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_281() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_280() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_279() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_278() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_277() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_276() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_275() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_274() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_273() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_272() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_271() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_270() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_269() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_268() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_267() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_266() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_265() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_264() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_263() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_262() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_261() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_260() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_259() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_258() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_257() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_256() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_255() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_254() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_253() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_252() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_251() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_250() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_249() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_248() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_247() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_246() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_245() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_244() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_243() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_242() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_241() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_240() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_239() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_238() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_237() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_236() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_235() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_234() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_233() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_232() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_231() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_230() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_229() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_228() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_227() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_226() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_225() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_224() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_223() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_222() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_221() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_220() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_219() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_218() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_217() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_216() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_215() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_214() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_213() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_212() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_211() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_210() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_209() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_208() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_207() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_206() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_205() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_204() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_203() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_202() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_201() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_200() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_199() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_198() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_197() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_196() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_195() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_194() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_193() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_192() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_191() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_190() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_189() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_188() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_187() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_186() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_185() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_184() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_183() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_182() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_181() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_180() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_179() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_178() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_177() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_176() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_175() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_174() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_173() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_172() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_171() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_170() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_169() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_168() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_167() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_166() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_165() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_164() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_163() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_162() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_161() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_160() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_159() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_158() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_157() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_156() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_155() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_154() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_153() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_152() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_151() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_150() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_149() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_148() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_147() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_146() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_145() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_144() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_143() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_142() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_141() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_140() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_139() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_138() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_137() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_136() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_135() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_134() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_133() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_132() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_131() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_130() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_129() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_128() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_127() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_126() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_125() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_124() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_123() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_122() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_121() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_120() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_119() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_118() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_117() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_116() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_115() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_114() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_113() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_112() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_111() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_110() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_109() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_108() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_107() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_106() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_105() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_104() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_103() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_102() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_101() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_100() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_99() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_98() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_97() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_96() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_95() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_94() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_93() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_92() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_91() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_90() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_89() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_88() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_87() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_86() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_85() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_84() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_83() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_82() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_81() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_80() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_79() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_78() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_77() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_76() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_75() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_74() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_73() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_72() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_71() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_70() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_69() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_68() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_67() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_66() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_65() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_64() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_63() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_62() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_61() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_60() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_59() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_58() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_57() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_56() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_55() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_54() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_53() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_52() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_51() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_50() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_49() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_48() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_47() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_46() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_45() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_44() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_43() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_42() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_41() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_40() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_39() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_38() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_37() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_36() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_35() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_34() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_33() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_32() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_31() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_30() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_29() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_28() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_27() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_26() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_25() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_24() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_23() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_22() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_21() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_20() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_19() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_18() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_17() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_16() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_15() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_14() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_13() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_12() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_11() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_10() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_9() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_8() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_7() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_6() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_5() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_4() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_3() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_2() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_1() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_0() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_1000.MapWithGeneralMapParameters();
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.MapTest_testGeneralMapField_1000.class) {}) {
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