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
package com.google.gson;
/**
 * Unit test for the default JSON map serialization object located in the
 * {@link DefaultTypeAdapters} class.
 *
 * @author Joel Leitch
 */
public class DefaultMapJsonSerializerTest_testNonEmptyMapSerialization_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson = new com.google.gson.Gson();

    public void testNonEmptyMapSerialization_9() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_8() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_7() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_6() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_5() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_4() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_3() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_2() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_1() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization_0() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public void testNonEmptyMapSerialization() {
        java.lang.reflect.Type mapType = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {}.getType();
        java.util.Map<java.lang.String, java.lang.String> myMap = new java.util.HashMap<java.lang.String, java.lang.String>();
        java.lang.String key = "key1";
        myMap.put(key, "value1");
        com.google.gson.Gson gson = new com.google.gson.Gson();
        com.google.gson.JsonElement element = gson.toJsonTree(myMap, mapType);
        junit.framework.Assert.assertTrue(element.isJsonObject());
        com.google.gson.JsonObject mapJsonObject = element.getAsJsonObject();
        junit.framework.Assert.assertTrue(mapJsonObject.has(key));
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.DefaultMapJsonSerializerTest_testNonEmptyMapSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.DefaultMapJsonSerializerTest", "testNonEmptyMapSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}