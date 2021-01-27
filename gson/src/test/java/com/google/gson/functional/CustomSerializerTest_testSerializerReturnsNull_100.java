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
public class CustomSerializerTest_testSerializerReturnsNull_100 extends junit.framework.TestCase {
    public void testSerializerReturnsNull_99() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_98() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_97() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_96() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_95() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_94() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_93() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_92() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_91() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_90() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_89() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_88() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_87() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_86() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_85() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_84() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_83() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_82() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_81() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_80() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_79() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_78() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_77() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_76() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_75() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_74() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_73() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_72() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_71() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_70() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_69() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_68() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_67() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_66() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_65() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_64() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_63() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_62() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_61() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_60() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_59() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_58() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_57() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_56() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_55() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_54() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_53() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_52() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_51() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_50() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_49() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_48() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_47() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_46() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_45() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_44() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_43() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_42() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_41() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_40() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_39() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_38() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_37() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_36() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_35() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_34() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_33() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_32() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_31() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_30() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_29() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_28() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_27() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_26() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_25() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_24() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_23() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_22() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_21() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_20() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_19() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_18() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_17() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_16() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_15() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_14() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_13() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_12() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_11() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_10() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.CustomSerializerTest_testSerializerReturnsNull_100.class) {}) {
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