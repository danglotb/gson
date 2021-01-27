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
public class DefaultMapJsonSerializerTest_testNonEmptyMapSerialization_1000 extends junit.framework.TestCase {
    private com.google.gson.Gson gson = new com.google.gson.Gson();

    public void testNonEmptyMapSerialization_999() {
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

    public void testNonEmptyMapSerialization_998() {
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

    public void testNonEmptyMapSerialization_997() {
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

    public void testNonEmptyMapSerialization_996() {
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

    public void testNonEmptyMapSerialization_995() {
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

    public void testNonEmptyMapSerialization_994() {
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

    public void testNonEmptyMapSerialization_993() {
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

    public void testNonEmptyMapSerialization_992() {
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

    public void testNonEmptyMapSerialization_991() {
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

    public void testNonEmptyMapSerialization_990() {
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

    public void testNonEmptyMapSerialization_989() {
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

    public void testNonEmptyMapSerialization_988() {
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

    public void testNonEmptyMapSerialization_987() {
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

    public void testNonEmptyMapSerialization_986() {
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

    public void testNonEmptyMapSerialization_985() {
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

    public void testNonEmptyMapSerialization_984() {
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

    public void testNonEmptyMapSerialization_983() {
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

    public void testNonEmptyMapSerialization_982() {
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

    public void testNonEmptyMapSerialization_981() {
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

    public void testNonEmptyMapSerialization_980() {
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

    public void testNonEmptyMapSerialization_979() {
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

    public void testNonEmptyMapSerialization_978() {
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

    public void testNonEmptyMapSerialization_977() {
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

    public void testNonEmptyMapSerialization_976() {
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

    public void testNonEmptyMapSerialization_975() {
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

    public void testNonEmptyMapSerialization_974() {
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

    public void testNonEmptyMapSerialization_973() {
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

    public void testNonEmptyMapSerialization_972() {
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

    public void testNonEmptyMapSerialization_971() {
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

    public void testNonEmptyMapSerialization_970() {
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

    public void testNonEmptyMapSerialization_969() {
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

    public void testNonEmptyMapSerialization_968() {
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

    public void testNonEmptyMapSerialization_967() {
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

    public void testNonEmptyMapSerialization_966() {
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

    public void testNonEmptyMapSerialization_965() {
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

    public void testNonEmptyMapSerialization_964() {
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

    public void testNonEmptyMapSerialization_963() {
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

    public void testNonEmptyMapSerialization_962() {
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

    public void testNonEmptyMapSerialization_961() {
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

    public void testNonEmptyMapSerialization_960() {
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

    public void testNonEmptyMapSerialization_959() {
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

    public void testNonEmptyMapSerialization_958() {
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

    public void testNonEmptyMapSerialization_957() {
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

    public void testNonEmptyMapSerialization_956() {
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

    public void testNonEmptyMapSerialization_955() {
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

    public void testNonEmptyMapSerialization_954() {
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

    public void testNonEmptyMapSerialization_953() {
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

    public void testNonEmptyMapSerialization_952() {
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

    public void testNonEmptyMapSerialization_951() {
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

    public void testNonEmptyMapSerialization_950() {
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

    public void testNonEmptyMapSerialization_949() {
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

    public void testNonEmptyMapSerialization_948() {
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

    public void testNonEmptyMapSerialization_947() {
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

    public void testNonEmptyMapSerialization_946() {
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

    public void testNonEmptyMapSerialization_945() {
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

    public void testNonEmptyMapSerialization_944() {
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

    public void testNonEmptyMapSerialization_943() {
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

    public void testNonEmptyMapSerialization_942() {
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

    public void testNonEmptyMapSerialization_941() {
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

    public void testNonEmptyMapSerialization_940() {
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

    public void testNonEmptyMapSerialization_939() {
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

    public void testNonEmptyMapSerialization_938() {
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

    public void testNonEmptyMapSerialization_937() {
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

    public void testNonEmptyMapSerialization_936() {
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

    public void testNonEmptyMapSerialization_935() {
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

    public void testNonEmptyMapSerialization_934() {
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

    public void testNonEmptyMapSerialization_933() {
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

    public void testNonEmptyMapSerialization_932() {
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

    public void testNonEmptyMapSerialization_931() {
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

    public void testNonEmptyMapSerialization_930() {
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

    public void testNonEmptyMapSerialization_929() {
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

    public void testNonEmptyMapSerialization_928() {
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

    public void testNonEmptyMapSerialization_927() {
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

    public void testNonEmptyMapSerialization_926() {
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

    public void testNonEmptyMapSerialization_925() {
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

    public void testNonEmptyMapSerialization_924() {
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

    public void testNonEmptyMapSerialization_923() {
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

    public void testNonEmptyMapSerialization_922() {
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

    public void testNonEmptyMapSerialization_921() {
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

    public void testNonEmptyMapSerialization_920() {
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

    public void testNonEmptyMapSerialization_919() {
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

    public void testNonEmptyMapSerialization_918() {
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

    public void testNonEmptyMapSerialization_917() {
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

    public void testNonEmptyMapSerialization_916() {
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

    public void testNonEmptyMapSerialization_915() {
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

    public void testNonEmptyMapSerialization_914() {
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

    public void testNonEmptyMapSerialization_913() {
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

    public void testNonEmptyMapSerialization_912() {
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

    public void testNonEmptyMapSerialization_911() {
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

    public void testNonEmptyMapSerialization_910() {
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

    public void testNonEmptyMapSerialization_909() {
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

    public void testNonEmptyMapSerialization_908() {
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

    public void testNonEmptyMapSerialization_907() {
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

    public void testNonEmptyMapSerialization_906() {
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

    public void testNonEmptyMapSerialization_905() {
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

    public void testNonEmptyMapSerialization_904() {
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

    public void testNonEmptyMapSerialization_903() {
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

    public void testNonEmptyMapSerialization_902() {
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

    public void testNonEmptyMapSerialization_901() {
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

    public void testNonEmptyMapSerialization_900() {
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

    public void testNonEmptyMapSerialization_899() {
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

    public void testNonEmptyMapSerialization_898() {
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

    public void testNonEmptyMapSerialization_897() {
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

    public void testNonEmptyMapSerialization_896() {
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

    public void testNonEmptyMapSerialization_895() {
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

    public void testNonEmptyMapSerialization_894() {
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

    public void testNonEmptyMapSerialization_893() {
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

    public void testNonEmptyMapSerialization_892() {
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

    public void testNonEmptyMapSerialization_891() {
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

    public void testNonEmptyMapSerialization_890() {
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

    public void testNonEmptyMapSerialization_889() {
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

    public void testNonEmptyMapSerialization_888() {
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

    public void testNonEmptyMapSerialization_887() {
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

    public void testNonEmptyMapSerialization_886() {
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

    public void testNonEmptyMapSerialization_885() {
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

    public void testNonEmptyMapSerialization_884() {
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

    public void testNonEmptyMapSerialization_883() {
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

    public void testNonEmptyMapSerialization_882() {
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

    public void testNonEmptyMapSerialization_881() {
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

    public void testNonEmptyMapSerialization_880() {
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

    public void testNonEmptyMapSerialization_879() {
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

    public void testNonEmptyMapSerialization_878() {
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

    public void testNonEmptyMapSerialization_877() {
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

    public void testNonEmptyMapSerialization_876() {
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

    public void testNonEmptyMapSerialization_875() {
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

    public void testNonEmptyMapSerialization_874() {
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

    public void testNonEmptyMapSerialization_873() {
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

    public void testNonEmptyMapSerialization_872() {
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

    public void testNonEmptyMapSerialization_871() {
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

    public void testNonEmptyMapSerialization_870() {
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

    public void testNonEmptyMapSerialization_869() {
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

    public void testNonEmptyMapSerialization_868() {
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

    public void testNonEmptyMapSerialization_867() {
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

    public void testNonEmptyMapSerialization_866() {
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

    public void testNonEmptyMapSerialization_865() {
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

    public void testNonEmptyMapSerialization_864() {
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

    public void testNonEmptyMapSerialization_863() {
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

    public void testNonEmptyMapSerialization_862() {
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

    public void testNonEmptyMapSerialization_861() {
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

    public void testNonEmptyMapSerialization_860() {
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

    public void testNonEmptyMapSerialization_859() {
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

    public void testNonEmptyMapSerialization_858() {
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

    public void testNonEmptyMapSerialization_857() {
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

    public void testNonEmptyMapSerialization_856() {
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

    public void testNonEmptyMapSerialization_855() {
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

    public void testNonEmptyMapSerialization_854() {
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

    public void testNonEmptyMapSerialization_853() {
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

    public void testNonEmptyMapSerialization_852() {
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

    public void testNonEmptyMapSerialization_851() {
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

    public void testNonEmptyMapSerialization_850() {
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

    public void testNonEmptyMapSerialization_849() {
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

    public void testNonEmptyMapSerialization_848() {
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

    public void testNonEmptyMapSerialization_847() {
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

    public void testNonEmptyMapSerialization_846() {
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

    public void testNonEmptyMapSerialization_845() {
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

    public void testNonEmptyMapSerialization_844() {
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

    public void testNonEmptyMapSerialization_843() {
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

    public void testNonEmptyMapSerialization_842() {
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

    public void testNonEmptyMapSerialization_841() {
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

    public void testNonEmptyMapSerialization_840() {
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

    public void testNonEmptyMapSerialization_839() {
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

    public void testNonEmptyMapSerialization_838() {
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

    public void testNonEmptyMapSerialization_837() {
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

    public void testNonEmptyMapSerialization_836() {
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

    public void testNonEmptyMapSerialization_835() {
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

    public void testNonEmptyMapSerialization_834() {
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

    public void testNonEmptyMapSerialization_833() {
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

    public void testNonEmptyMapSerialization_832() {
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

    public void testNonEmptyMapSerialization_831() {
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

    public void testNonEmptyMapSerialization_830() {
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

    public void testNonEmptyMapSerialization_829() {
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

    public void testNonEmptyMapSerialization_828() {
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

    public void testNonEmptyMapSerialization_827() {
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

    public void testNonEmptyMapSerialization_826() {
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

    public void testNonEmptyMapSerialization_825() {
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

    public void testNonEmptyMapSerialization_824() {
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

    public void testNonEmptyMapSerialization_823() {
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

    public void testNonEmptyMapSerialization_822() {
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

    public void testNonEmptyMapSerialization_821() {
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

    public void testNonEmptyMapSerialization_820() {
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

    public void testNonEmptyMapSerialization_819() {
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

    public void testNonEmptyMapSerialization_818() {
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

    public void testNonEmptyMapSerialization_817() {
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

    public void testNonEmptyMapSerialization_816() {
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

    public void testNonEmptyMapSerialization_815() {
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

    public void testNonEmptyMapSerialization_814() {
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

    public void testNonEmptyMapSerialization_813() {
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

    public void testNonEmptyMapSerialization_812() {
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

    public void testNonEmptyMapSerialization_811() {
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

    public void testNonEmptyMapSerialization_810() {
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

    public void testNonEmptyMapSerialization_809() {
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

    public void testNonEmptyMapSerialization_808() {
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

    public void testNonEmptyMapSerialization_807() {
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

    public void testNonEmptyMapSerialization_806() {
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

    public void testNonEmptyMapSerialization_805() {
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

    public void testNonEmptyMapSerialization_804() {
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

    public void testNonEmptyMapSerialization_803() {
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

    public void testNonEmptyMapSerialization_802() {
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

    public void testNonEmptyMapSerialization_801() {
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

    public void testNonEmptyMapSerialization_800() {
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

    public void testNonEmptyMapSerialization_799() {
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

    public void testNonEmptyMapSerialization_798() {
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

    public void testNonEmptyMapSerialization_797() {
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

    public void testNonEmptyMapSerialization_796() {
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

    public void testNonEmptyMapSerialization_795() {
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

    public void testNonEmptyMapSerialization_794() {
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

    public void testNonEmptyMapSerialization_793() {
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

    public void testNonEmptyMapSerialization_792() {
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

    public void testNonEmptyMapSerialization_791() {
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

    public void testNonEmptyMapSerialization_790() {
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

    public void testNonEmptyMapSerialization_789() {
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

    public void testNonEmptyMapSerialization_788() {
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

    public void testNonEmptyMapSerialization_787() {
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

    public void testNonEmptyMapSerialization_786() {
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

    public void testNonEmptyMapSerialization_785() {
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

    public void testNonEmptyMapSerialization_784() {
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

    public void testNonEmptyMapSerialization_783() {
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

    public void testNonEmptyMapSerialization_782() {
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

    public void testNonEmptyMapSerialization_781() {
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

    public void testNonEmptyMapSerialization_780() {
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

    public void testNonEmptyMapSerialization_779() {
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

    public void testNonEmptyMapSerialization_778() {
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

    public void testNonEmptyMapSerialization_777() {
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

    public void testNonEmptyMapSerialization_776() {
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

    public void testNonEmptyMapSerialization_775() {
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

    public void testNonEmptyMapSerialization_774() {
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

    public void testNonEmptyMapSerialization_773() {
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

    public void testNonEmptyMapSerialization_772() {
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

    public void testNonEmptyMapSerialization_771() {
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

    public void testNonEmptyMapSerialization_770() {
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

    public void testNonEmptyMapSerialization_769() {
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

    public void testNonEmptyMapSerialization_768() {
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

    public void testNonEmptyMapSerialization_767() {
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

    public void testNonEmptyMapSerialization_766() {
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

    public void testNonEmptyMapSerialization_765() {
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

    public void testNonEmptyMapSerialization_764() {
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

    public void testNonEmptyMapSerialization_763() {
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

    public void testNonEmptyMapSerialization_762() {
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

    public void testNonEmptyMapSerialization_761() {
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

    public void testNonEmptyMapSerialization_760() {
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

    public void testNonEmptyMapSerialization_759() {
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

    public void testNonEmptyMapSerialization_758() {
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

    public void testNonEmptyMapSerialization_757() {
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

    public void testNonEmptyMapSerialization_756() {
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

    public void testNonEmptyMapSerialization_755() {
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

    public void testNonEmptyMapSerialization_754() {
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

    public void testNonEmptyMapSerialization_753() {
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

    public void testNonEmptyMapSerialization_752() {
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

    public void testNonEmptyMapSerialization_751() {
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

    public void testNonEmptyMapSerialization_750() {
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

    public void testNonEmptyMapSerialization_749() {
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

    public void testNonEmptyMapSerialization_748() {
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

    public void testNonEmptyMapSerialization_747() {
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

    public void testNonEmptyMapSerialization_746() {
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

    public void testNonEmptyMapSerialization_745() {
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

    public void testNonEmptyMapSerialization_744() {
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

    public void testNonEmptyMapSerialization_743() {
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

    public void testNonEmptyMapSerialization_742() {
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

    public void testNonEmptyMapSerialization_741() {
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

    public void testNonEmptyMapSerialization_740() {
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

    public void testNonEmptyMapSerialization_739() {
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

    public void testNonEmptyMapSerialization_738() {
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

    public void testNonEmptyMapSerialization_737() {
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

    public void testNonEmptyMapSerialization_736() {
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

    public void testNonEmptyMapSerialization_735() {
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

    public void testNonEmptyMapSerialization_734() {
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

    public void testNonEmptyMapSerialization_733() {
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

    public void testNonEmptyMapSerialization_732() {
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

    public void testNonEmptyMapSerialization_731() {
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

    public void testNonEmptyMapSerialization_730() {
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

    public void testNonEmptyMapSerialization_729() {
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

    public void testNonEmptyMapSerialization_728() {
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

    public void testNonEmptyMapSerialization_727() {
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

    public void testNonEmptyMapSerialization_726() {
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

    public void testNonEmptyMapSerialization_725() {
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

    public void testNonEmptyMapSerialization_724() {
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

    public void testNonEmptyMapSerialization_723() {
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

    public void testNonEmptyMapSerialization_722() {
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

    public void testNonEmptyMapSerialization_721() {
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

    public void testNonEmptyMapSerialization_720() {
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

    public void testNonEmptyMapSerialization_719() {
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

    public void testNonEmptyMapSerialization_718() {
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

    public void testNonEmptyMapSerialization_717() {
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

    public void testNonEmptyMapSerialization_716() {
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

    public void testNonEmptyMapSerialization_715() {
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

    public void testNonEmptyMapSerialization_714() {
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

    public void testNonEmptyMapSerialization_713() {
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

    public void testNonEmptyMapSerialization_712() {
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

    public void testNonEmptyMapSerialization_711() {
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

    public void testNonEmptyMapSerialization_710() {
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

    public void testNonEmptyMapSerialization_709() {
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

    public void testNonEmptyMapSerialization_708() {
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

    public void testNonEmptyMapSerialization_707() {
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

    public void testNonEmptyMapSerialization_706() {
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

    public void testNonEmptyMapSerialization_705() {
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

    public void testNonEmptyMapSerialization_704() {
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

    public void testNonEmptyMapSerialization_703() {
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

    public void testNonEmptyMapSerialization_702() {
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

    public void testNonEmptyMapSerialization_701() {
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

    public void testNonEmptyMapSerialization_700() {
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

    public void testNonEmptyMapSerialization_699() {
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

    public void testNonEmptyMapSerialization_698() {
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

    public void testNonEmptyMapSerialization_697() {
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

    public void testNonEmptyMapSerialization_696() {
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

    public void testNonEmptyMapSerialization_695() {
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

    public void testNonEmptyMapSerialization_694() {
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

    public void testNonEmptyMapSerialization_693() {
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

    public void testNonEmptyMapSerialization_692() {
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

    public void testNonEmptyMapSerialization_691() {
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

    public void testNonEmptyMapSerialization_690() {
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

    public void testNonEmptyMapSerialization_689() {
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

    public void testNonEmptyMapSerialization_688() {
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

    public void testNonEmptyMapSerialization_687() {
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

    public void testNonEmptyMapSerialization_686() {
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

    public void testNonEmptyMapSerialization_685() {
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

    public void testNonEmptyMapSerialization_684() {
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

    public void testNonEmptyMapSerialization_683() {
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

    public void testNonEmptyMapSerialization_682() {
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

    public void testNonEmptyMapSerialization_681() {
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

    public void testNonEmptyMapSerialization_680() {
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

    public void testNonEmptyMapSerialization_679() {
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

    public void testNonEmptyMapSerialization_678() {
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

    public void testNonEmptyMapSerialization_677() {
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

    public void testNonEmptyMapSerialization_676() {
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

    public void testNonEmptyMapSerialization_675() {
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

    public void testNonEmptyMapSerialization_674() {
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

    public void testNonEmptyMapSerialization_673() {
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

    public void testNonEmptyMapSerialization_672() {
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

    public void testNonEmptyMapSerialization_671() {
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

    public void testNonEmptyMapSerialization_670() {
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

    public void testNonEmptyMapSerialization_669() {
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

    public void testNonEmptyMapSerialization_668() {
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

    public void testNonEmptyMapSerialization_667() {
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

    public void testNonEmptyMapSerialization_666() {
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

    public void testNonEmptyMapSerialization_665() {
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

    public void testNonEmptyMapSerialization_664() {
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

    public void testNonEmptyMapSerialization_663() {
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

    public void testNonEmptyMapSerialization_662() {
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

    public void testNonEmptyMapSerialization_661() {
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

    public void testNonEmptyMapSerialization_660() {
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

    public void testNonEmptyMapSerialization_659() {
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

    public void testNonEmptyMapSerialization_658() {
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

    public void testNonEmptyMapSerialization_657() {
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

    public void testNonEmptyMapSerialization_656() {
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

    public void testNonEmptyMapSerialization_655() {
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

    public void testNonEmptyMapSerialization_654() {
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

    public void testNonEmptyMapSerialization_653() {
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

    public void testNonEmptyMapSerialization_652() {
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

    public void testNonEmptyMapSerialization_651() {
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

    public void testNonEmptyMapSerialization_650() {
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

    public void testNonEmptyMapSerialization_649() {
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

    public void testNonEmptyMapSerialization_648() {
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

    public void testNonEmptyMapSerialization_647() {
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

    public void testNonEmptyMapSerialization_646() {
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

    public void testNonEmptyMapSerialization_645() {
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

    public void testNonEmptyMapSerialization_644() {
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

    public void testNonEmptyMapSerialization_643() {
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

    public void testNonEmptyMapSerialization_642() {
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

    public void testNonEmptyMapSerialization_641() {
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

    public void testNonEmptyMapSerialization_640() {
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

    public void testNonEmptyMapSerialization_639() {
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

    public void testNonEmptyMapSerialization_638() {
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

    public void testNonEmptyMapSerialization_637() {
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

    public void testNonEmptyMapSerialization_636() {
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

    public void testNonEmptyMapSerialization_635() {
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

    public void testNonEmptyMapSerialization_634() {
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

    public void testNonEmptyMapSerialization_633() {
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

    public void testNonEmptyMapSerialization_632() {
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

    public void testNonEmptyMapSerialization_631() {
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

    public void testNonEmptyMapSerialization_630() {
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

    public void testNonEmptyMapSerialization_629() {
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

    public void testNonEmptyMapSerialization_628() {
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

    public void testNonEmptyMapSerialization_627() {
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

    public void testNonEmptyMapSerialization_626() {
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

    public void testNonEmptyMapSerialization_625() {
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

    public void testNonEmptyMapSerialization_624() {
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

    public void testNonEmptyMapSerialization_623() {
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

    public void testNonEmptyMapSerialization_622() {
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

    public void testNonEmptyMapSerialization_621() {
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

    public void testNonEmptyMapSerialization_620() {
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

    public void testNonEmptyMapSerialization_619() {
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

    public void testNonEmptyMapSerialization_618() {
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

    public void testNonEmptyMapSerialization_617() {
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

    public void testNonEmptyMapSerialization_616() {
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

    public void testNonEmptyMapSerialization_615() {
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

    public void testNonEmptyMapSerialization_614() {
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

    public void testNonEmptyMapSerialization_613() {
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

    public void testNonEmptyMapSerialization_612() {
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

    public void testNonEmptyMapSerialization_611() {
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

    public void testNonEmptyMapSerialization_610() {
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

    public void testNonEmptyMapSerialization_609() {
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

    public void testNonEmptyMapSerialization_608() {
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

    public void testNonEmptyMapSerialization_607() {
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

    public void testNonEmptyMapSerialization_606() {
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

    public void testNonEmptyMapSerialization_605() {
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

    public void testNonEmptyMapSerialization_604() {
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

    public void testNonEmptyMapSerialization_603() {
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

    public void testNonEmptyMapSerialization_602() {
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

    public void testNonEmptyMapSerialization_601() {
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

    public void testNonEmptyMapSerialization_600() {
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

    public void testNonEmptyMapSerialization_599() {
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

    public void testNonEmptyMapSerialization_598() {
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

    public void testNonEmptyMapSerialization_597() {
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

    public void testNonEmptyMapSerialization_596() {
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

    public void testNonEmptyMapSerialization_595() {
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

    public void testNonEmptyMapSerialization_594() {
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

    public void testNonEmptyMapSerialization_593() {
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

    public void testNonEmptyMapSerialization_592() {
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

    public void testNonEmptyMapSerialization_591() {
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

    public void testNonEmptyMapSerialization_590() {
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

    public void testNonEmptyMapSerialization_589() {
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

    public void testNonEmptyMapSerialization_588() {
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

    public void testNonEmptyMapSerialization_587() {
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

    public void testNonEmptyMapSerialization_586() {
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

    public void testNonEmptyMapSerialization_585() {
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

    public void testNonEmptyMapSerialization_584() {
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

    public void testNonEmptyMapSerialization_583() {
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

    public void testNonEmptyMapSerialization_582() {
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

    public void testNonEmptyMapSerialization_581() {
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

    public void testNonEmptyMapSerialization_580() {
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

    public void testNonEmptyMapSerialization_579() {
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

    public void testNonEmptyMapSerialization_578() {
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

    public void testNonEmptyMapSerialization_577() {
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

    public void testNonEmptyMapSerialization_576() {
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

    public void testNonEmptyMapSerialization_575() {
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

    public void testNonEmptyMapSerialization_574() {
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

    public void testNonEmptyMapSerialization_573() {
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

    public void testNonEmptyMapSerialization_572() {
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

    public void testNonEmptyMapSerialization_571() {
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

    public void testNonEmptyMapSerialization_570() {
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

    public void testNonEmptyMapSerialization_569() {
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

    public void testNonEmptyMapSerialization_568() {
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

    public void testNonEmptyMapSerialization_567() {
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

    public void testNonEmptyMapSerialization_566() {
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

    public void testNonEmptyMapSerialization_565() {
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

    public void testNonEmptyMapSerialization_564() {
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

    public void testNonEmptyMapSerialization_563() {
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

    public void testNonEmptyMapSerialization_562() {
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

    public void testNonEmptyMapSerialization_561() {
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

    public void testNonEmptyMapSerialization_560() {
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

    public void testNonEmptyMapSerialization_559() {
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

    public void testNonEmptyMapSerialization_558() {
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

    public void testNonEmptyMapSerialization_557() {
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

    public void testNonEmptyMapSerialization_556() {
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

    public void testNonEmptyMapSerialization_555() {
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

    public void testNonEmptyMapSerialization_554() {
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

    public void testNonEmptyMapSerialization_553() {
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

    public void testNonEmptyMapSerialization_552() {
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

    public void testNonEmptyMapSerialization_551() {
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

    public void testNonEmptyMapSerialization_550() {
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

    public void testNonEmptyMapSerialization_549() {
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

    public void testNonEmptyMapSerialization_548() {
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

    public void testNonEmptyMapSerialization_547() {
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

    public void testNonEmptyMapSerialization_546() {
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

    public void testNonEmptyMapSerialization_545() {
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

    public void testNonEmptyMapSerialization_544() {
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

    public void testNonEmptyMapSerialization_543() {
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

    public void testNonEmptyMapSerialization_542() {
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

    public void testNonEmptyMapSerialization_541() {
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

    public void testNonEmptyMapSerialization_540() {
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

    public void testNonEmptyMapSerialization_539() {
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

    public void testNonEmptyMapSerialization_538() {
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

    public void testNonEmptyMapSerialization_537() {
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

    public void testNonEmptyMapSerialization_536() {
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

    public void testNonEmptyMapSerialization_535() {
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

    public void testNonEmptyMapSerialization_534() {
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

    public void testNonEmptyMapSerialization_533() {
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

    public void testNonEmptyMapSerialization_532() {
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

    public void testNonEmptyMapSerialization_531() {
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

    public void testNonEmptyMapSerialization_530() {
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

    public void testNonEmptyMapSerialization_529() {
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

    public void testNonEmptyMapSerialization_528() {
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

    public void testNonEmptyMapSerialization_527() {
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

    public void testNonEmptyMapSerialization_526() {
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

    public void testNonEmptyMapSerialization_525() {
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

    public void testNonEmptyMapSerialization_524() {
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

    public void testNonEmptyMapSerialization_523() {
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

    public void testNonEmptyMapSerialization_522() {
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

    public void testNonEmptyMapSerialization_521() {
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

    public void testNonEmptyMapSerialization_520() {
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

    public void testNonEmptyMapSerialization_519() {
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

    public void testNonEmptyMapSerialization_518() {
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

    public void testNonEmptyMapSerialization_517() {
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

    public void testNonEmptyMapSerialization_516() {
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

    public void testNonEmptyMapSerialization_515() {
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

    public void testNonEmptyMapSerialization_514() {
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

    public void testNonEmptyMapSerialization_513() {
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

    public void testNonEmptyMapSerialization_512() {
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

    public void testNonEmptyMapSerialization_511() {
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

    public void testNonEmptyMapSerialization_510() {
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

    public void testNonEmptyMapSerialization_509() {
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

    public void testNonEmptyMapSerialization_508() {
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

    public void testNonEmptyMapSerialization_507() {
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

    public void testNonEmptyMapSerialization_506() {
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

    public void testNonEmptyMapSerialization_505() {
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

    public void testNonEmptyMapSerialization_504() {
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

    public void testNonEmptyMapSerialization_503() {
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

    public void testNonEmptyMapSerialization_502() {
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

    public void testNonEmptyMapSerialization_501() {
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

    public void testNonEmptyMapSerialization_500() {
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

    public void testNonEmptyMapSerialization_499() {
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

    public void testNonEmptyMapSerialization_498() {
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

    public void testNonEmptyMapSerialization_497() {
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

    public void testNonEmptyMapSerialization_496() {
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

    public void testNonEmptyMapSerialization_495() {
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

    public void testNonEmptyMapSerialization_494() {
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

    public void testNonEmptyMapSerialization_493() {
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

    public void testNonEmptyMapSerialization_492() {
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

    public void testNonEmptyMapSerialization_491() {
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

    public void testNonEmptyMapSerialization_490() {
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

    public void testNonEmptyMapSerialization_489() {
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

    public void testNonEmptyMapSerialization_488() {
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

    public void testNonEmptyMapSerialization_487() {
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

    public void testNonEmptyMapSerialization_486() {
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

    public void testNonEmptyMapSerialization_485() {
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

    public void testNonEmptyMapSerialization_484() {
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

    public void testNonEmptyMapSerialization_483() {
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

    public void testNonEmptyMapSerialization_482() {
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

    public void testNonEmptyMapSerialization_481() {
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

    public void testNonEmptyMapSerialization_480() {
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

    public void testNonEmptyMapSerialization_479() {
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

    public void testNonEmptyMapSerialization_478() {
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

    public void testNonEmptyMapSerialization_477() {
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

    public void testNonEmptyMapSerialization_476() {
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

    public void testNonEmptyMapSerialization_475() {
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

    public void testNonEmptyMapSerialization_474() {
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

    public void testNonEmptyMapSerialization_473() {
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

    public void testNonEmptyMapSerialization_472() {
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

    public void testNonEmptyMapSerialization_471() {
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

    public void testNonEmptyMapSerialization_470() {
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

    public void testNonEmptyMapSerialization_469() {
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

    public void testNonEmptyMapSerialization_468() {
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

    public void testNonEmptyMapSerialization_467() {
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

    public void testNonEmptyMapSerialization_466() {
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

    public void testNonEmptyMapSerialization_465() {
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

    public void testNonEmptyMapSerialization_464() {
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

    public void testNonEmptyMapSerialization_463() {
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

    public void testNonEmptyMapSerialization_462() {
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

    public void testNonEmptyMapSerialization_461() {
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

    public void testNonEmptyMapSerialization_460() {
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

    public void testNonEmptyMapSerialization_459() {
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

    public void testNonEmptyMapSerialization_458() {
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

    public void testNonEmptyMapSerialization_457() {
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

    public void testNonEmptyMapSerialization_456() {
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

    public void testNonEmptyMapSerialization_455() {
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

    public void testNonEmptyMapSerialization_454() {
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

    public void testNonEmptyMapSerialization_453() {
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

    public void testNonEmptyMapSerialization_452() {
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

    public void testNonEmptyMapSerialization_451() {
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

    public void testNonEmptyMapSerialization_450() {
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

    public void testNonEmptyMapSerialization_449() {
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

    public void testNonEmptyMapSerialization_448() {
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

    public void testNonEmptyMapSerialization_447() {
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

    public void testNonEmptyMapSerialization_446() {
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

    public void testNonEmptyMapSerialization_445() {
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

    public void testNonEmptyMapSerialization_444() {
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

    public void testNonEmptyMapSerialization_443() {
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

    public void testNonEmptyMapSerialization_442() {
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

    public void testNonEmptyMapSerialization_441() {
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

    public void testNonEmptyMapSerialization_440() {
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

    public void testNonEmptyMapSerialization_439() {
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

    public void testNonEmptyMapSerialization_438() {
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

    public void testNonEmptyMapSerialization_437() {
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

    public void testNonEmptyMapSerialization_436() {
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

    public void testNonEmptyMapSerialization_435() {
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

    public void testNonEmptyMapSerialization_434() {
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

    public void testNonEmptyMapSerialization_433() {
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

    public void testNonEmptyMapSerialization_432() {
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

    public void testNonEmptyMapSerialization_431() {
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

    public void testNonEmptyMapSerialization_430() {
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

    public void testNonEmptyMapSerialization_429() {
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

    public void testNonEmptyMapSerialization_428() {
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

    public void testNonEmptyMapSerialization_427() {
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

    public void testNonEmptyMapSerialization_426() {
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

    public void testNonEmptyMapSerialization_425() {
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

    public void testNonEmptyMapSerialization_424() {
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

    public void testNonEmptyMapSerialization_423() {
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

    public void testNonEmptyMapSerialization_422() {
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

    public void testNonEmptyMapSerialization_421() {
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

    public void testNonEmptyMapSerialization_420() {
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

    public void testNonEmptyMapSerialization_419() {
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

    public void testNonEmptyMapSerialization_418() {
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

    public void testNonEmptyMapSerialization_417() {
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

    public void testNonEmptyMapSerialization_416() {
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

    public void testNonEmptyMapSerialization_415() {
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

    public void testNonEmptyMapSerialization_414() {
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

    public void testNonEmptyMapSerialization_413() {
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

    public void testNonEmptyMapSerialization_412() {
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

    public void testNonEmptyMapSerialization_411() {
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

    public void testNonEmptyMapSerialization_410() {
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

    public void testNonEmptyMapSerialization_409() {
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

    public void testNonEmptyMapSerialization_408() {
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

    public void testNonEmptyMapSerialization_407() {
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

    public void testNonEmptyMapSerialization_406() {
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

    public void testNonEmptyMapSerialization_405() {
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

    public void testNonEmptyMapSerialization_404() {
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

    public void testNonEmptyMapSerialization_403() {
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

    public void testNonEmptyMapSerialization_402() {
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

    public void testNonEmptyMapSerialization_401() {
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

    public void testNonEmptyMapSerialization_400() {
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

    public void testNonEmptyMapSerialization_399() {
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

    public void testNonEmptyMapSerialization_398() {
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

    public void testNonEmptyMapSerialization_397() {
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

    public void testNonEmptyMapSerialization_396() {
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

    public void testNonEmptyMapSerialization_395() {
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

    public void testNonEmptyMapSerialization_394() {
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

    public void testNonEmptyMapSerialization_393() {
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

    public void testNonEmptyMapSerialization_392() {
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

    public void testNonEmptyMapSerialization_391() {
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

    public void testNonEmptyMapSerialization_390() {
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

    public void testNonEmptyMapSerialization_389() {
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

    public void testNonEmptyMapSerialization_388() {
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

    public void testNonEmptyMapSerialization_387() {
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

    public void testNonEmptyMapSerialization_386() {
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

    public void testNonEmptyMapSerialization_385() {
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

    public void testNonEmptyMapSerialization_384() {
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

    public void testNonEmptyMapSerialization_383() {
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

    public void testNonEmptyMapSerialization_382() {
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

    public void testNonEmptyMapSerialization_381() {
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

    public void testNonEmptyMapSerialization_380() {
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

    public void testNonEmptyMapSerialization_379() {
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

    public void testNonEmptyMapSerialization_378() {
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

    public void testNonEmptyMapSerialization_377() {
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

    public void testNonEmptyMapSerialization_376() {
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

    public void testNonEmptyMapSerialization_375() {
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

    public void testNonEmptyMapSerialization_374() {
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

    public void testNonEmptyMapSerialization_373() {
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

    public void testNonEmptyMapSerialization_372() {
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

    public void testNonEmptyMapSerialization_371() {
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

    public void testNonEmptyMapSerialization_370() {
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

    public void testNonEmptyMapSerialization_369() {
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

    public void testNonEmptyMapSerialization_368() {
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

    public void testNonEmptyMapSerialization_367() {
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

    public void testNonEmptyMapSerialization_366() {
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

    public void testNonEmptyMapSerialization_365() {
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

    public void testNonEmptyMapSerialization_364() {
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

    public void testNonEmptyMapSerialization_363() {
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

    public void testNonEmptyMapSerialization_362() {
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

    public void testNonEmptyMapSerialization_361() {
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

    public void testNonEmptyMapSerialization_360() {
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

    public void testNonEmptyMapSerialization_359() {
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

    public void testNonEmptyMapSerialization_358() {
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

    public void testNonEmptyMapSerialization_357() {
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

    public void testNonEmptyMapSerialization_356() {
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

    public void testNonEmptyMapSerialization_355() {
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

    public void testNonEmptyMapSerialization_354() {
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

    public void testNonEmptyMapSerialization_353() {
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

    public void testNonEmptyMapSerialization_352() {
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

    public void testNonEmptyMapSerialization_351() {
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

    public void testNonEmptyMapSerialization_350() {
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

    public void testNonEmptyMapSerialization_349() {
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

    public void testNonEmptyMapSerialization_348() {
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

    public void testNonEmptyMapSerialization_347() {
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

    public void testNonEmptyMapSerialization_346() {
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

    public void testNonEmptyMapSerialization_345() {
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

    public void testNonEmptyMapSerialization_344() {
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

    public void testNonEmptyMapSerialization_343() {
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

    public void testNonEmptyMapSerialization_342() {
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

    public void testNonEmptyMapSerialization_341() {
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

    public void testNonEmptyMapSerialization_340() {
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

    public void testNonEmptyMapSerialization_339() {
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

    public void testNonEmptyMapSerialization_338() {
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

    public void testNonEmptyMapSerialization_337() {
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

    public void testNonEmptyMapSerialization_336() {
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

    public void testNonEmptyMapSerialization_335() {
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

    public void testNonEmptyMapSerialization_334() {
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

    public void testNonEmptyMapSerialization_333() {
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

    public void testNonEmptyMapSerialization_332() {
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

    public void testNonEmptyMapSerialization_331() {
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

    public void testNonEmptyMapSerialization_330() {
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

    public void testNonEmptyMapSerialization_329() {
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

    public void testNonEmptyMapSerialization_328() {
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

    public void testNonEmptyMapSerialization_327() {
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

    public void testNonEmptyMapSerialization_326() {
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

    public void testNonEmptyMapSerialization_325() {
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

    public void testNonEmptyMapSerialization_324() {
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

    public void testNonEmptyMapSerialization_323() {
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

    public void testNonEmptyMapSerialization_322() {
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

    public void testNonEmptyMapSerialization_321() {
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

    public void testNonEmptyMapSerialization_320() {
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

    public void testNonEmptyMapSerialization_319() {
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

    public void testNonEmptyMapSerialization_318() {
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

    public void testNonEmptyMapSerialization_317() {
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

    public void testNonEmptyMapSerialization_316() {
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

    public void testNonEmptyMapSerialization_315() {
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

    public void testNonEmptyMapSerialization_314() {
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

    public void testNonEmptyMapSerialization_313() {
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

    public void testNonEmptyMapSerialization_312() {
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

    public void testNonEmptyMapSerialization_311() {
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

    public void testNonEmptyMapSerialization_310() {
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

    public void testNonEmptyMapSerialization_309() {
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

    public void testNonEmptyMapSerialization_308() {
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

    public void testNonEmptyMapSerialization_307() {
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

    public void testNonEmptyMapSerialization_306() {
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

    public void testNonEmptyMapSerialization_305() {
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

    public void testNonEmptyMapSerialization_304() {
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

    public void testNonEmptyMapSerialization_303() {
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

    public void testNonEmptyMapSerialization_302() {
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

    public void testNonEmptyMapSerialization_301() {
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

    public void testNonEmptyMapSerialization_300() {
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

    public void testNonEmptyMapSerialization_299() {
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

    public void testNonEmptyMapSerialization_298() {
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

    public void testNonEmptyMapSerialization_297() {
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

    public void testNonEmptyMapSerialization_296() {
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

    public void testNonEmptyMapSerialization_295() {
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

    public void testNonEmptyMapSerialization_294() {
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

    public void testNonEmptyMapSerialization_293() {
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

    public void testNonEmptyMapSerialization_292() {
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

    public void testNonEmptyMapSerialization_291() {
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

    public void testNonEmptyMapSerialization_290() {
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

    public void testNonEmptyMapSerialization_289() {
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

    public void testNonEmptyMapSerialization_288() {
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

    public void testNonEmptyMapSerialization_287() {
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

    public void testNonEmptyMapSerialization_286() {
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

    public void testNonEmptyMapSerialization_285() {
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

    public void testNonEmptyMapSerialization_284() {
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

    public void testNonEmptyMapSerialization_283() {
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

    public void testNonEmptyMapSerialization_282() {
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

    public void testNonEmptyMapSerialization_281() {
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

    public void testNonEmptyMapSerialization_280() {
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

    public void testNonEmptyMapSerialization_279() {
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

    public void testNonEmptyMapSerialization_278() {
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

    public void testNonEmptyMapSerialization_277() {
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

    public void testNonEmptyMapSerialization_276() {
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

    public void testNonEmptyMapSerialization_275() {
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

    public void testNonEmptyMapSerialization_274() {
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

    public void testNonEmptyMapSerialization_273() {
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

    public void testNonEmptyMapSerialization_272() {
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

    public void testNonEmptyMapSerialization_271() {
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

    public void testNonEmptyMapSerialization_270() {
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

    public void testNonEmptyMapSerialization_269() {
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

    public void testNonEmptyMapSerialization_268() {
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

    public void testNonEmptyMapSerialization_267() {
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

    public void testNonEmptyMapSerialization_266() {
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

    public void testNonEmptyMapSerialization_265() {
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

    public void testNonEmptyMapSerialization_264() {
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

    public void testNonEmptyMapSerialization_263() {
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

    public void testNonEmptyMapSerialization_262() {
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

    public void testNonEmptyMapSerialization_261() {
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

    public void testNonEmptyMapSerialization_260() {
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

    public void testNonEmptyMapSerialization_259() {
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

    public void testNonEmptyMapSerialization_258() {
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

    public void testNonEmptyMapSerialization_257() {
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

    public void testNonEmptyMapSerialization_256() {
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

    public void testNonEmptyMapSerialization_255() {
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

    public void testNonEmptyMapSerialization_254() {
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

    public void testNonEmptyMapSerialization_253() {
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

    public void testNonEmptyMapSerialization_252() {
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

    public void testNonEmptyMapSerialization_251() {
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

    public void testNonEmptyMapSerialization_250() {
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

    public void testNonEmptyMapSerialization_249() {
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

    public void testNonEmptyMapSerialization_248() {
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

    public void testNonEmptyMapSerialization_247() {
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

    public void testNonEmptyMapSerialization_246() {
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

    public void testNonEmptyMapSerialization_245() {
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

    public void testNonEmptyMapSerialization_244() {
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

    public void testNonEmptyMapSerialization_243() {
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

    public void testNonEmptyMapSerialization_242() {
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

    public void testNonEmptyMapSerialization_241() {
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

    public void testNonEmptyMapSerialization_240() {
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

    public void testNonEmptyMapSerialization_239() {
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

    public void testNonEmptyMapSerialization_238() {
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

    public void testNonEmptyMapSerialization_237() {
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

    public void testNonEmptyMapSerialization_236() {
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

    public void testNonEmptyMapSerialization_235() {
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

    public void testNonEmptyMapSerialization_234() {
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

    public void testNonEmptyMapSerialization_233() {
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

    public void testNonEmptyMapSerialization_232() {
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

    public void testNonEmptyMapSerialization_231() {
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

    public void testNonEmptyMapSerialization_230() {
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

    public void testNonEmptyMapSerialization_229() {
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

    public void testNonEmptyMapSerialization_228() {
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

    public void testNonEmptyMapSerialization_227() {
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

    public void testNonEmptyMapSerialization_226() {
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

    public void testNonEmptyMapSerialization_225() {
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

    public void testNonEmptyMapSerialization_224() {
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

    public void testNonEmptyMapSerialization_223() {
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

    public void testNonEmptyMapSerialization_222() {
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

    public void testNonEmptyMapSerialization_221() {
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

    public void testNonEmptyMapSerialization_220() {
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

    public void testNonEmptyMapSerialization_219() {
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

    public void testNonEmptyMapSerialization_218() {
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

    public void testNonEmptyMapSerialization_217() {
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

    public void testNonEmptyMapSerialization_216() {
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

    public void testNonEmptyMapSerialization_215() {
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

    public void testNonEmptyMapSerialization_214() {
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

    public void testNonEmptyMapSerialization_213() {
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

    public void testNonEmptyMapSerialization_212() {
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

    public void testNonEmptyMapSerialization_211() {
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

    public void testNonEmptyMapSerialization_210() {
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

    public void testNonEmptyMapSerialization_209() {
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

    public void testNonEmptyMapSerialization_208() {
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

    public void testNonEmptyMapSerialization_207() {
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

    public void testNonEmptyMapSerialization_206() {
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

    public void testNonEmptyMapSerialization_205() {
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

    public void testNonEmptyMapSerialization_204() {
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

    public void testNonEmptyMapSerialization_203() {
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

    public void testNonEmptyMapSerialization_202() {
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

    public void testNonEmptyMapSerialization_201() {
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

    public void testNonEmptyMapSerialization_200() {
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

    public void testNonEmptyMapSerialization_199() {
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

    public void testNonEmptyMapSerialization_198() {
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

    public void testNonEmptyMapSerialization_197() {
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

    public void testNonEmptyMapSerialization_196() {
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

    public void testNonEmptyMapSerialization_195() {
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

    public void testNonEmptyMapSerialization_194() {
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

    public void testNonEmptyMapSerialization_193() {
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

    public void testNonEmptyMapSerialization_192() {
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

    public void testNonEmptyMapSerialization_191() {
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

    public void testNonEmptyMapSerialization_190() {
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

    public void testNonEmptyMapSerialization_189() {
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

    public void testNonEmptyMapSerialization_188() {
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

    public void testNonEmptyMapSerialization_187() {
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

    public void testNonEmptyMapSerialization_186() {
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

    public void testNonEmptyMapSerialization_185() {
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

    public void testNonEmptyMapSerialization_184() {
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

    public void testNonEmptyMapSerialization_183() {
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

    public void testNonEmptyMapSerialization_182() {
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

    public void testNonEmptyMapSerialization_181() {
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

    public void testNonEmptyMapSerialization_180() {
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

    public void testNonEmptyMapSerialization_179() {
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

    public void testNonEmptyMapSerialization_178() {
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

    public void testNonEmptyMapSerialization_177() {
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

    public void testNonEmptyMapSerialization_176() {
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

    public void testNonEmptyMapSerialization_175() {
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

    public void testNonEmptyMapSerialization_174() {
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

    public void testNonEmptyMapSerialization_173() {
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

    public void testNonEmptyMapSerialization_172() {
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

    public void testNonEmptyMapSerialization_171() {
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

    public void testNonEmptyMapSerialization_170() {
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

    public void testNonEmptyMapSerialization_169() {
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

    public void testNonEmptyMapSerialization_168() {
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

    public void testNonEmptyMapSerialization_167() {
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

    public void testNonEmptyMapSerialization_166() {
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

    public void testNonEmptyMapSerialization_165() {
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

    public void testNonEmptyMapSerialization_164() {
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

    public void testNonEmptyMapSerialization_163() {
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

    public void testNonEmptyMapSerialization_162() {
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

    public void testNonEmptyMapSerialization_161() {
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

    public void testNonEmptyMapSerialization_160() {
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

    public void testNonEmptyMapSerialization_159() {
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

    public void testNonEmptyMapSerialization_158() {
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

    public void testNonEmptyMapSerialization_157() {
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

    public void testNonEmptyMapSerialization_156() {
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

    public void testNonEmptyMapSerialization_155() {
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

    public void testNonEmptyMapSerialization_154() {
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

    public void testNonEmptyMapSerialization_153() {
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

    public void testNonEmptyMapSerialization_152() {
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

    public void testNonEmptyMapSerialization_151() {
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

    public void testNonEmptyMapSerialization_150() {
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

    public void testNonEmptyMapSerialization_149() {
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

    public void testNonEmptyMapSerialization_148() {
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

    public void testNonEmptyMapSerialization_147() {
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

    public void testNonEmptyMapSerialization_146() {
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

    public void testNonEmptyMapSerialization_145() {
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

    public void testNonEmptyMapSerialization_144() {
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

    public void testNonEmptyMapSerialization_143() {
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

    public void testNonEmptyMapSerialization_142() {
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

    public void testNonEmptyMapSerialization_141() {
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

    public void testNonEmptyMapSerialization_140() {
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

    public void testNonEmptyMapSerialization_139() {
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

    public void testNonEmptyMapSerialization_138() {
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

    public void testNonEmptyMapSerialization_137() {
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

    public void testNonEmptyMapSerialization_136() {
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

    public void testNonEmptyMapSerialization_135() {
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

    public void testNonEmptyMapSerialization_134() {
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

    public void testNonEmptyMapSerialization_133() {
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

    public void testNonEmptyMapSerialization_132() {
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

    public void testNonEmptyMapSerialization_131() {
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

    public void testNonEmptyMapSerialization_130() {
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

    public void testNonEmptyMapSerialization_129() {
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

    public void testNonEmptyMapSerialization_128() {
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

    public void testNonEmptyMapSerialization_127() {
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

    public void testNonEmptyMapSerialization_126() {
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

    public void testNonEmptyMapSerialization_125() {
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

    public void testNonEmptyMapSerialization_124() {
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

    public void testNonEmptyMapSerialization_123() {
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

    public void testNonEmptyMapSerialization_122() {
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

    public void testNonEmptyMapSerialization_121() {
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

    public void testNonEmptyMapSerialization_120() {
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

    public void testNonEmptyMapSerialization_119() {
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

    public void testNonEmptyMapSerialization_118() {
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

    public void testNonEmptyMapSerialization_117() {
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

    public void testNonEmptyMapSerialization_116() {
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

    public void testNonEmptyMapSerialization_115() {
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

    public void testNonEmptyMapSerialization_114() {
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

    public void testNonEmptyMapSerialization_113() {
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

    public void testNonEmptyMapSerialization_112() {
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

    public void testNonEmptyMapSerialization_111() {
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

    public void testNonEmptyMapSerialization_110() {
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

    public void testNonEmptyMapSerialization_109() {
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

    public void testNonEmptyMapSerialization_108() {
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

    public void testNonEmptyMapSerialization_107() {
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

    public void testNonEmptyMapSerialization_106() {
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

    public void testNonEmptyMapSerialization_105() {
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

    public void testNonEmptyMapSerialization_104() {
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

    public void testNonEmptyMapSerialization_103() {
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

    public void testNonEmptyMapSerialization_102() {
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

    public void testNonEmptyMapSerialization_101() {
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

    public void testNonEmptyMapSerialization_100() {
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.DefaultMapJsonSerializerTest_testNonEmptyMapSerialization_1000.class) {}) {
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