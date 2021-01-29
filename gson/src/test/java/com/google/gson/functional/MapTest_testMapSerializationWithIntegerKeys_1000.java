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
public class MapTest_testMapSerializationWithIntegerKeys_1000 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testMapSerializationWithIntegerKeys_999() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_998() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_997() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_996() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_995() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_994() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_993() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_992() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_991() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_990() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_989() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_988() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_987() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_986() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_985() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_984() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_983() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_982() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_981() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_980() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_979() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_978() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_977() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_976() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_975() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_974() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_973() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_972() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_971() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_970() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_969() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_968() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_967() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_966() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_965() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_964() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_963() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_962() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_961() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_960() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_959() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_958() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_957() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_956() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_955() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_954() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_953() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_952() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_951() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_950() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_949() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_948() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_947() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_946() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_945() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_944() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_943() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_942() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_941() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_940() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_939() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_938() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_937() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_936() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_935() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_934() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_933() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_932() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_931() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_930() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_929() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_928() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_927() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_926() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_925() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_924() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_923() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_922() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_921() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_920() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_919() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_918() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_917() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_916() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_915() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_914() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_913() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_912() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_911() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_910() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_909() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_908() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_907() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_906() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_905() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_904() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_903() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_902() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_901() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_900() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_899() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_898() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_897() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_896() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_895() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_894() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_893() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_892() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_891() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_890() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_889() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_888() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_887() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_886() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_885() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_884() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_883() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_882() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_881() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_880() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_879() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_878() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_877() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_876() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_875() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_874() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_873() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_872() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_871() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_870() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_869() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_868() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_867() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_866() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_865() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_864() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_863() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_862() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_861() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_860() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_859() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_858() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_857() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_856() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_855() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_854() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_853() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_852() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_851() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_850() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_849() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_848() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_847() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_846() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_845() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_844() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_843() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_842() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_841() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_840() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_839() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_838() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_837() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_836() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_835() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_834() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_833() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_832() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_831() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_830() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_829() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_828() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_827() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_826() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_825() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_824() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_823() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_822() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_821() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_820() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_819() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_818() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_817() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_816() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_815() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_814() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_813() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_812() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_811() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_810() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_809() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_808() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_807() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_806() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_805() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_804() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_803() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_802() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_801() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_800() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_799() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_798() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_797() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_796() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_795() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_794() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_793() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_792() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_791() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_790() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_789() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_788() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_787() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_786() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_785() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_784() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_783() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_782() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_781() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_780() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_779() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_778() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_777() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_776() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_775() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_774() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_773() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_772() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_771() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_770() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_769() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_768() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_767() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_766() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_765() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_764() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_763() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_762() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_761() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_760() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_759() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_758() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_757() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_756() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_755() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_754() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_753() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_752() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_751() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_750() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_749() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_748() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_747() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_746() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_745() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_744() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_743() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_742() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_741() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_740() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_739() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_738() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_737() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_736() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_735() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_734() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_733() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_732() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_731() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_730() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_729() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_728() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_727() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_726() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_725() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_724() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_723() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_722() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_721() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_720() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_719() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_718() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_717() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_716() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_715() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_714() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_713() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_712() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_711() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_710() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_709() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_708() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_707() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_706() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_705() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_704() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_703() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_702() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_701() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_700() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_699() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_698() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_697() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_696() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_695() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_694() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_693() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_692() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_691() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_690() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_689() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_688() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_687() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_686() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_685() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_684() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_683() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_682() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_681() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_680() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_679() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_678() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_677() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_676() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_675() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_674() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_673() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_672() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_671() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_670() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_669() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_668() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_667() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_666() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_665() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_664() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_663() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_662() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_661() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_660() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_659() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_658() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_657() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_656() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_655() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_654() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_653() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_652() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_651() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_650() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_649() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_648() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_647() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_646() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_645() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_644() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_643() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_642() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_641() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_640() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_639() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_638() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_637() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_636() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_635() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_634() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_633() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_632() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_631() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_630() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_629() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_628() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_627() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_626() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_625() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_624() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_623() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_622() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_621() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_620() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_619() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_618() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_617() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_616() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_615() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_614() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_613() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_612() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_611() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_610() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_609() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_608() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_607() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_606() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_605() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_604() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_603() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_602() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_601() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_600() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_599() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_598() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_597() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_596() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_595() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_594() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_593() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_592() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_591() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_590() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_589() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_588() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_587() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_586() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_585() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_584() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_583() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_582() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_581() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_580() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_579() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_578() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_577() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_576() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_575() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_574() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_573() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_572() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_571() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_570() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_569() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_568() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_567() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_566() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_565() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_564() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_563() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_562() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_561() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_560() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_559() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_558() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_557() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_556() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_555() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_554() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_553() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_552() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_551() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_550() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_549() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_548() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_547() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_546() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_545() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_544() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_543() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_542() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_541() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_540() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_539() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_538() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_537() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_536() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_535() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_534() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_533() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_532() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_531() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_530() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_529() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_528() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_527() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_526() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_525() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_524() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_523() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_522() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_521() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_520() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_519() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_518() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_517() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_516() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_515() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_514() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_513() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_512() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_511() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_510() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_509() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_508() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_507() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_506() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_505() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_504() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_503() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_502() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_501() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_500() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_499() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_498() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_497() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_496() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_495() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_494() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_493() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_492() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_491() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_490() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_489() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_488() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_487() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_486() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_485() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_484() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_483() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_482() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_481() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_480() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_479() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_478() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_477() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_476() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_475() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_474() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_473() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_472() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_471() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_470() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_469() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_468() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_467() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_466() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_465() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_464() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_463() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_462() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_461() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_460() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_459() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_458() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_457() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_456() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_455() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_454() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_453() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_452() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_451() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_450() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_449() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_448() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_447() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_446() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_445() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_444() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_443() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_442() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_441() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_440() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_439() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_438() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_437() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_436() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_435() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_434() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_433() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_432() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_431() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_430() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_429() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_428() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_427() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_426() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_425() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_424() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_423() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_422() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_421() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_420() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_419() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_418() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_417() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_416() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_415() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_414() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_413() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_412() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_411() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_410() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_409() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_408() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_407() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_406() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_405() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_404() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_403() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_402() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_401() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_400() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_399() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_398() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_397() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_396() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_395() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_394() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_393() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_392() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_391() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_390() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_389() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_388() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_387() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_386() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_385() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_384() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_383() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_382() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_381() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_380() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_379() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_378() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_377() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_376() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_375() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_374() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_373() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_372() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_371() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_370() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_369() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_368() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_367() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_366() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_365() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_364() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_363() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_362() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_361() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_360() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_359() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_358() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_357() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_356() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_355() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_354() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_353() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_352() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_351() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_350() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_349() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_348() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_347() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_346() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_345() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_344() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_343() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_342() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_341() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_340() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_339() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_338() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_337() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_336() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_335() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_334() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_333() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_332() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_331() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_330() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_329() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_328() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_327() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_326() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_325() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_324() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_323() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_322() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_321() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_320() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_319() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_318() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_317() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_316() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_315() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_314() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_313() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_312() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_311() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_310() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_309() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_308() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_307() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_306() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_305() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_304() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_303() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_302() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_301() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_300() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_299() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_298() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_297() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_296() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_295() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_294() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_293() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_292() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_291() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_290() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_289() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_288() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_287() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_286() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_285() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_284() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_283() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_282() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_281() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_280() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_279() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_278() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_277() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_276() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_275() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_274() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_273() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_272() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_271() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_270() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_269() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_268() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_267() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_266() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_265() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_264() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_263() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_262() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_261() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_260() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_259() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_258() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_257() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_256() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_255() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_254() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_253() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_252() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_251() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_250() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_249() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_248() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_247() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_246() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_245() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_244() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_243() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_242() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_241() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_240() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_239() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_238() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_237() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_236() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_235() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_234() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_233() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_232() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_231() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_230() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_229() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_228() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_227() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_226() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_225() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_224() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_223() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_222() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_221() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_220() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_219() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_218() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_217() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_216() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_215() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_214() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_213() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_212() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_211() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_210() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_209() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_208() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_207() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_206() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_205() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_204() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_203() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_202() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_201() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_200() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_199() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_198() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_197() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_196() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_195() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_194() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_193() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_192() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_191() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_190() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_189() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_188() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_187() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_186() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_185() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_184() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_183() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_182() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_181() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_180() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_179() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_178() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_177() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_176() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_175() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_174() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_173() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_172() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_171() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_170() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_169() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_168() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_167() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_166() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_165() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_164() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_163() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_162() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_161() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_160() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_159() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_158() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_157() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_156() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_155() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_154() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_153() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_152() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_151() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_150() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_149() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_148() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_147() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_146() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_145() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_144() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_143() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_142() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_141() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_140() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_139() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_138() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_137() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_136() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_135() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_134() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_133() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_132() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_131() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_130() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_129() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_128() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_127() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_126() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_125() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_124() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_123() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_122() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_121() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_120() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_119() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_118() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_117() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_116() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_115() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_114() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_113() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_112() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_111() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_110() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_109() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_108() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_107() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_106() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_105() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_104() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_103() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_102() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_101() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_100() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_99() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_98() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_97() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_96() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_95() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_94() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_93() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_92() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_91() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_90() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_89() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_88() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_87() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_86() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_85() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_84() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_83() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_82() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_81() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_80() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_79() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_78() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_77() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_76() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_75() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_74() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_73() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_72() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_71() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_70() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_69() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_68() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_67() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_66() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_65() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_64() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_63() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_62() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_61() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_60() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_59() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_58() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_57() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_56() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_55() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_54() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_53() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_52() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_51() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_50() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_49() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_48() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_47() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_46() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_45() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_44() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_43() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_42() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_41() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_40() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_39() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_38() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_37() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_36() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_35() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_34() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_33() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_32() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_31() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_30() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_29() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_28() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_27() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_26() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_25() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_24() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_23() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_22() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_21() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_20() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_19() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_18() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_17() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_16() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_15() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_14() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_13() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_12() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_11() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
    }

    public void testMapSerializationWithIntegerKeys_10() {
        java.util.Map<java.lang.Integer, java.lang.String> map = new java.util.LinkedHashMap<java.lang.Integer, java.lang.String>();
        map.put(123, "456");
        java.lang.reflect.Type typeOfMap = new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.Integer, java.lang.String>>() {}.getType();
        java.lang.String json = gson.toJson(map, typeOfMap);
        junit.framework.Assert.assertEquals("{\"123\":\"456\"}", json);
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.MapTest_testMapSerializationWithIntegerKeys_1000.class) {}) {
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