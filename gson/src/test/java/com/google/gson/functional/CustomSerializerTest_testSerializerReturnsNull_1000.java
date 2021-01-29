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
public class CustomSerializerTest_testSerializerReturnsNull_1000 extends junit.framework.TestCase {
    public void testSerializerReturnsNull_999() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_998() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_997() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_996() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_995() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_994() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_993() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_992() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_991() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_990() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_989() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_988() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_987() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_986() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_985() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_984() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_983() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_982() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_981() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_980() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_979() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_978() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_977() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_976() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_975() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_974() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_973() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_972() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_971() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_970() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_969() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_968() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_967() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_966() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_965() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_964() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_963() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_962() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_961() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_960() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_959() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_958() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_957() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_956() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_955() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_954() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_953() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_952() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_951() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_950() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_949() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_948() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_947() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_946() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_945() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_944() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_943() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_942() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_941() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_940() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_939() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_938() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_937() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_936() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_935() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_934() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_933() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_932() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_931() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_930() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_929() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_928() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_927() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_926() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_925() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_924() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_923() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_922() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_921() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_920() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_919() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_918() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_917() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_916() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_915() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_914() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_913() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_912() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_911() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_910() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_909() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_908() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_907() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_906() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_905() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_904() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_903() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_902() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_901() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_900() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_899() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_898() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_897() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_896() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_895() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_894() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_893() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_892() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_891() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_890() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_889() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_888() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_887() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_886() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_885() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_884() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_883() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_882() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_881() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_880() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_879() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_878() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_877() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_876() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_875() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_874() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_873() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_872() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_871() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_870() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_869() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_868() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_867() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_866() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_865() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_864() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_863() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_862() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_861() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_860() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_859() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_858() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_857() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_856() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_855() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_854() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_853() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_852() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_851() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_850() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_849() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_848() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_847() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_846() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_845() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_844() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_843() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_842() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_841() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_840() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_839() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_838() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_837() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_836() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_835() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_834() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_833() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_832() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_831() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_830() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_829() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_828() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_827() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_826() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_825() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_824() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_823() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_822() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_821() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_820() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_819() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_818() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_817() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_816() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_815() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_814() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_813() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_812() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_811() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_810() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_809() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_808() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_807() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_806() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_805() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_804() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_803() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_802() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_801() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_800() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_799() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_798() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_797() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_796() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_795() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_794() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_793() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_792() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_791() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_790() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_789() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_788() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_787() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_786() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_785() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_784() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_783() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_782() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_781() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_780() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_779() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_778() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_777() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_776() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_775() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_774() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_773() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_772() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_771() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_770() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_769() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_768() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_767() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_766() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_765() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_764() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_763() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_762() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_761() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_760() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_759() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_758() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_757() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_756() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_755() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_754() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_753() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_752() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_751() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_750() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_749() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_748() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_747() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_746() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_745() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_744() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_743() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_742() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_741() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_740() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_739() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_738() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_737() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_736() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_735() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_734() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_733() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_732() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_731() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_730() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_729() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_728() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_727() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_726() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_725() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_724() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_723() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_722() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_721() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_720() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_719() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_718() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_717() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_716() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_715() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_714() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_713() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_712() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_711() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_710() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_709() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_708() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_707() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_706() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_705() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_704() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_703() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_702() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_701() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_700() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_699() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_698() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_697() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_696() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_695() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_694() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_693() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_692() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_691() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_690() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_689() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_688() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_687() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_686() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_685() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_684() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_683() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_682() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_681() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_680() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_679() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_678() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_677() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_676() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_675() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_674() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_673() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_672() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_671() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_670() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_669() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_668() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_667() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_666() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_665() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_664() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_663() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_662() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_661() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_660() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_659() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_658() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_657() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_656() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_655() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_654() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_653() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_652() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_651() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_650() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_649() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_648() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_647() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_646() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_645() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_644() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_643() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_642() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_641() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_640() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_639() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_638() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_637() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_636() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_635() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_634() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_633() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_632() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_631() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_630() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_629() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_628() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_627() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_626() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_625() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_624() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_623() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_622() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_621() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_620() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_619() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_618() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_617() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_616() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_615() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_614() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_613() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_612() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_611() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_610() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_609() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_608() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_607() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_606() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_605() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_604() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_603() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_602() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_601() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_600() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_599() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_598() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_597() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_596() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_595() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_594() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_593() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_592() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_591() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_590() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_589() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_588() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_587() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_586() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_585() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_584() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_583() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_582() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_581() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_580() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_579() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_578() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_577() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_576() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_575() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_574() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_573() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_572() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_571() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_570() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_569() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_568() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_567() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_566() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_565() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_564() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_563() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_562() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_561() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_560() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_559() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_558() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_557() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_556() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_555() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_554() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_553() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_552() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_551() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_550() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_549() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_548() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_547() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_546() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_545() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_544() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_543() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_542() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_541() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_540() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_539() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_538() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_537() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_536() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_535() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_534() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_533() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_532() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_531() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_530() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_529() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_528() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_527() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_526() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_525() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_524() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_523() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_522() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_521() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_520() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_519() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_518() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_517() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_516() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_515() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_514() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_513() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_512() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_511() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_510() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_509() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_508() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_507() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_506() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_505() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_504() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_503() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_502() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_501() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_500() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_499() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_498() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_497() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_496() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_495() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_494() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_493() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_492() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_491() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_490() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_489() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_488() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_487() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_486() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_485() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_484() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_483() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_482() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_481() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_480() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_479() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_478() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_477() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_476() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_475() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_474() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_473() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_472() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_471() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_470() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_469() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_468() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_467() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_466() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_465() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_464() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_463() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_462() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_461() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_460() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_459() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_458() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_457() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_456() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_455() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_454() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_453() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_452() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_451() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_450() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_449() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_448() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_447() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_446() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_445() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_444() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_443() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_442() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_441() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_440() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_439() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_438() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_437() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_436() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_435() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_434() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_433() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_432() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_431() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_430() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_429() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_428() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_427() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_426() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_425() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_424() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_423() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_422() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_421() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_420() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_419() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_418() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_417() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_416() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_415() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_414() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_413() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_412() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_411() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_410() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_409() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_408() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_407() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_406() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_405() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_404() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_403() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_402() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_401() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_400() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_399() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_398() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_397() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_396() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_395() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_394() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_393() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_392() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_391() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_390() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_389() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_388() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_387() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_386() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_385() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_384() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_383() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_382() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_381() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_380() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_379() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_378() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_377() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_376() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_375() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_374() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_373() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_372() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_371() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_370() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_369() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_368() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_367() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_366() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_365() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_364() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_363() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_362() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_361() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_360() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_359() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_358() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_357() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_356() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_355() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_354() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_353() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_352() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_351() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_350() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_349() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_348() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_347() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_346() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_345() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_344() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_343() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_342() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_341() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_340() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_339() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_338() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_337() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_336() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_335() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_334() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_333() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_332() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_331() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_330() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_329() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_328() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_327() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_326() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_325() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_324() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_323() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_322() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_321() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_320() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_319() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_318() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_317() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_316() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_315() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_314() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_313() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_312() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_311() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_310() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_309() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_308() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_307() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_306() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_305() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_304() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_303() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_302() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_301() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_300() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_299() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_298() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_297() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_296() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_295() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_294() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_293() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_292() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_291() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_290() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_289() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_288() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_287() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_286() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_285() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_284() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_283() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_282() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_281() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_280() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_279() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_278() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_277() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_276() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_275() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_274() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_273() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_272() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_271() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_270() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_269() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_268() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_267() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_266() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_265() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_264() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_263() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_262() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_261() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_260() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_259() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_258() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_257() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_256() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_255() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_254() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_253() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_252() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_251() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_250() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_249() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_248() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_247() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_246() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_245() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_244() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_243() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_242() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_241() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_240() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_239() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_238() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_237() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_236() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_235() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_234() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_233() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_232() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_231() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_230() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_229() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_228() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_227() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_226() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_225() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_224() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_223() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_222() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_221() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_220() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_219() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_218() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_217() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_216() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_215() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_214() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_213() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_212() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_211() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_210() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_209() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_208() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_207() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_206() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_205() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_204() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_203() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_202() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_201() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_200() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_199() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_198() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_197() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_196() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_195() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_194() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_193() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_192() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_191() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_190() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_189() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_188() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_187() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_186() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_185() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_184() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_183() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_182() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_181() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_180() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_179() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_178() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_177() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_176() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_175() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_174() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_173() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_172() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_171() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_170() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_169() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_168() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_167() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_166() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_165() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_164() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_163() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_162() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_161() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_160() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_159() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_158() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_157() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_156() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_155() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_154() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_153() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_152() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_151() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_150() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_149() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_148() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_147() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_146() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_145() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_144() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_143() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_142() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_141() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_140() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_139() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_138() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_137() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_136() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_135() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_134() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_133() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_132() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_131() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_130() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_129() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_128() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_127() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_126() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_125() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_124() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_123() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_122() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_121() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_120() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_119() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_118() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_117() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_116() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_115() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_114() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_113() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_112() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_111() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_110() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_109() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_108() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_107() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_106() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_105() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_104() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_103() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_102() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_101() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

    public void testSerializerReturnsNull_100() {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.common.TestTypes.Base.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.Base>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.Base src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        }).create();
        com.google.gson.JsonElement json = gson.toJsonTree(new com.google.gson.common.TestTypes.Base());
        junit.framework.Assert.assertTrue(json.isJsonNull());
    }

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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.CustomSerializerTest_testSerializerReturnsNull_1000.class) {}) {
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