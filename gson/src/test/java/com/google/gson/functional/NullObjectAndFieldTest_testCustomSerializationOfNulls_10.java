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
 * Functional tests for the different cases for serializing (or ignoring) null fields and object.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NullObjectAndFieldTest_testCustomSerializationOfNulls_10 extends junit.framework.TestCase {
    private com.google.gson.GsonBuilder gsonBuilder;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gsonBuilder = new com.google.gson.GsonBuilder().serializeNulls();
    }

    public void testCustomSerializationOfNulls_9() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_8() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_7() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_6() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_5() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_4() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_3() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_2() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_1() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_0() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    private static class ClassWithNullWrappedPrimitive {
        private java.lang.Long value;
    }

    @java.lang.SuppressWarnings("unused")
    private static class ClassWithMembers {
        java.lang.String str;

        int[] array;

        java.util.Collection<java.lang.String> col;
    }

    private static class ClassWithObjectsSerializer implements com.google.gson.JsonSerializer<com.google.gson.common.TestTypes.ClassWithObjects> {
        public com.google.gson.JsonElement serialize(com.google.gson.common.TestTypes.ClassWithObjects src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
            obj.add("bag", com.google.gson.JsonNull.INSTANCE);
            return obj;
        }
    }

    private static class ObjectWithField {
        java.lang.String value = "";
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.NullObjectAndFieldTest", "testCustomSerializationOfNulls");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}