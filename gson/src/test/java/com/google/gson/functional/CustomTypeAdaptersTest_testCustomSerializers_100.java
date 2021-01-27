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
 * Functional tests for the support of custom serializer and deserializers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CustomTypeAdaptersTest_testCustomSerializers_100 extends junit.framework.TestCase {
    private com.google.gson.GsonBuilder builder;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        builder = new com.google.gson.GsonBuilder();
    }

    public void testCustomSerializers_99() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_98() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_97() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_96() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_95() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_94() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_93() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_92() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_91() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_90() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_89() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_88() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_87() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_86() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_85() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_84() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_83() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_82() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_81() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_80() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_79() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_78() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_77() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_76() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_75() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_74() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_73() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_72() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_71() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_70() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_69() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_68() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_67() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_66() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_65() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_64() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_63() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_62() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_61() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_60() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_59() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_58() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_57() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_56() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_55() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_54() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_53() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_52() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_51() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_50() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_49() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_48() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_47() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_46() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_45() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_44() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_43() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_42() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_41() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_40() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_39() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_38() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_37() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_36() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_35() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_34() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_33() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_32() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_31() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_30() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_29() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_28() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_27() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_26() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_25() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_24() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_23() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_22() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_21() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_20() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_19() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_18() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_17() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_16() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_15() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_14() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_13() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_12() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_11() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_10() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_9() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_8() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_7() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_6() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_5() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_4() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_3() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_2() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_1() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers_0() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void testCustomSerializers() {
        com.google.gson.Gson gson = builder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter.class, new com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithCustomTypeConverter>() {
            public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithCustomTypeConverter src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                com.google.gson.JsonObject json = new com.google.gson.JsonObject();
                json.addProperty("bag", 5);
                json.addProperty("value", 25);
                return json;
            }
        }).create();
        com.google.gson.common.TestTypes.ClassWithCustomTypeConverter target = new com.google.gson.common.TestTypes.ClassWithCustomTypeConverter();
        junit.framework.Assert.assertEquals("{\"bag\":5,\"value\":25}", gson.toJson(target));
    }

    public void disable_testCustomSerializersOfSelf() {
        com.google.gson.Gson gson = createGsonObjectWithFooTypeAdapter();
        com.google.gson.Gson basicGson = new com.google.gson.Gson();
        com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo newFooObject = new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo(1, 2L);
        java.lang.String jsonFromCustomSerializer = gson.toJson(newFooObject);
        java.lang.String jsonFromGson = basicGson.toJson(newFooObject);
        junit.framework.Assert.assertEquals(jsonFromGson, jsonFromCustomSerializer);
    }

    public void disable_testCustomDeserializersOfSelf() {
        com.google.gson.Gson gson = createGsonObjectWithFooTypeAdapter();
        com.google.gson.Gson basicGson = new com.google.gson.Gson();
        com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo expectedFoo = new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo(1, 2L);
        java.lang.String json = basicGson.toJson(expectedFoo);
        com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo newFooObject = gson.fromJson(json, com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo.class);
        junit.framework.Assert.assertEquals(expectedFoo.key, newFooObject.key);
        junit.framework.Assert.assertEquals(expectedFoo.value, newFooObject.value);
    }

    private static class Base {
        int baseValue = 2;
    }

    private static class Derived extends com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Base {
        @java.lang.SuppressWarnings("unused")
        int derivedValue = 3;
    }

    private com.google.gson.Gson createGsonObjectWithFooTypeAdapter() {
        return new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo.class, new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.FooTypeAdapter()).create();
    }

    public static class Foo {
        private final int key;

        private final long value;

        public Foo() {
            this(0, 0L);
        }

        public Foo(int key, long value) {
            this.key = key;
            this.value = value;
        }
    }

    public static class FooTypeAdapter implements com.google.gson.JsonSerializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo> , com.google.gson.JsonDeserializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo> {
        public com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            return context.deserialize(json, typeOfT);
        }

        public com.google.gson.JsonElement serialize(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.Foo src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            return context.serialize(src, typeOfSrc);
        }
    }

    private static class StringHolder {
        java.lang.String part1;

        java.lang.String part2;

        public StringHolder(java.lang.String string) {
            java.lang.String[] parts = string.split(":");
            part1 = parts[0];
            part2 = parts[1];
        }

        public StringHolder(java.lang.String part1, java.lang.String part2) {
            this.part1 = part1;
            this.part2 = part2;
        }
    }

    private static class StringHolderTypeAdapter implements com.google.gson.JsonSerializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.StringHolder> , com.google.gson.JsonDeserializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.StringHolder> , com.google.gson.InstanceCreator<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.StringHolder> {
        public com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.StringHolder createInstance(java.lang.reflect.Type type) {
            // Fill up with objects that will be thrown away
            return new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.StringHolder("unknown:thing");
        }

        public com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.StringHolder deserialize(com.google.gson.JsonElement src, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) {
            return new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.StringHolder(src.getAsString());
        }

        public com.google.gson.JsonElement serialize(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.StringHolder src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            java.lang.String contents = (src.part1 + ':') + src.part2;
            return new com.google.gson.JsonPrimitive(contents);
        }
    }

    private static class DataHolder {
        final java.lang.String data;

        public DataHolder(java.lang.String data) {
            this.data = data;
        }
    }

    private static class DataHolderWrapper {
        final com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.DataHolder wrappedData;

        public DataHolderWrapper(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.DataHolder data) {
            this.wrappedData = data;
        }
    }

    private static class DataHolderSerializer implements com.google.gson.JsonSerializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.DataHolder> {
        public com.google.gson.JsonElement serialize(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.DataHolder src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
            obj.addProperty("myData", src.data);
            return obj;
        }
    }

    private static class DataHolderDeserializer implements com.google.gson.JsonDeserializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.DataHolder> {
        public com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.DataHolder deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            com.google.gson.JsonObject jsonObj = json.getAsJsonObject();
            com.google.gson.JsonElement jsonElement = jsonObj.get("data");
            if ((jsonElement == null) || jsonElement.isJsonNull()) {
                return new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.DataHolder(null);
            }
            return new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.DataHolder(jsonElement.getAsString());
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.CustomTypeAdaptersTest", "testCustomSerializers");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}