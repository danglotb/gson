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
public class ParameterizedTypesTest_testParameterizedTypesSerialization_1000 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testParameterizedTypesSerialization_999() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_998() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_997() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_996() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_995() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_994() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_993() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_992() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_991() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_990() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_989() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_988() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_987() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_986() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_985() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_984() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_983() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_982() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_981() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_980() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_979() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_978() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_977() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_976() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_975() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_974() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_973() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_972() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_971() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_970() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_969() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_968() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_967() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_966() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_965() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_964() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_963() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_962() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_961() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_960() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_959() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_958() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_957() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_956() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_955() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_954() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_953() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_952() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_951() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_950() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_949() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_948() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_947() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_946() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_945() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_944() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_943() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_942() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_941() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_940() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_939() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_938() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_937() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_936() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_935() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_934() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_933() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_932() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_931() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_930() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_929() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_928() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_927() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_926() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_925() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_924() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_923() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_922() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_921() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_920() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_919() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_918() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_917() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_916() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_915() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_914() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_913() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_912() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_911() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_910() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_909() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_908() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_907() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_906() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_905() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_904() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_903() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_902() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_901() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_900() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_899() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_898() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_897() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_896() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_895() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_894() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_893() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_892() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_891() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_890() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_889() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_888() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_887() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_886() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_885() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_884() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_883() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_882() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_881() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_880() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_879() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_878() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_877() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_876() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_875() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_874() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_873() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_872() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_871() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_870() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_869() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_868() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_867() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_866() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_865() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_864() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_863() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_862() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_861() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_860() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_859() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_858() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_857() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_856() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_855() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_854() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_853() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_852() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_851() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_850() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_849() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_848() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_847() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_846() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_845() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_844() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_843() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_842() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_841() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_840() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_839() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_838() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_837() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_836() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_835() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_834() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_833() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_832() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_831() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_830() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_829() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_828() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_827() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_826() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_825() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_824() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_823() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_822() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_821() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_820() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_819() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_818() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_817() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_816() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_815() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_814() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_813() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_812() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_811() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_810() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_809() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_808() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_807() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_806() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_805() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_804() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_803() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_802() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_801() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_800() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_799() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_798() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_797() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_796() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_795() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_794() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_793() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_792() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_791() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_790() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_789() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_788() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_787() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_786() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_785() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_784() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_783() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_782() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_781() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_780() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_779() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_778() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_777() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_776() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_775() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_774() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_773() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_772() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_771() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_770() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_769() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_768() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_767() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_766() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_765() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_764() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_763() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_762() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_761() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_760() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_759() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_758() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_757() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_756() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_755() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_754() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_753() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_752() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_751() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_750() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_749() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_748() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_747() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_746() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_745() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_744() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_743() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_742() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_741() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_740() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_739() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_738() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_737() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_736() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_735() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_734() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_733() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_732() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_731() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_730() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_729() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_728() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_727() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_726() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_725() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_724() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_723() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_722() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_721() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_720() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_719() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_718() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_717() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_716() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_715() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_714() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_713() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_712() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_711() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_710() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_709() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_708() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_707() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_706() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_705() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_704() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_703() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_702() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_701() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_700() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_699() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_698() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_697() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_696() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_695() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_694() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_693() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_692() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_691() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_690() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_689() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_688() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_687() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_686() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_685() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_684() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_683() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_682() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_681() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_680() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_679() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_678() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_677() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_676() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_675() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_674() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_673() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_672() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_671() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_670() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_669() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_668() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_667() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_666() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_665() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_664() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_663() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_662() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_661() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_660() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_659() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_658() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_657() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_656() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_655() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_654() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_653() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_652() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_651() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_650() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_649() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_648() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_647() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_646() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_645() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_644() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_643() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_642() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_641() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_640() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_639() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_638() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_637() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_636() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_635() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_634() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_633() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_632() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_631() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_630() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_629() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_628() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_627() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_626() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_625() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_624() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_623() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_622() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_621() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_620() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_619() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_618() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_617() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_616() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_615() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_614() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_613() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_612() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_611() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_610() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_609() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_608() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_607() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_606() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_605() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_604() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_603() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_602() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_601() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_600() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_599() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_598() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_597() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_596() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_595() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_594() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_593() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_592() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_591() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_590() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_589() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_588() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_587() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_586() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_585() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_584() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_583() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_582() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_581() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_580() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_579() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_578() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_577() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_576() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_575() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_574() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_573() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_572() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_571() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_570() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_569() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_568() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_567() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_566() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_565() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_564() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_563() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_562() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_561() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_560() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_559() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_558() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_557() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_556() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_555() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_554() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_553() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_552() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_551() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_550() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_549() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_548() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_547() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_546() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_545() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_544() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_543() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_542() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_541() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_540() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_539() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_538() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_537() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_536() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_535() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_534() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_533() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_532() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_531() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_530() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_529() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_528() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_527() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_526() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_525() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_524() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_523() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_522() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_521() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_520() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_519() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_518() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_517() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_516() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_515() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_514() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_513() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_512() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_511() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_510() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_509() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_508() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_507() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_506() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_505() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_504() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_503() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_502() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_501() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_500() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_499() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_498() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_497() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_496() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_495() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_494() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_493() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_492() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_491() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_490() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_489() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_488() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_487() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_486() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_485() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_484() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_483() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_482() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_481() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_480() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_479() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_478() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_477() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_476() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_475() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_474() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_473() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_472() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_471() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_470() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_469() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_468() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_467() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_466() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_465() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_464() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_463() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_462() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_461() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_460() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_459() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_458() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_457() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_456() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_455() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_454() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_453() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_452() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_451() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_450() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_449() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_448() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_447() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_446() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_445() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_444() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_443() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_442() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_441() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_440() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_439() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_438() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_437() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_436() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_435() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_434() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_433() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_432() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_431() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_430() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_429() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_428() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_427() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_426() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_425() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_424() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_423() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_422() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_421() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_420() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_419() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_418() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_417() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_416() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_415() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_414() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_413() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_412() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_411() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_410() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_409() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_408() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_407() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_406() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_405() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_404() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_403() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_402() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_401() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_400() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_399() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_398() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_397() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_396() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_395() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_394() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_393() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_392() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_391() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_390() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_389() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_388() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_387() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_386() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_385() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_384() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_383() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_382() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_381() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_380() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_379() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_378() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_377() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_376() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_375() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_374() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_373() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_372() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_371() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_370() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_369() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_368() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_367() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_366() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_365() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_364() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_363() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_362() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_361() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_360() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_359() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_358() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_357() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_356() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_355() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_354() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_353() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_352() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_351() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_350() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_349() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_348() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_347() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_346() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_345() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_344() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_343() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_342() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_341() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_340() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_339() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_338() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_337() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_336() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_335() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_334() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_333() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_332() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_331() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_330() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_329() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_328() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_327() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_326() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_325() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_324() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_323() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_322() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_321() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_320() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_319() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_318() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_317() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_316() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_315() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_314() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_313() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_312() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_311() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_310() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_309() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_308() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_307() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_306() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_305() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_304() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_303() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_302() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_301() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_300() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_299() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_298() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_297() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_296() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_295() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_294() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_293() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_292() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_291() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_290() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_289() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_288() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_287() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_286() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_285() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_284() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_283() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_282() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_281() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_280() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_279() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_278() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_277() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_276() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_275() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_274() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_273() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_272() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_271() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_270() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_269() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_268() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_267() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_266() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_265() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_264() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_263() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_262() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_261() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_260() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_259() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_258() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_257() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_256() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_255() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_254() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_253() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_252() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_251() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_250() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_249() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_248() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_247() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_246() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_245() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_244() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_243() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_242() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_241() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_240() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_239() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_238() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_237() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_236() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_235() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_234() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_233() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_232() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_231() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_230() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_229() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_228() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_227() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_226() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_225() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_224() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_223() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_222() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_221() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_220() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_219() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_218() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_217() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_216() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_215() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_214() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_213() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_212() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_211() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_210() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_209() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_208() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_207() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_206() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_205() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_204() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_203() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_202() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_201() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_200() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_199() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_198() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_197() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_196() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_195() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_194() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_193() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_192() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_191() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_190() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_189() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_188() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_187() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_186() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_185() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_184() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_183() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_182() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_181() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_180() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_179() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_178() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_177() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_176() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_175() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_174() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_173() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_172() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_171() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_170() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_169() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_168() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_167() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_166() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_165() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_164() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_163() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_162() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_161() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_160() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_159() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_158() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_157() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_156() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_155() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_154() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_153() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_152() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_151() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_150() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_149() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_148() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_147() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_146() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_145() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_144() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_143() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_142() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_141() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_140() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_139() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_138() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_137() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_136() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_135() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_134() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_133() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_132() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_131() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_130() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_129() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_128() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_127() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_126() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_125() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_124() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_123() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_122() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_121() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_120() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_119() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_118() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_117() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_116() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_115() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_114() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_113() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_112() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_111() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_110() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_109() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_108() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_107() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_106() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_105() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_104() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_103() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_102() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_101() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
    }

    public void testParameterizedTypesSerialization_100() throws java.lang.Exception {
        com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer> src = new com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>(10);
        java.lang.reflect.Type typeOfSrc = new com.google.gson.reflect.TypeToken<com.google.gson.ParamterizedTypeFixtures.MyParameterizedType<java.lang.Integer>>() {}.getType();
        java.lang.String json = gson.toJson(src, typeOfSrc);
        junit.framework.Assert.assertEquals(src.getExpectedJson(), json);
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
            com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.MultiParameters<A, B, C, D, E> other = ((com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.MultiParameters<A, B, C, D, E>) (obj));
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

    private static class MyQuantity extends com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.Quantity {
        @java.lang.SuppressWarnings("unused")
        int q2 = 20;
    }

    private interface Measurable<T> {}

    private interface Field<T> {}

    private interface Immutable {}

    public static final class Amount<Q extends com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.Quantity> implements com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.Measurable<Q> , com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.Field<com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.Amount<?>> , java.io.Serializable , com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.Immutable {
        private static final long serialVersionUID = -7560491093120970437L;

        int value = 30;
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ParameterizedTypesTest_testParameterizedTypesSerialization_1000.class) {}) {
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