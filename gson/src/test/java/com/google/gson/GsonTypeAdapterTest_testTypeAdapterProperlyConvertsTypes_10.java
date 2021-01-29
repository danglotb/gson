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
 * Contains numerous tests involving registered type converters with a Gson instance.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().registerTypeAdapter(java.util.concurrent.atomic.AtomicLong.class, new com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_10.ExceptionTypeAdapter()).registerTypeAdapter(java.util.concurrent.atomic.AtomicInteger.class, new com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_10.AtomicIntegerTypeAdapter()).create();
    }

    public void testTypeAdapterProperlyConvertsTypes_9() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_8() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_7() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_6() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_5() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_4() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_3() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_2() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_1() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes_0() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    public void testTypeAdapterProperlyConvertsTypes() throws java.lang.Exception {
        int intialValue = 1;
        java.util.concurrent.atomic.AtomicInteger atomicInt = new java.util.concurrent.atomic.AtomicInteger(intialValue);
        java.lang.String json = gson.toJson(atomicInt);
        junit.framework.Assert.assertEquals(intialValue + 1, java.lang.Integer.parseInt(json));
        atomicInt = gson.fromJson(json, java.util.concurrent.atomic.AtomicInteger.class);
        junit.framework.Assert.assertEquals(intialValue, atomicInt.get());
    }

    private static class ExceptionTypeAdapter implements com.google.gson.JsonSerializer<java.util.concurrent.atomic.AtomicLong> , com.google.gson.JsonDeserializer<java.util.concurrent.atomic.AtomicLong> {
        public com.google.gson.JsonElement serialize(java.util.concurrent.atomic.AtomicLong src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            throw new java.lang.IllegalStateException();
        }

        public java.util.concurrent.atomic.AtomicLong deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            throw new java.lang.IllegalStateException();
        }
    }

    private static class AtomicIntegerTypeAdapter implements com.google.gson.JsonSerializer<java.util.concurrent.atomic.AtomicInteger> , com.google.gson.JsonDeserializer<java.util.concurrent.atomic.AtomicInteger> {
        public com.google.gson.JsonElement serialize(java.util.concurrent.atomic.AtomicInteger src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            return new com.google.gson.JsonPrimitive(src.incrementAndGet());
        }

        public java.util.concurrent.atomic.AtomicInteger deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            int intValue = json.getAsInt();
            return new java.util.concurrent.atomic.AtomicInteger(--intValue);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.GsonTypeAdapterTest_testTypeAdapterProperlyConvertsTypes_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.GsonTypeAdapterTest", "testTypeAdapterProperlyConvertsTypes");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}