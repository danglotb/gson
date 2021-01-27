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
public class NullObjectAndFieldTest_testCustomSerializationOfNulls_1000 extends junit.framework.TestCase {
    private com.google.gson.GsonBuilder gsonBuilder;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gsonBuilder = new com.google.gson.GsonBuilder().serializeNulls();
    }

    public void testCustomSerializationOfNulls_999() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_998() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_997() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_996() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_995() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_994() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_993() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_992() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_991() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_990() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_989() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_988() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_987() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_986() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_985() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_984() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_983() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_982() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_981() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_980() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_979() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_978() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_977() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_976() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_975() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_974() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_973() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_972() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_971() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_970() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_969() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_968() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_967() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_966() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_965() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_964() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_963() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_962() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_961() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_960() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_959() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_958() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_957() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_956() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_955() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_954() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_953() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_952() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_951() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_950() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_949() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_948() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_947() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_946() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_945() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_944() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_943() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_942() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_941() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_940() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_939() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_938() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_937() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_936() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_935() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_934() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_933() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_932() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_931() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_930() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_929() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_928() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_927() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_926() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_925() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_924() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_923() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_922() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_921() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_920() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_919() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_918() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_917() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_916() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_915() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_914() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_913() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_912() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_911() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_910() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_909() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_908() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_907() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_906() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_905() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_904() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_903() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_902() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_901() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_900() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_899() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_898() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_897() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_896() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_895() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_894() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_893() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_892() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_891() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_890() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_889() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_888() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_887() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_886() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_885() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_884() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_883() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_882() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_881() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_880() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_879() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_878() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_877() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_876() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_875() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_874() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_873() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_872() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_871() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_870() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_869() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_868() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_867() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_866() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_865() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_864() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_863() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_862() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_861() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_860() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_859() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_858() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_857() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_856() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_855() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_854() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_853() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_852() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_851() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_850() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_849() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_848() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_847() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_846() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_845() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_844() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_843() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_842() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_841() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_840() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_839() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_838() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_837() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_836() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_835() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_834() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_833() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_832() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_831() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_830() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_829() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_828() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_827() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_826() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_825() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_824() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_823() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_822() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_821() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_820() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_819() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_818() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_817() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_816() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_815() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_814() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_813() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_812() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_811() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_810() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_809() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_808() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_807() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_806() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_805() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_804() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_803() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_802() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_801() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_800() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_799() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_798() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_797() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_796() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_795() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_794() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_793() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_792() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_791() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_790() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_789() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_788() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_787() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_786() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_785() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_784() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_783() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_782() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_781() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_780() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_779() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_778() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_777() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_776() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_775() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_774() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_773() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_772() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_771() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_770() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_769() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_768() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_767() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_766() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_765() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_764() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_763() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_762() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_761() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_760() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_759() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_758() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_757() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_756() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_755() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_754() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_753() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_752() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_751() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_750() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_749() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_748() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_747() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_746() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_745() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_744() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_743() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_742() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_741() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_740() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_739() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_738() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_737() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_736() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_735() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_734() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_733() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_732() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_731() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_730() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_729() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_728() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_727() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_726() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_725() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_724() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_723() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_722() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_721() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_720() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_719() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_718() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_717() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_716() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_715() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_714() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_713() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_712() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_711() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_710() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_709() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_708() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_707() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_706() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_705() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_704() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_703() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_702() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_701() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_700() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_699() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_698() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_697() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_696() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_695() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_694() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_693() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_692() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_691() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_690() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_689() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_688() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_687() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_686() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_685() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_684() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_683() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_682() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_681() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_680() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_679() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_678() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_677() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_676() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_675() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_674() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_673() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_672() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_671() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_670() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_669() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_668() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_667() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_666() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_665() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_664() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_663() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_662() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_661() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_660() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_659() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_658() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_657() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_656() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_655() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_654() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_653() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_652() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_651() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_650() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_649() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_648() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_647() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_646() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_645() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_644() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_643() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_642() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_641() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_640() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_639() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_638() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_637() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_636() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_635() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_634() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_633() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_632() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_631() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_630() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_629() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_628() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_627() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_626() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_625() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_624() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_623() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_622() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_621() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_620() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_619() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_618() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_617() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_616() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_615() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_614() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_613() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_612() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_611() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_610() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_609() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_608() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_607() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_606() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_605() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_604() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_603() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_602() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_601() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_600() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_599() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_598() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_597() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_596() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_595() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_594() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_593() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_592() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_591() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_590() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_589() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_588() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_587() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_586() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_585() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_584() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_583() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_582() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_581() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_580() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_579() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_578() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_577() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_576() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_575() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_574() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_573() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_572() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_571() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_570() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_569() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_568() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_567() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_566() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_565() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_564() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_563() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_562() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_561() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_560() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_559() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_558() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_557() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_556() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_555() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_554() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_553() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_552() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_551() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_550() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_549() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_548() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_547() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_546() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_545() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_544() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_543() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_542() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_541() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_540() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_539() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_538() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_537() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_536() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_535() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_534() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_533() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_532() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_531() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_530() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_529() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_528() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_527() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_526() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_525() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_524() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_523() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_522() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_521() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_520() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_519() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_518() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_517() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_516() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_515() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_514() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_513() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_512() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_511() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_510() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_509() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_508() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_507() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_506() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_505() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_504() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_503() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_502() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_501() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_500() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_499() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_498() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_497() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_496() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_495() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_494() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_493() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_492() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_491() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_490() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_489() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_488() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_487() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_486() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_485() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_484() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_483() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_482() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_481() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_480() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_479() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_478() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_477() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_476() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_475() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_474() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_473() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_472() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_471() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_470() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_469() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_468() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_467() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_466() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_465() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_464() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_463() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_462() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_461() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_460() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_459() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_458() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_457() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_456() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_455() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_454() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_453() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_452() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_451() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_450() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_449() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_448() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_447() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_446() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_445() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_444() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_443() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_442() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_441() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_440() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_439() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_438() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_437() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_436() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_435() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_434() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_433() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_432() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_431() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_430() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_429() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_428() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_427() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_426() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_425() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_424() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_423() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_422() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_421() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_420() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_419() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_418() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_417() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_416() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_415() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_414() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_413() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_412() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_411() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_410() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_409() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_408() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_407() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_406() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_405() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_404() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_403() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_402() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_401() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_400() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_399() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_398() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_397() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_396() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_395() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_394() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_393() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_392() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_391() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_390() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_389() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_388() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_387() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_386() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_385() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_384() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_383() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_382() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_381() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_380() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_379() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_378() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_377() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_376() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_375() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_374() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_373() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_372() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_371() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_370() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_369() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_368() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_367() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_366() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_365() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_364() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_363() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_362() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_361() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_360() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_359() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_358() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_357() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_356() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_355() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_354() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_353() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_352() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_351() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_350() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_349() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_348() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_347() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_346() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_345() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_344() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_343() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_342() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_341() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_340() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_339() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_338() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_337() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_336() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_335() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_334() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_333() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_332() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_331() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_330() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_329() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_328() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_327() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_326() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_325() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_324() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_323() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_322() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_321() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_320() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_319() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_318() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_317() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_316() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_315() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_314() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_313() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_312() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_311() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_310() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_309() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_308() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_307() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_306() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_305() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_304() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_303() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_302() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_301() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_300() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_299() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_298() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_297() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_296() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_295() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_294() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_293() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_292() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_291() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_290() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_289() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_288() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_287() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_286() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_285() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_284() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_283() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_282() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_281() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_280() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_279() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_278() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_277() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_276() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_275() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_274() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_273() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_272() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_271() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_270() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_269() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_268() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_267() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_266() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_265() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_264() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_263() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_262() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_261() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_260() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_259() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_258() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_257() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_256() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_255() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_254() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_253() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_252() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_251() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_250() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_249() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_248() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_247() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_246() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_245() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_244() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_243() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_242() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_241() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_240() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_239() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_238() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_237() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_236() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_235() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_234() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_233() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_232() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_231() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_230() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_229() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_228() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_227() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_226() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_225() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_224() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_223() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_222() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_221() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_220() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_219() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_218() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_217() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_216() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_215() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_214() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_213() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_212() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_211() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_210() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_209() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_208() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_207() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_206() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_205() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_204() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_203() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_202() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_201() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_200() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_199() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_198() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_197() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_196() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_195() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_194() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_193() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_192() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_191() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_190() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_189() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_188() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_187() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_186() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_185() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_184() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_183() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_182() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_181() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_180() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_179() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_178() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_177() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_176() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_175() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_174() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_173() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_172() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_171() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_170() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_169() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_168() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_167() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_166() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_165() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_164() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_163() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_162() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_161() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_160() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_159() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_158() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_157() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_156() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_155() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_154() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_153() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_152() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_151() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_150() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_149() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_148() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_147() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_146() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_145() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_144() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_143() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_142() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_141() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_140() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_139() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_138() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_137() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_136() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_135() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_134() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_133() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_132() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_131() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_130() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_129() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_128() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_127() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_126() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_125() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_124() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_123() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_122() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_121() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_120() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_119() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_118() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_117() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_116() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_115() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_114() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_113() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_112() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_111() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_110() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_109() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_108() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_107() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_106() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_105() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_104() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_103() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_102() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_101() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_100() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_99() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_98() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_97() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_96() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_95() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_94() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_93() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_92() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_91() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_90() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_89() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_88() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_87() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_86() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_85() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_84() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_83() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_82() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_81() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_80() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_79() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_78() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_77() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_76() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_75() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_74() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_73() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_72() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_71() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_70() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_69() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_68() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_67() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_66() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_65() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_64() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_63() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_62() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_61() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_60() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_59() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_58() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_57() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_56() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_55() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_54() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_53() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_52() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_51() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_50() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_49() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_48() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_47() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_46() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_45() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_44() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_43() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_42() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_41() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_40() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_39() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_38() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_37() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_36() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_35() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_34() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_33() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_32() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_31() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_30() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_29() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_28() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_27() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_26() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_25() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_24() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_23() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_22() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_21() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_20() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_19() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_18() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_17() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_16() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_15() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_14() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_13() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_12() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_11() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_10() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_9() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_8() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_7() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_6() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_5() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_4() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_3() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_2() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_1() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_0() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.ClassWithObjectsSerializer());
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_1000.class) {}) {
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