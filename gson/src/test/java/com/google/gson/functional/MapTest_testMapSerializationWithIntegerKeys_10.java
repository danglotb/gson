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
public class MapTest_testMapSerializationWithIntegerKeys_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testMapSerializationWithIntegerKeys_9() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_8() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_7() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_6() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_5() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_4() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_3() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_2() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_1() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_0() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.MapTest_testMapSerializationWithIntegerKeys_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.MapTest", "testMapSerializationWithIntegerKeys");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}