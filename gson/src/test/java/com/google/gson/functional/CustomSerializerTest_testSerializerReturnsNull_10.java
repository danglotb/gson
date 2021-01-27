/* Copyright (C) 2009 Google Inc.

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
 * Functional Test exercising custom serialization only.  When test applies to both
 * serialization and deserialization then add it to CustomTypeAdapterTest.
 *
 * @author Inderjeet Singh
 */
public class CustomSerializerTest_testSerializerReturnsNull_10 extends junit.framework.TestCase {
    public void testSerializerReturnsNull_9() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_8() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_7() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_6() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_5() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_4() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_3() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_2() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_1() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_0() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.CustomSerializerTest_testSerializerReturnsNull_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.CustomSerializerTest", "testSerializerReturnsNull");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}