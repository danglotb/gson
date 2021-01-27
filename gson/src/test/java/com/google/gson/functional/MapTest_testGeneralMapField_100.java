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
public class MapTest_testGeneralMapField_100 extends junit.framework.TestCase {
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

    public void testGeneralMapField_99() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_98() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_97() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_96() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_95() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_94() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_93() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_92() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_91() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_90() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_89() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_88() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_87() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_86() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_85() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_84() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_83() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_82() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_81() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_80() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_79() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_78() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_77() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_76() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_75() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_74() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_73() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_72() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_71() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_70() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_69() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_68() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_67() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_66() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_65() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_64() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_63() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_62() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_61() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_60() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_59() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_58() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_57() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_56() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_55() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_54() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_53() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_52() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_51() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_50() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_49() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_48() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_47() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_46() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_45() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_44() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_43() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_42() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_41() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_40() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_39() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_38() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_37() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_36() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_35() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_34() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_33() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_32() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_31() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_30() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_29() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_28() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_27() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_26() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_25() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_24() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_23() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_22() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_21() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_20() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_19() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_18() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_17() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_16() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_15() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_14() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_13() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_12() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_11() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_10() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_9() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_8() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_7() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_6() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_5() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_4() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_3() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_2() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_1() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField_0() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
        map.map.put("string", "testString");
        map.map.put("stringArray", new java.lang.String[]{ "one", "two" });
        map.map.put("objectArray", new java.lang.Object[]{ 1, 2L, "three" });
        java.lang.String expected = "{\"map\":{\"string\":\"testString\",\"stringArray\":" + "[\"one\",\"two\"],\"objectArray\":[1,2,\"three\"]}}";
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
        gson = new com.google.gson.GsonBuilder().enableComplexMapKeySerialization().create();
        junit.framework.Assert.assertEquals(expected, gson.toJson(map));
    }

    public void testGeneralMapField() throws java.lang.Exception {
        com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters map = new com.google.gson.functional.MapTest_testGeneralMapField_100.MapWithGeneralMapParameters();
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.MapTest_testGeneralMapField_100.class) {}) {
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