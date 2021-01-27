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
public class DefaultMapJsonSerializerTest_testNonEmptyMapSerialization_100 extends junit.framework.TestCase {
    private com.google.gson.Gson gson = new com.google.gson.Gson();

    public void testNonEmptyMapSerialization_99() {
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

    public void testNonEmptyMapSerialization_98() {
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

    public void testNonEmptyMapSerialization_97() {
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

    public void testNonEmptyMapSerialization_96() {
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

    public void testNonEmptyMapSerialization_95() {
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

    public void testNonEmptyMapSerialization_94() {
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

    public void testNonEmptyMapSerialization_93() {
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

    public void testNonEmptyMapSerialization_92() {
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

    public void testNonEmptyMapSerialization_91() {
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

    public void testNonEmptyMapSerialization_90() {
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

    public void testNonEmptyMapSerialization_89() {
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

    public void testNonEmptyMapSerialization_88() {
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

    public void testNonEmptyMapSerialization_87() {
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

    public void testNonEmptyMapSerialization_86() {
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

    public void testNonEmptyMapSerialization_85() {
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

    public void testNonEmptyMapSerialization_84() {
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

    public void testNonEmptyMapSerialization_83() {
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

    public void testNonEmptyMapSerialization_82() {
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

    public void testNonEmptyMapSerialization_81() {
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

    public void testNonEmptyMapSerialization_80() {
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

    public void testNonEmptyMapSerialization_79() {
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

    public void testNonEmptyMapSerialization_78() {
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

    public void testNonEmptyMapSerialization_77() {
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

    public void testNonEmptyMapSerialization_76() {
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

    public void testNonEmptyMapSerialization_75() {
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

    public void testNonEmptyMapSerialization_74() {
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

    public void testNonEmptyMapSerialization_73() {
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

    public void testNonEmptyMapSerialization_72() {
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

    public void testNonEmptyMapSerialization_71() {
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

    public void testNonEmptyMapSerialization_70() {
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

    public void testNonEmptyMapSerialization_69() {
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

    public void testNonEmptyMapSerialization_68() {
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

    public void testNonEmptyMapSerialization_67() {
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

    public void testNonEmptyMapSerialization_66() {
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

    public void testNonEmptyMapSerialization_65() {
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

    public void testNonEmptyMapSerialization_64() {
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

    public void testNonEmptyMapSerialization_63() {
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

    public void testNonEmptyMapSerialization_62() {
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

    public void testNonEmptyMapSerialization_61() {
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

    public void testNonEmptyMapSerialization_60() {
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

    public void testNonEmptyMapSerialization_59() {
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

    public void testNonEmptyMapSerialization_58() {
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

    public void testNonEmptyMapSerialization_57() {
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

    public void testNonEmptyMapSerialization_56() {
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

    public void testNonEmptyMapSerialization_55() {
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

    public void testNonEmptyMapSerialization_54() {
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

    public void testNonEmptyMapSerialization_53() {
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

    public void testNonEmptyMapSerialization_52() {
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

    public void testNonEmptyMapSerialization_51() {
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

    public void testNonEmptyMapSerialization_50() {
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

    public void testNonEmptyMapSerialization_49() {
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

    public void testNonEmptyMapSerialization_48() {
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

    public void testNonEmptyMapSerialization_47() {
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

    public void testNonEmptyMapSerialization_46() {
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

    public void testNonEmptyMapSerialization_45() {
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

    public void testNonEmptyMapSerialization_44() {
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

    public void testNonEmptyMapSerialization_43() {
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

    public void testNonEmptyMapSerialization_42() {
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

    public void testNonEmptyMapSerialization_41() {
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

    public void testNonEmptyMapSerialization_40() {
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

    public void testNonEmptyMapSerialization_39() {
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

    public void testNonEmptyMapSerialization_38() {
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

    public void testNonEmptyMapSerialization_37() {
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

    public void testNonEmptyMapSerialization_36() {
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

    public void testNonEmptyMapSerialization_35() {
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

    public void testNonEmptyMapSerialization_34() {
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

    public void testNonEmptyMapSerialization_33() {
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

    public void testNonEmptyMapSerialization_32() {
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

    public void testNonEmptyMapSerialization_31() {
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

    public void testNonEmptyMapSerialization_30() {
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

    public void testNonEmptyMapSerialization_29() {
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

    public void testNonEmptyMapSerialization_28() {
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

    public void testNonEmptyMapSerialization_27() {
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

    public void testNonEmptyMapSerialization_26() {
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

    public void testNonEmptyMapSerialization_25() {
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

    public void testNonEmptyMapSerialization_24() {
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

    public void testNonEmptyMapSerialization_23() {
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

    public void testNonEmptyMapSerialization_22() {
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

    public void testNonEmptyMapSerialization_21() {
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

    public void testNonEmptyMapSerialization_20() {
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

    public void testNonEmptyMapSerialization_19() {
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

    public void testNonEmptyMapSerialization_18() {
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

    public void testNonEmptyMapSerialization_17() {
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

    public void testNonEmptyMapSerialization_16() {
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

    public void testNonEmptyMapSerialization_15() {
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

    public void testNonEmptyMapSerialization_14() {
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

    public void testNonEmptyMapSerialization_13() {
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

    public void testNonEmptyMapSerialization_12() {
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

    public void testNonEmptyMapSerialization_11() {
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

    public void testNonEmptyMapSerialization_10() {
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.DefaultMapJsonSerializerTest_testNonEmptyMapSerialization_100.class) {}) {
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