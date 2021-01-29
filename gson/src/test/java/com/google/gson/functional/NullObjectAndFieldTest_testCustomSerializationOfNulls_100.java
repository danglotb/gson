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
public class NullObjectAndFieldTest_testCustomSerializationOfNulls_100 extends junit.framework.TestCase {
    private com.google.gson.GsonBuilder gsonBuilder;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gsonBuilder = new com.google.gson.GsonBuilder().serializeNulls();
    }

    public void testCustomSerializationOfNulls_99() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_98() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_97() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_96() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_95() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_94() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_93() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_92() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_91() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_90() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_89() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_88() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_87() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_86() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_85() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_84() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_83() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_82() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_81() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_80() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_79() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_78() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_77() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_76() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_75() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_74() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_73() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_72() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_71() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_70() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_69() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_68() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_67() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_66() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_65() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_64() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_63() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_62() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_61() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_60() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_59() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_58() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_57() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_56() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_55() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_54() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_53() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_52() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_51() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_50() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_49() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_48() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_47() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_46() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_45() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_44() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_43() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_42() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_41() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_40() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_39() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_38() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_37() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_36() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_35() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_34() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_33() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_32() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_31() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_30() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_29() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_28() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_27() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_26() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_25() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_24() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_23() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_22() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_21() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_20() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_19() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_18() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_17() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_16() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_15() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_14() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_13() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_12() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_11() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_10() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_9() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_8() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_7() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_6() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_5() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_4() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_3() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_2() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_1() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls_0() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
        com.google.gson.Gson gson = gsonBuilder.create();
        com.google.gson.common.TestTypes.ClassWithObjects target = new com.google.gson.common.TestTypes.ClassWithObjects(new com.google.gson.common.TestTypes.BagOfPrimitives());
        java.lang.String actual = gson.toJson(target);
        java.lang.String expected = "{\"bag\":null}";
        junit.framework.Assert.assertEquals(expected, actual);
    }

    public void testCustomSerializationOfNulls() {
        gsonBuilder.registerTypeAdapter(com.google.gson.common.TestTypes.ClassWithObjects.class, new com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.ClassWithObjectsSerializer());
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.NullObjectAndFieldTest_testCustomSerializationOfNulls_100.class) {}) {
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