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
 * Functional tests for the serialization and deserialization of parameterized types in Gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
// End: tests to reproduce issue 103
public class ParameterizedTypesTest_testParameterizedTypesSerialization_100 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testParameterizedTypesSerialization_99() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_98() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_97() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_96() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_95() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_94() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_93() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_92() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_91() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_90() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_89() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_88() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_87() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_86() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_85() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_84() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_83() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_82() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_81() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_80() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_79() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_78() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_77() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_76() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_75() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_74() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_73() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_72() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_71() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_70() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_69() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_68() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_67() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_66() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_65() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_64() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_63() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_62() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_61() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_60() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_59() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_58() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_57() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_56() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_55() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_54() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_53() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_52() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_51() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_50() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_49() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_48() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_47() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_46() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_45() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_44() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_43() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_42() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_41() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_40() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_39() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_38() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_37() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_36() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_35() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_34() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_33() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_32() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_31() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_30() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_29() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_28() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_27() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_26() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_25() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_24() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_23() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_22() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_21() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_20() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_19() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_18() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_17() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_16() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_15() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_14() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_13() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_12() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_11() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_10() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_9() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_8() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_7() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_6() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_5() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_4() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_3() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_2() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_1() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_0() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    /**
     * An test object that has fields that are type variables.
     *
     * @param <T>
     * 		Enforce T to be a string to make writing the "toExpectedJson" method easier.
     */
    private static class ObjectWithTypeVariables<T extends java.lang.Number> {
        private final T typeParameterObj;

        private final T[] typeParameterArray;

        private final java.util.List<T> listOfTypeParameters;

        private final java.util.List<T>[] arrayOfListOfTypeParameters;

        private final java.util.List<? extends T> listOfWildcardTypeParameters;

        private final java.util.List<? extends T>[] arrayOfListOfWildcardTypeParameters;

        // For use by Gson
        @java.lang.SuppressWarnings("unused")
        private ObjectWithTypeVariables() {
            this(null, null, null, null, null, null);
        }

        public ObjectWithTypeVariables(T obj, T[] array, java.util.List<T> list, java.util.List<T>[] arrayOfList, java.util.List<? extends T> wildcardList, java.util.List<? extends T>[] arrayOfWildcardList) {
            this.typeParameterObj = obj;
            this.typeParameterArray = array;
            this.listOfTypeParameters = list;
            this.arrayOfListOfTypeParameters = arrayOfList;
            this.listOfWildcardTypeParameters = wildcardList;
            this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
        }

        public java.lang.String getExpectedJson() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder().append("{");
            boolean needsComma = false;
            if (typeParameterObj != null) {
                sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
                needsComma = true;
            }
            if (typeParameterArray != null) {
                if (needsComma) {
                    sb.append(',');
                }
                sb.append("\"typeParameterArray\":[");
                appendObjectsToBuilder(sb, java.util.Arrays.asList(typeParameterArray));
                sb.append(']');
                needsComma = true;
            }
            if (listOfTypeParameters != null) {
                if (needsComma) {
                    sb.append(',');
                }
                sb.append("\"listOfTypeParameters\":[");
                appendObjectsToBuilder(sb, listOfTypeParameters);
                sb.append(']');
                needsComma = true;
            }
            if (arrayOfListOfTypeParameters != null) {
                if (needsComma) {
                    sb.append(',');
                }
                sb.append("\"arrayOfListOfTypeParameters\":[");
                appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
                sb.append(']');
                needsComma = true;
            }
            if (listOfWildcardTypeParameters != null) {
                if (needsComma) {
                    sb.append(',');
                }
                sb.append("\"listOfWildcardTypeParameters\":[");
                appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
                sb.append(']');
                needsComma = true;
            }
            if (arrayOfListOfWildcardTypeParameters != null) {
                if (needsComma) {
                    sb.append(',');
                }
                sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
                appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
                sb.append(']');
                needsComma = true;
            }
            sb.append('}');
            return sb.toString();
        }

        private void appendObjectsToBuilder(java.lang.StringBuilder sb, java.lang.Iterable<? extends T> iterable) {
            boolean isFirst = true;
            for (T obj : iterable) {
                if (!isFirst) {
                    sb.append(',');
                }
                isFirst = false;
                sb.append(toString(obj));
            }
        }

        private void appendObjectsToBuilder(java.lang.StringBuilder sb, java.util.List<? extends T>[] arrayOfList) {
            boolean isFirst = true;
            for (java.util.List<? extends T> list : arrayOfList) {
                if (!isFirst) {
                    sb.append(',');
                }
                isFirst = false;
                if (list != null) {
                    sb.append('[');
                    appendObjectsToBuilder(sb, list);
                    sb.append(']');
                } else {
                    sb.append("null");
                }
            }
        }

        public java.lang.String toString(T obj) {
            return obj.toString();
        }
    }

    private static class MultiParameters<A, B, C, D, E> {
        A a;

        B b;

        C c;

        D d;

        E e;

        // For use by Gson
        @java.lang.SuppressWarnings("unused")
        private MultiParameters() {
        }

        MultiParameters(A a, B b, C c, D d, E e) {
            super();
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }

        @java.lang.Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = (prime * result) + (a == null ? 0 : a.hashCode());
            result = (prime * result) + (b == null ? 0 : b.hashCode());
            result = (prime * result) + (c == null ? 0 : c.hashCode());
            result = (prime * result) + (d == null ? 0 : d.hashCode());
            result = (prime * result) + (e == null ? 0 : e.hashCode());
            return result;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.MultiParameters<A, B, C, D, E> other = ((com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.MultiParameters<A, B, C, D, E>) (obj));
            if (a == null) {
                if (other.a != null) {
                    return false;
                }
            } else if (!a.equals(other.a)) {
                return false;
            }
            if (b == null) {
                if (other.b != null) {
                    return false;
                }
            } else if (!b.equals(other.b)) {
                return false;
            }
            if (c == null) {
                if (other.c != null) {
                    return false;
                }
            } else if (!c.equals(other.c)) {
                return false;
            }
            if (d == null) {
                if (other.d != null) {
                    return false;
                }
            } else if (!d.equals(other.d)) {
                return false;
            }
            if (e == null) {
                if (other.e != null) {
                    return false;
                }
            } else if (!e.equals(other.e)) {
                return false;
            }
            return true;
        }
    }

    // Begin: tests to reproduce issue 103
    private static class Quantity {
        @java.lang.SuppressWarnings("unused")
        int q = 10;
    }

    private static class MyQuantity extends com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.Quantity {
        @java.lang.SuppressWarnings("unused")
        int q2 = 20;
    }

    private interface Measurable<T> {}

    private interface Field<T> {}

    private interface Immutable {}

    public static final class Amount<Q extends com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.Quantity> implements com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.Measurable<Q> , com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.Field<com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.Amount<?>> , java.io.Serializable , com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.Immutable {
        private static final long serialVersionUID = -7560491093120970437L;

        int value = 30;
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.ParameterizedTypesTest", "testParameterizedTypesSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}