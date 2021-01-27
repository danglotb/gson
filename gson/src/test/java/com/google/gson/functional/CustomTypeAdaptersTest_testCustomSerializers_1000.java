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
public class CustomTypeAdaptersTest_testCustomSerializers_1000 extends junit.framework.TestCase {
    private com.google.gson.GsonBuilder builder;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        builder = new com.google.gson.GsonBuilder();
    }

    public void testCustomSerializers_999() {
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

    public void testCustomSerializers_998() {
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

    public void testCustomSerializers_997() {
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

    public void testCustomSerializers_996() {
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

    public void testCustomSerializers_995() {
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

    public void testCustomSerializers_994() {
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

    public void testCustomSerializers_993() {
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

    public void testCustomSerializers_992() {
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

    public void testCustomSerializers_991() {
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

    public void testCustomSerializers_990() {
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

    public void testCustomSerializers_989() {
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

    public void testCustomSerializers_988() {
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

    public void testCustomSerializers_987() {
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

    public void testCustomSerializers_986() {
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

    public void testCustomSerializers_985() {
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

    public void testCustomSerializers_984() {
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

    public void testCustomSerializers_983() {
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

    public void testCustomSerializers_982() {
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

    public void testCustomSerializers_981() {
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

    public void testCustomSerializers_980() {
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

    public void testCustomSerializers_979() {
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

    public void testCustomSerializers_978() {
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

    public void testCustomSerializers_977() {
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

    public void testCustomSerializers_976() {
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

    public void testCustomSerializers_975() {
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

    public void testCustomSerializers_974() {
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

    public void testCustomSerializers_973() {
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

    public void testCustomSerializers_972() {
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

    public void testCustomSerializers_971() {
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

    public void testCustomSerializers_970() {
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

    public void testCustomSerializers_969() {
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

    public void testCustomSerializers_968() {
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

    public void testCustomSerializers_967() {
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

    public void testCustomSerializers_966() {
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

    public void testCustomSerializers_965() {
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

    public void testCustomSerializers_964() {
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

    public void testCustomSerializers_963() {
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

    public void testCustomSerializers_962() {
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

    public void testCustomSerializers_961() {
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

    public void testCustomSerializers_960() {
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

    public void testCustomSerializers_959() {
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

    public void testCustomSerializers_958() {
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

    public void testCustomSerializers_957() {
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

    public void testCustomSerializers_956() {
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

    public void testCustomSerializers_955() {
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

    public void testCustomSerializers_954() {
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

    public void testCustomSerializers_953() {
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

    public void testCustomSerializers_952() {
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

    public void testCustomSerializers_951() {
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

    public void testCustomSerializers_950() {
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

    public void testCustomSerializers_949() {
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

    public void testCustomSerializers_948() {
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

    public void testCustomSerializers_947() {
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

    public void testCustomSerializers_946() {
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

    public void testCustomSerializers_945() {
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

    public void testCustomSerializers_944() {
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

    public void testCustomSerializers_943() {
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

    public void testCustomSerializers_942() {
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

    public void testCustomSerializers_941() {
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

    public void testCustomSerializers_940() {
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

    public void testCustomSerializers_939() {
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

    public void testCustomSerializers_938() {
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

    public void testCustomSerializers_937() {
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

    public void testCustomSerializers_936() {
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

    public void testCustomSerializers_935() {
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

    public void testCustomSerializers_934() {
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

    public void testCustomSerializers_933() {
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

    public void testCustomSerializers_932() {
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

    public void testCustomSerializers_931() {
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

    public void testCustomSerializers_930() {
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

    public void testCustomSerializers_929() {
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

    public void testCustomSerializers_928() {
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

    public void testCustomSerializers_927() {
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

    public void testCustomSerializers_926() {
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

    public void testCustomSerializers_925() {
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

    public void testCustomSerializers_924() {
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

    public void testCustomSerializers_923() {
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

    public void testCustomSerializers_922() {
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

    public void testCustomSerializers_921() {
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

    public void testCustomSerializers_920() {
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

    public void testCustomSerializers_919() {
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

    public void testCustomSerializers_918() {
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

    public void testCustomSerializers_917() {
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

    public void testCustomSerializers_916() {
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

    public void testCustomSerializers_915() {
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

    public void testCustomSerializers_914() {
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

    public void testCustomSerializers_913() {
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

    public void testCustomSerializers_912() {
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

    public void testCustomSerializers_911() {
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

    public void testCustomSerializers_910() {
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

    public void testCustomSerializers_909() {
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

    public void testCustomSerializers_908() {
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

    public void testCustomSerializers_907() {
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

    public void testCustomSerializers_906() {
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

    public void testCustomSerializers_905() {
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

    public void testCustomSerializers_904() {
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

    public void testCustomSerializers_903() {
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

    public void testCustomSerializers_902() {
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

    public void testCustomSerializers_901() {
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

    public void testCustomSerializers_900() {
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

    public void testCustomSerializers_899() {
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

    public void testCustomSerializers_898() {
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

    public void testCustomSerializers_897() {
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

    public void testCustomSerializers_896() {
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

    public void testCustomSerializers_895() {
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

    public void testCustomSerializers_894() {
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

    public void testCustomSerializers_893() {
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

    public void testCustomSerializers_892() {
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

    public void testCustomSerializers_891() {
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

    public void testCustomSerializers_890() {
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

    public void testCustomSerializers_889() {
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

    public void testCustomSerializers_888() {
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

    public void testCustomSerializers_887() {
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

    public void testCustomSerializers_886() {
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

    public void testCustomSerializers_885() {
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

    public void testCustomSerializers_884() {
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

    public void testCustomSerializers_883() {
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

    public void testCustomSerializers_882() {
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

    public void testCustomSerializers_881() {
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

    public void testCustomSerializers_880() {
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

    public void testCustomSerializers_879() {
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

    public void testCustomSerializers_878() {
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

    public void testCustomSerializers_877() {
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

    public void testCustomSerializers_876() {
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

    public void testCustomSerializers_875() {
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

    public void testCustomSerializers_874() {
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

    public void testCustomSerializers_873() {
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

    public void testCustomSerializers_872() {
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

    public void testCustomSerializers_871() {
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

    public void testCustomSerializers_870() {
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

    public void testCustomSerializers_869() {
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

    public void testCustomSerializers_868() {
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

    public void testCustomSerializers_867() {
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

    public void testCustomSerializers_866() {
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

    public void testCustomSerializers_865() {
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

    public void testCustomSerializers_864() {
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

    public void testCustomSerializers_863() {
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

    public void testCustomSerializers_862() {
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

    public void testCustomSerializers_861() {
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

    public void testCustomSerializers_860() {
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

    public void testCustomSerializers_859() {
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

    public void testCustomSerializers_858() {
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

    public void testCustomSerializers_857() {
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

    public void testCustomSerializers_856() {
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

    public void testCustomSerializers_855() {
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

    public void testCustomSerializers_854() {
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

    public void testCustomSerializers_853() {
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

    public void testCustomSerializers_852() {
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

    public void testCustomSerializers_851() {
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

    public void testCustomSerializers_850() {
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

    public void testCustomSerializers_849() {
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

    public void testCustomSerializers_848() {
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

    public void testCustomSerializers_847() {
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

    public void testCustomSerializers_846() {
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

    public void testCustomSerializers_845() {
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

    public void testCustomSerializers_844() {
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

    public void testCustomSerializers_843() {
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

    public void testCustomSerializers_842() {
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

    public void testCustomSerializers_841() {
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

    public void testCustomSerializers_840() {
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

    public void testCustomSerializers_839() {
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

    public void testCustomSerializers_838() {
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

    public void testCustomSerializers_837() {
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

    public void testCustomSerializers_836() {
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

    public void testCustomSerializers_835() {
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

    public void testCustomSerializers_834() {
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

    public void testCustomSerializers_833() {
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

    public void testCustomSerializers_832() {
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

    public void testCustomSerializers_831() {
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

    public void testCustomSerializers_830() {
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

    public void testCustomSerializers_829() {
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

    public void testCustomSerializers_828() {
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

    public void testCustomSerializers_827() {
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

    public void testCustomSerializers_826() {
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

    public void testCustomSerializers_825() {
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

    public void testCustomSerializers_824() {
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

    public void testCustomSerializers_823() {
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

    public void testCustomSerializers_822() {
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

    public void testCustomSerializers_821() {
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

    public void testCustomSerializers_820() {
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

    public void testCustomSerializers_819() {
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

    public void testCustomSerializers_818() {
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

    public void testCustomSerializers_817() {
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

    public void testCustomSerializers_816() {
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

    public void testCustomSerializers_815() {
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

    public void testCustomSerializers_814() {
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

    public void testCustomSerializers_813() {
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

    public void testCustomSerializers_812() {
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

    public void testCustomSerializers_811() {
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

    public void testCustomSerializers_810() {
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

    public void testCustomSerializers_809() {
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

    public void testCustomSerializers_808() {
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

    public void testCustomSerializers_807() {
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

    public void testCustomSerializers_806() {
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

    public void testCustomSerializers_805() {
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

    public void testCustomSerializers_804() {
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

    public void testCustomSerializers_803() {
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

    public void testCustomSerializers_802() {
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

    public void testCustomSerializers_801() {
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

    public void testCustomSerializers_800() {
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

    public void testCustomSerializers_799() {
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

    public void testCustomSerializers_798() {
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

    public void testCustomSerializers_797() {
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

    public void testCustomSerializers_796() {
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

    public void testCustomSerializers_795() {
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

    public void testCustomSerializers_794() {
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

    public void testCustomSerializers_793() {
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

    public void testCustomSerializers_792() {
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

    public void testCustomSerializers_791() {
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

    public void testCustomSerializers_790() {
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

    public void testCustomSerializers_789() {
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

    public void testCustomSerializers_788() {
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

    public void testCustomSerializers_787() {
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

    public void testCustomSerializers_786() {
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

    public void testCustomSerializers_785() {
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

    public void testCustomSerializers_784() {
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

    public void testCustomSerializers_783() {
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

    public void testCustomSerializers_782() {
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

    public void testCustomSerializers_781() {
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

    public void testCustomSerializers_780() {
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

    public void testCustomSerializers_779() {
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

    public void testCustomSerializers_778() {
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

    public void testCustomSerializers_777() {
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

    public void testCustomSerializers_776() {
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

    public void testCustomSerializers_775() {
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

    public void testCustomSerializers_774() {
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

    public void testCustomSerializers_773() {
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

    public void testCustomSerializers_772() {
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

    public void testCustomSerializers_771() {
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

    public void testCustomSerializers_770() {
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

    public void testCustomSerializers_769() {
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

    public void testCustomSerializers_768() {
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

    public void testCustomSerializers_767() {
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

    public void testCustomSerializers_766() {
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

    public void testCustomSerializers_765() {
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

    public void testCustomSerializers_764() {
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

    public void testCustomSerializers_763() {
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

    public void testCustomSerializers_762() {
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

    public void testCustomSerializers_761() {
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

    public void testCustomSerializers_760() {
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

    public void testCustomSerializers_759() {
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

    public void testCustomSerializers_758() {
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

    public void testCustomSerializers_757() {
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

    public void testCustomSerializers_756() {
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

    public void testCustomSerializers_755() {
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

    public void testCustomSerializers_754() {
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

    public void testCustomSerializers_753() {
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

    public void testCustomSerializers_752() {
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

    public void testCustomSerializers_751() {
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

    public void testCustomSerializers_750() {
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

    public void testCustomSerializers_749() {
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

    public void testCustomSerializers_748() {
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

    public void testCustomSerializers_747() {
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

    public void testCustomSerializers_746() {
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

    public void testCustomSerializers_745() {
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

    public void testCustomSerializers_744() {
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

    public void testCustomSerializers_743() {
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

    public void testCustomSerializers_742() {
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

    public void testCustomSerializers_741() {
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

    public void testCustomSerializers_740() {
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

    public void testCustomSerializers_739() {
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

    public void testCustomSerializers_738() {
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

    public void testCustomSerializers_737() {
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

    public void testCustomSerializers_736() {
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

    public void testCustomSerializers_735() {
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

    public void testCustomSerializers_734() {
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

    public void testCustomSerializers_733() {
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

    public void testCustomSerializers_732() {
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

    public void testCustomSerializers_731() {
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

    public void testCustomSerializers_730() {
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

    public void testCustomSerializers_729() {
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

    public void testCustomSerializers_728() {
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

    public void testCustomSerializers_727() {
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

    public void testCustomSerializers_726() {
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

    public void testCustomSerializers_725() {
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

    public void testCustomSerializers_724() {
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

    public void testCustomSerializers_723() {
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

    public void testCustomSerializers_722() {
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

    public void testCustomSerializers_721() {
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

    public void testCustomSerializers_720() {
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

    public void testCustomSerializers_719() {
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

    public void testCustomSerializers_718() {
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

    public void testCustomSerializers_717() {
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

    public void testCustomSerializers_716() {
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

    public void testCustomSerializers_715() {
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

    public void testCustomSerializers_714() {
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

    public void testCustomSerializers_713() {
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

    public void testCustomSerializers_712() {
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

    public void testCustomSerializers_711() {
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

    public void testCustomSerializers_710() {
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

    public void testCustomSerializers_709() {
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

    public void testCustomSerializers_708() {
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

    public void testCustomSerializers_707() {
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

    public void testCustomSerializers_706() {
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

    public void testCustomSerializers_705() {
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

    public void testCustomSerializers_704() {
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

    public void testCustomSerializers_703() {
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

    public void testCustomSerializers_702() {
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

    public void testCustomSerializers_701() {
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

    public void testCustomSerializers_700() {
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

    public void testCustomSerializers_699() {
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

    public void testCustomSerializers_698() {
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

    public void testCustomSerializers_697() {
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

    public void testCustomSerializers_696() {
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

    public void testCustomSerializers_695() {
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

    public void testCustomSerializers_694() {
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

    public void testCustomSerializers_693() {
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

    public void testCustomSerializers_692() {
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

    public void testCustomSerializers_691() {
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

    public void testCustomSerializers_690() {
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

    public void testCustomSerializers_689() {
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

    public void testCustomSerializers_688() {
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

    public void testCustomSerializers_687() {
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

    public void testCustomSerializers_686() {
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

    public void testCustomSerializers_685() {
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

    public void testCustomSerializers_684() {
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

    public void testCustomSerializers_683() {
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

    public void testCustomSerializers_682() {
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

    public void testCustomSerializers_681() {
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

    public void testCustomSerializers_680() {
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

    public void testCustomSerializers_679() {
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

    public void testCustomSerializers_678() {
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

    public void testCustomSerializers_677() {
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

    public void testCustomSerializers_676() {
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

    public void testCustomSerializers_675() {
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

    public void testCustomSerializers_674() {
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

    public void testCustomSerializers_673() {
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

    public void testCustomSerializers_672() {
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

    public void testCustomSerializers_671() {
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

    public void testCustomSerializers_670() {
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

    public void testCustomSerializers_669() {
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

    public void testCustomSerializers_668() {
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

    public void testCustomSerializers_667() {
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

    public void testCustomSerializers_666() {
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

    public void testCustomSerializers_665() {
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

    public void testCustomSerializers_664() {
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

    public void testCustomSerializers_663() {
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

    public void testCustomSerializers_662() {
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

    public void testCustomSerializers_661() {
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

    public void testCustomSerializers_660() {
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

    public void testCustomSerializers_659() {
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

    public void testCustomSerializers_658() {
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

    public void testCustomSerializers_657() {
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

    public void testCustomSerializers_656() {
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

    public void testCustomSerializers_655() {
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

    public void testCustomSerializers_654() {
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

    public void testCustomSerializers_653() {
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

    public void testCustomSerializers_652() {
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

    public void testCustomSerializers_651() {
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

    public void testCustomSerializers_650() {
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

    public void testCustomSerializers_649() {
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

    public void testCustomSerializers_648() {
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

    public void testCustomSerializers_647() {
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

    public void testCustomSerializers_646() {
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

    public void testCustomSerializers_645() {
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

    public void testCustomSerializers_644() {
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

    public void testCustomSerializers_643() {
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

    public void testCustomSerializers_642() {
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

    public void testCustomSerializers_641() {
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

    public void testCustomSerializers_640() {
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

    public void testCustomSerializers_639() {
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

    public void testCustomSerializers_638() {
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

    public void testCustomSerializers_637() {
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

    public void testCustomSerializers_636() {
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

    public void testCustomSerializers_635() {
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

    public void testCustomSerializers_634() {
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

    public void testCustomSerializers_633() {
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

    public void testCustomSerializers_632() {
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

    public void testCustomSerializers_631() {
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

    public void testCustomSerializers_630() {
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

    public void testCustomSerializers_629() {
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

    public void testCustomSerializers_628() {
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

    public void testCustomSerializers_627() {
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

    public void testCustomSerializers_626() {
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

    public void testCustomSerializers_625() {
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

    public void testCustomSerializers_624() {
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

    public void testCustomSerializers_623() {
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

    public void testCustomSerializers_622() {
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

    public void testCustomSerializers_621() {
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

    public void testCustomSerializers_620() {
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

    public void testCustomSerializers_619() {
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

    public void testCustomSerializers_618() {
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

    public void testCustomSerializers_617() {
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

    public void testCustomSerializers_616() {
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

    public void testCustomSerializers_615() {
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

    public void testCustomSerializers_614() {
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

    public void testCustomSerializers_613() {
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

    public void testCustomSerializers_612() {
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

    public void testCustomSerializers_611() {
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

    public void testCustomSerializers_610() {
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

    public void testCustomSerializers_609() {
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

    public void testCustomSerializers_608() {
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

    public void testCustomSerializers_607() {
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

    public void testCustomSerializers_606() {
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

    public void testCustomSerializers_605() {
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

    public void testCustomSerializers_604() {
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

    public void testCustomSerializers_603() {
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

    public void testCustomSerializers_602() {
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

    public void testCustomSerializers_601() {
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

    public void testCustomSerializers_600() {
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

    public void testCustomSerializers_599() {
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

    public void testCustomSerializers_598() {
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

    public void testCustomSerializers_597() {
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

    public void testCustomSerializers_596() {
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

    public void testCustomSerializers_595() {
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

    public void testCustomSerializers_594() {
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

    public void testCustomSerializers_593() {
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

    public void testCustomSerializers_592() {
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

    public void testCustomSerializers_591() {
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

    public void testCustomSerializers_590() {
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

    public void testCustomSerializers_589() {
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

    public void testCustomSerializers_588() {
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

    public void testCustomSerializers_587() {
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

    public void testCustomSerializers_586() {
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

    public void testCustomSerializers_585() {
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

    public void testCustomSerializers_584() {
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

    public void testCustomSerializers_583() {
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

    public void testCustomSerializers_582() {
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

    public void testCustomSerializers_581() {
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

    public void testCustomSerializers_580() {
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

    public void testCustomSerializers_579() {
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

    public void testCustomSerializers_578() {
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

    public void testCustomSerializers_577() {
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

    public void testCustomSerializers_576() {
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

    public void testCustomSerializers_575() {
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

    public void testCustomSerializers_574() {
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

    public void testCustomSerializers_573() {
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

    public void testCustomSerializers_572() {
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

    public void testCustomSerializers_571() {
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

    public void testCustomSerializers_570() {
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

    public void testCustomSerializers_569() {
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

    public void testCustomSerializers_568() {
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

    public void testCustomSerializers_567() {
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

    public void testCustomSerializers_566() {
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

    public void testCustomSerializers_565() {
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

    public void testCustomSerializers_564() {
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

    public void testCustomSerializers_563() {
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

    public void testCustomSerializers_562() {
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

    public void testCustomSerializers_561() {
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

    public void testCustomSerializers_560() {
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

    public void testCustomSerializers_559() {
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

    public void testCustomSerializers_558() {
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

    public void testCustomSerializers_557() {
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

    public void testCustomSerializers_556() {
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

    public void testCustomSerializers_555() {
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

    public void testCustomSerializers_554() {
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

    public void testCustomSerializers_553() {
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

    public void testCustomSerializers_552() {
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

    public void testCustomSerializers_551() {
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

    public void testCustomSerializers_550() {
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

    public void testCustomSerializers_549() {
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

    public void testCustomSerializers_548() {
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

    public void testCustomSerializers_547() {
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

    public void testCustomSerializers_546() {
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

    public void testCustomSerializers_545() {
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

    public void testCustomSerializers_544() {
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

    public void testCustomSerializers_543() {
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

    public void testCustomSerializers_542() {
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

    public void testCustomSerializers_541() {
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

    public void testCustomSerializers_540() {
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

    public void testCustomSerializers_539() {
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

    public void testCustomSerializers_538() {
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

    public void testCustomSerializers_537() {
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

    public void testCustomSerializers_536() {
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

    public void testCustomSerializers_535() {
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

    public void testCustomSerializers_534() {
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

    public void testCustomSerializers_533() {
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

    public void testCustomSerializers_532() {
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

    public void testCustomSerializers_531() {
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

    public void testCustomSerializers_530() {
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

    public void testCustomSerializers_529() {
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

    public void testCustomSerializers_528() {
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

    public void testCustomSerializers_527() {
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

    public void testCustomSerializers_526() {
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

    public void testCustomSerializers_525() {
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

    public void testCustomSerializers_524() {
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

    public void testCustomSerializers_523() {
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

    public void testCustomSerializers_522() {
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

    public void testCustomSerializers_521() {
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

    public void testCustomSerializers_520() {
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

    public void testCustomSerializers_519() {
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

    public void testCustomSerializers_518() {
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

    public void testCustomSerializers_517() {
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

    public void testCustomSerializers_516() {
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

    public void testCustomSerializers_515() {
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

    public void testCustomSerializers_514() {
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

    public void testCustomSerializers_513() {
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

    public void testCustomSerializers_512() {
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

    public void testCustomSerializers_511() {
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

    public void testCustomSerializers_510() {
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

    public void testCustomSerializers_509() {
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

    public void testCustomSerializers_508() {
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

    public void testCustomSerializers_507() {
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

    public void testCustomSerializers_506() {
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

    public void testCustomSerializers_505() {
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

    public void testCustomSerializers_504() {
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

    public void testCustomSerializers_503() {
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

    public void testCustomSerializers_502() {
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

    public void testCustomSerializers_501() {
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

    public void testCustomSerializers_500() {
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

    public void testCustomSerializers_499() {
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

    public void testCustomSerializers_498() {
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

    public void testCustomSerializers_497() {
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

    public void testCustomSerializers_496() {
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

    public void testCustomSerializers_495() {
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

    public void testCustomSerializers_494() {
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

    public void testCustomSerializers_493() {
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

    public void testCustomSerializers_492() {
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

    public void testCustomSerializers_491() {
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

    public void testCustomSerializers_490() {
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

    public void testCustomSerializers_489() {
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

    public void testCustomSerializers_488() {
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

    public void testCustomSerializers_487() {
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

    public void testCustomSerializers_486() {
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

    public void testCustomSerializers_485() {
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

    public void testCustomSerializers_484() {
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

    public void testCustomSerializers_483() {
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

    public void testCustomSerializers_482() {
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

    public void testCustomSerializers_481() {
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

    public void testCustomSerializers_480() {
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

    public void testCustomSerializers_479() {
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

    public void testCustomSerializers_478() {
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

    public void testCustomSerializers_477() {
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

    public void testCustomSerializers_476() {
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

    public void testCustomSerializers_475() {
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

    public void testCustomSerializers_474() {
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

    public void testCustomSerializers_473() {
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

    public void testCustomSerializers_472() {
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

    public void testCustomSerializers_471() {
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

    public void testCustomSerializers_470() {
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

    public void testCustomSerializers_469() {
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

    public void testCustomSerializers_468() {
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

    public void testCustomSerializers_467() {
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

    public void testCustomSerializers_466() {
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

    public void testCustomSerializers_465() {
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

    public void testCustomSerializers_464() {
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

    public void testCustomSerializers_463() {
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

    public void testCustomSerializers_462() {
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

    public void testCustomSerializers_461() {
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

    public void testCustomSerializers_460() {
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

    public void testCustomSerializers_459() {
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

    public void testCustomSerializers_458() {
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

    public void testCustomSerializers_457() {
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

    public void testCustomSerializers_456() {
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

    public void testCustomSerializers_455() {
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

    public void testCustomSerializers_454() {
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

    public void testCustomSerializers_453() {
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

    public void testCustomSerializers_452() {
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

    public void testCustomSerializers_451() {
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

    public void testCustomSerializers_450() {
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

    public void testCustomSerializers_449() {
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

    public void testCustomSerializers_448() {
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

    public void testCustomSerializers_447() {
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

    public void testCustomSerializers_446() {
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

    public void testCustomSerializers_445() {
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

    public void testCustomSerializers_444() {
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

    public void testCustomSerializers_443() {
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

    public void testCustomSerializers_442() {
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

    public void testCustomSerializers_441() {
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

    public void testCustomSerializers_440() {
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

    public void testCustomSerializers_439() {
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

    public void testCustomSerializers_438() {
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

    public void testCustomSerializers_437() {
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

    public void testCustomSerializers_436() {
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

    public void testCustomSerializers_435() {
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

    public void testCustomSerializers_434() {
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

    public void testCustomSerializers_433() {
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

    public void testCustomSerializers_432() {
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

    public void testCustomSerializers_431() {
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

    public void testCustomSerializers_430() {
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

    public void testCustomSerializers_429() {
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

    public void testCustomSerializers_428() {
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

    public void testCustomSerializers_427() {
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

    public void testCustomSerializers_426() {
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

    public void testCustomSerializers_425() {
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

    public void testCustomSerializers_424() {
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

    public void testCustomSerializers_423() {
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

    public void testCustomSerializers_422() {
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

    public void testCustomSerializers_421() {
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

    public void testCustomSerializers_420() {
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

    public void testCustomSerializers_419() {
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

    public void testCustomSerializers_418() {
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

    public void testCustomSerializers_417() {
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

    public void testCustomSerializers_416() {
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

    public void testCustomSerializers_415() {
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

    public void testCustomSerializers_414() {
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

    public void testCustomSerializers_413() {
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

    public void testCustomSerializers_412() {
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

    public void testCustomSerializers_411() {
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

    public void testCustomSerializers_410() {
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

    public void testCustomSerializers_409() {
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

    public void testCustomSerializers_408() {
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

    public void testCustomSerializers_407() {
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

    public void testCustomSerializers_406() {
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

    public void testCustomSerializers_405() {
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

    public void testCustomSerializers_404() {
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

    public void testCustomSerializers_403() {
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

    public void testCustomSerializers_402() {
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

    public void testCustomSerializers_401() {
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

    public void testCustomSerializers_400() {
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

    public void testCustomSerializers_399() {
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

    public void testCustomSerializers_398() {
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

    public void testCustomSerializers_397() {
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

    public void testCustomSerializers_396() {
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

    public void testCustomSerializers_395() {
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

    public void testCustomSerializers_394() {
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

    public void testCustomSerializers_393() {
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

    public void testCustomSerializers_392() {
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

    public void testCustomSerializers_391() {
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

    public void testCustomSerializers_390() {
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

    public void testCustomSerializers_389() {
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

    public void testCustomSerializers_388() {
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

    public void testCustomSerializers_387() {
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

    public void testCustomSerializers_386() {
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

    public void testCustomSerializers_385() {
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

    public void testCustomSerializers_384() {
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

    public void testCustomSerializers_383() {
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

    public void testCustomSerializers_382() {
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

    public void testCustomSerializers_381() {
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

    public void testCustomSerializers_380() {
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

    public void testCustomSerializers_379() {
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

    public void testCustomSerializers_378() {
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

    public void testCustomSerializers_377() {
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

    public void testCustomSerializers_376() {
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

    public void testCustomSerializers_375() {
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

    public void testCustomSerializers_374() {
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

    public void testCustomSerializers_373() {
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

    public void testCustomSerializers_372() {
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

    public void testCustomSerializers_371() {
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

    public void testCustomSerializers_370() {
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

    public void testCustomSerializers_369() {
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

    public void testCustomSerializers_368() {
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

    public void testCustomSerializers_367() {
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

    public void testCustomSerializers_366() {
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

    public void testCustomSerializers_365() {
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

    public void testCustomSerializers_364() {
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

    public void testCustomSerializers_363() {
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

    public void testCustomSerializers_362() {
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

    public void testCustomSerializers_361() {
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

    public void testCustomSerializers_360() {
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

    public void testCustomSerializers_359() {
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

    public void testCustomSerializers_358() {
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

    public void testCustomSerializers_357() {
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

    public void testCustomSerializers_356() {
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

    public void testCustomSerializers_355() {
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

    public void testCustomSerializers_354() {
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

    public void testCustomSerializers_353() {
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

    public void testCustomSerializers_352() {
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

    public void testCustomSerializers_351() {
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

    public void testCustomSerializers_350() {
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

    public void testCustomSerializers_349() {
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

    public void testCustomSerializers_348() {
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

    public void testCustomSerializers_347() {
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

    public void testCustomSerializers_346() {
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

    public void testCustomSerializers_345() {
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

    public void testCustomSerializers_344() {
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

    public void testCustomSerializers_343() {
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

    public void testCustomSerializers_342() {
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

    public void testCustomSerializers_341() {
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

    public void testCustomSerializers_340() {
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

    public void testCustomSerializers_339() {
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

    public void testCustomSerializers_338() {
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

    public void testCustomSerializers_337() {
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

    public void testCustomSerializers_336() {
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

    public void testCustomSerializers_335() {
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

    public void testCustomSerializers_334() {
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

    public void testCustomSerializers_333() {
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

    public void testCustomSerializers_332() {
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

    public void testCustomSerializers_331() {
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

    public void testCustomSerializers_330() {
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

    public void testCustomSerializers_329() {
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

    public void testCustomSerializers_328() {
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

    public void testCustomSerializers_327() {
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

    public void testCustomSerializers_326() {
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

    public void testCustomSerializers_325() {
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

    public void testCustomSerializers_324() {
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

    public void testCustomSerializers_323() {
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

    public void testCustomSerializers_322() {
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

    public void testCustomSerializers_321() {
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

    public void testCustomSerializers_320() {
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

    public void testCustomSerializers_319() {
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

    public void testCustomSerializers_318() {
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

    public void testCustomSerializers_317() {
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

    public void testCustomSerializers_316() {
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

    public void testCustomSerializers_315() {
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

    public void testCustomSerializers_314() {
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

    public void testCustomSerializers_313() {
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

    public void testCustomSerializers_312() {
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

    public void testCustomSerializers_311() {
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

    public void testCustomSerializers_310() {
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

    public void testCustomSerializers_309() {
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

    public void testCustomSerializers_308() {
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

    public void testCustomSerializers_307() {
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

    public void testCustomSerializers_306() {
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

    public void testCustomSerializers_305() {
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

    public void testCustomSerializers_304() {
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

    public void testCustomSerializers_303() {
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

    public void testCustomSerializers_302() {
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

    public void testCustomSerializers_301() {
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

    public void testCustomSerializers_300() {
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

    public void testCustomSerializers_299() {
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

    public void testCustomSerializers_298() {
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

    public void testCustomSerializers_297() {
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

    public void testCustomSerializers_296() {
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

    public void testCustomSerializers_295() {
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

    public void testCustomSerializers_294() {
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

    public void testCustomSerializers_293() {
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

    public void testCustomSerializers_292() {
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

    public void testCustomSerializers_291() {
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

    public void testCustomSerializers_290() {
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

    public void testCustomSerializers_289() {
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

    public void testCustomSerializers_288() {
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

    public void testCustomSerializers_287() {
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

    public void testCustomSerializers_286() {
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

    public void testCustomSerializers_285() {
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

    public void testCustomSerializers_284() {
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

    public void testCustomSerializers_283() {
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

    public void testCustomSerializers_282() {
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

    public void testCustomSerializers_281() {
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

    public void testCustomSerializers_280() {
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

    public void testCustomSerializers_279() {
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

    public void testCustomSerializers_278() {
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

    public void testCustomSerializers_277() {
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

    public void testCustomSerializers_276() {
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

    public void testCustomSerializers_275() {
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

    public void testCustomSerializers_274() {
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

    public void testCustomSerializers_273() {
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

    public void testCustomSerializers_272() {
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

    public void testCustomSerializers_271() {
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

    public void testCustomSerializers_270() {
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

    public void testCustomSerializers_269() {
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

    public void testCustomSerializers_268() {
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

    public void testCustomSerializers_267() {
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

    public void testCustomSerializers_266() {
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

    public void testCustomSerializers_265() {
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

    public void testCustomSerializers_264() {
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

    public void testCustomSerializers_263() {
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

    public void testCustomSerializers_262() {
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

    public void testCustomSerializers_261() {
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

    public void testCustomSerializers_260() {
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

    public void testCustomSerializers_259() {
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

    public void testCustomSerializers_258() {
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

    public void testCustomSerializers_257() {
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

    public void testCustomSerializers_256() {
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

    public void testCustomSerializers_255() {
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

    public void testCustomSerializers_254() {
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

    public void testCustomSerializers_253() {
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

    public void testCustomSerializers_252() {
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

    public void testCustomSerializers_251() {
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

    public void testCustomSerializers_250() {
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

    public void testCustomSerializers_249() {
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

    public void testCustomSerializers_248() {
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

    public void testCustomSerializers_247() {
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

    public void testCustomSerializers_246() {
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

    public void testCustomSerializers_245() {
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

    public void testCustomSerializers_244() {
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

    public void testCustomSerializers_243() {
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

    public void testCustomSerializers_242() {
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

    public void testCustomSerializers_241() {
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

    public void testCustomSerializers_240() {
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

    public void testCustomSerializers_239() {
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

    public void testCustomSerializers_238() {
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

    public void testCustomSerializers_237() {
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

    public void testCustomSerializers_236() {
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

    public void testCustomSerializers_235() {
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

    public void testCustomSerializers_234() {
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

    public void testCustomSerializers_233() {
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

    public void testCustomSerializers_232() {
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

    public void testCustomSerializers_231() {
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

    public void testCustomSerializers_230() {
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

    public void testCustomSerializers_229() {
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

    public void testCustomSerializers_228() {
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

    public void testCustomSerializers_227() {
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

    public void testCustomSerializers_226() {
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

    public void testCustomSerializers_225() {
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

    public void testCustomSerializers_224() {
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

    public void testCustomSerializers_223() {
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

    public void testCustomSerializers_222() {
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

    public void testCustomSerializers_221() {
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

    public void testCustomSerializers_220() {
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

    public void testCustomSerializers_219() {
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

    public void testCustomSerializers_218() {
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

    public void testCustomSerializers_217() {
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

    public void testCustomSerializers_216() {
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

    public void testCustomSerializers_215() {
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

    public void testCustomSerializers_214() {
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

    public void testCustomSerializers_213() {
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

    public void testCustomSerializers_212() {
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

    public void testCustomSerializers_211() {
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

    public void testCustomSerializers_210() {
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

    public void testCustomSerializers_209() {
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

    public void testCustomSerializers_208() {
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

    public void testCustomSerializers_207() {
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

    public void testCustomSerializers_206() {
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

    public void testCustomSerializers_205() {
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

    public void testCustomSerializers_204() {
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

    public void testCustomSerializers_203() {
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

    public void testCustomSerializers_202() {
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

    public void testCustomSerializers_201() {
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

    public void testCustomSerializers_200() {
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

    public void testCustomSerializers_199() {
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

    public void testCustomSerializers_198() {
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

    public void testCustomSerializers_197() {
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

    public void testCustomSerializers_196() {
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

    public void testCustomSerializers_195() {
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

    public void testCustomSerializers_194() {
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

    public void testCustomSerializers_193() {
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

    public void testCustomSerializers_192() {
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

    public void testCustomSerializers_191() {
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

    public void testCustomSerializers_190() {
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

    public void testCustomSerializers_189() {
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

    public void testCustomSerializers_188() {
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

    public void testCustomSerializers_187() {
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

    public void testCustomSerializers_186() {
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

    public void testCustomSerializers_185() {
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

    public void testCustomSerializers_184() {
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

    public void testCustomSerializers_183() {
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

    public void testCustomSerializers_182() {
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

    public void testCustomSerializers_181() {
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

    public void testCustomSerializers_180() {
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

    public void testCustomSerializers_179() {
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

    public void testCustomSerializers_178() {
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

    public void testCustomSerializers_177() {
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

    public void testCustomSerializers_176() {
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

    public void testCustomSerializers_175() {
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

    public void testCustomSerializers_174() {
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

    public void testCustomSerializers_173() {
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

    public void testCustomSerializers_172() {
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

    public void testCustomSerializers_171() {
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

    public void testCustomSerializers_170() {
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

    public void testCustomSerializers_169() {
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

    public void testCustomSerializers_168() {
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

    public void testCustomSerializers_167() {
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

    public void testCustomSerializers_166() {
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

    public void testCustomSerializers_165() {
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

    public void testCustomSerializers_164() {
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

    public void testCustomSerializers_163() {
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

    public void testCustomSerializers_162() {
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

    public void testCustomSerializers_161() {
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

    public void testCustomSerializers_160() {
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

    public void testCustomSerializers_159() {
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

    public void testCustomSerializers_158() {
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

    public void testCustomSerializers_157() {
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

    public void testCustomSerializers_156() {
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

    public void testCustomSerializers_155() {
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

    public void testCustomSerializers_154() {
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

    public void testCustomSerializers_153() {
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

    public void testCustomSerializers_152() {
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

    public void testCustomSerializers_151() {
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

    public void testCustomSerializers_150() {
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

    public void testCustomSerializers_149() {
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

    public void testCustomSerializers_148() {
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

    public void testCustomSerializers_147() {
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

    public void testCustomSerializers_146() {
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

    public void testCustomSerializers_145() {
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

    public void testCustomSerializers_144() {
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

    public void testCustomSerializers_143() {
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

    public void testCustomSerializers_142() {
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

    public void testCustomSerializers_141() {
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

    public void testCustomSerializers_140() {
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

    public void testCustomSerializers_139() {
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

    public void testCustomSerializers_138() {
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

    public void testCustomSerializers_137() {
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

    public void testCustomSerializers_136() {
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

    public void testCustomSerializers_135() {
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

    public void testCustomSerializers_134() {
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

    public void testCustomSerializers_133() {
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

    public void testCustomSerializers_132() {
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

    public void testCustomSerializers_131() {
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

    public void testCustomSerializers_130() {
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

    public void testCustomSerializers_129() {
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

    public void testCustomSerializers_128() {
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

    public void testCustomSerializers_127() {
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

    public void testCustomSerializers_126() {
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

    public void testCustomSerializers_125() {
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

    public void testCustomSerializers_124() {
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

    public void testCustomSerializers_123() {
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

    public void testCustomSerializers_122() {
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

    public void testCustomSerializers_121() {
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

    public void testCustomSerializers_120() {
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

    public void testCustomSerializers_119() {
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

    public void testCustomSerializers_118() {
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

    public void testCustomSerializers_117() {
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

    public void testCustomSerializers_116() {
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

    public void testCustomSerializers_115() {
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

    public void testCustomSerializers_114() {
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

    public void testCustomSerializers_113() {
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

    public void testCustomSerializers_112() {
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

    public void testCustomSerializers_111() {
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

    public void testCustomSerializers_110() {
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

    public void testCustomSerializers_109() {
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

    public void testCustomSerializers_108() {
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

    public void testCustomSerializers_107() {
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

    public void testCustomSerializers_106() {
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

    public void testCustomSerializers_105() {
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

    public void testCustomSerializers_104() {
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

    public void testCustomSerializers_103() {
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

    public void testCustomSerializers_102() {
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

    public void testCustomSerializers_101() {
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

    public void testCustomSerializers_100() {
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
        com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo newFooObject = new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo(1, 2L);
        java.lang.String jsonFromCustomSerializer = gson.toJson(newFooObject);
        java.lang.String jsonFromGson = basicGson.toJson(newFooObject);
        junit.framework.Assert.assertEquals(jsonFromGson, jsonFromCustomSerializer);
    }

    public void disable_testCustomDeserializersOfSelf() {
        com.google.gson.Gson gson = createGsonObjectWithFooTypeAdapter();
        com.google.gson.Gson basicGson = new com.google.gson.Gson();
        com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo expectedFoo = new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo(1, 2L);
        java.lang.String json = basicGson.toJson(expectedFoo);
        com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo newFooObject = gson.fromJson(json, com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo.class);
        junit.framework.Assert.assertEquals(expectedFoo.key, newFooObject.key);
        junit.framework.Assert.assertEquals(expectedFoo.value, newFooObject.value);
    }

    private static class Base {
        int baseValue = 2;
    }

    private static class Derived extends com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Base {
        @java.lang.SuppressWarnings("unused")
        int derivedValue = 3;
    }

    private com.google.gson.Gson createGsonObjectWithFooTypeAdapter() {
        return new com.google.gson.GsonBuilder().registerTypeAdapter(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo.class, new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.FooTypeAdapter()).create();
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

    public static class FooTypeAdapter implements com.google.gson.JsonSerializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo> , com.google.gson.JsonDeserializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo> {
        public com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            return context.deserialize(json, typeOfT);
        }

        public com.google.gson.JsonElement serialize(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.Foo src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
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

    private static class StringHolderTypeAdapter implements com.google.gson.JsonSerializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.StringHolder> , com.google.gson.JsonDeserializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.StringHolder> , com.google.gson.InstanceCreator<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.StringHolder> {
        public com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.StringHolder createInstance(java.lang.reflect.Type type) {
            // Fill up with objects that will be thrown away
            return new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.StringHolder("unknown:thing");
        }

        public com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.StringHolder deserialize(com.google.gson.JsonElement src, java.lang.reflect.Type type, com.google.gson.JsonDeserializationContext context) {
            return new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.StringHolder(src.getAsString());
        }

        public com.google.gson.JsonElement serialize(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.StringHolder src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
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
        final com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.DataHolder wrappedData;

        public DataHolderWrapper(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.DataHolder data) {
            this.wrappedData = data;
        }
    }

    private static class DataHolderSerializer implements com.google.gson.JsonSerializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.DataHolder> {
        public com.google.gson.JsonElement serialize(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.DataHolder src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
            obj.addProperty("myData", src.data);
            return obj;
        }
    }

    private static class DataHolderDeserializer implements com.google.gson.JsonDeserializer<com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.DataHolder> {
        public com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.DataHolder deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            com.google.gson.JsonObject jsonObj = json.getAsJsonObject();
            com.google.gson.JsonElement jsonElement = jsonObj.get("data");
            if ((jsonElement == null) || jsonElement.isJsonNull()) {
                return new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.DataHolder(null);
            }
            return new com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.DataHolder(jsonElement.getAsString());
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.CustomTypeAdaptersTest_testCustomSerializers_1000.class) {}) {
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