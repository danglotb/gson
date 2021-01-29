/* Copyright (C) 2010 Google Inc.

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
 * Unit tests to validate serialization of parameterized types without explicit types
 *
 * @author Inderjeet Singh
 */
public class RawSerializationTest_testTwoLevelParameterizedObject_100 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testTwoLevelParameterizedObject_99() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_98() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_97() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_96() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_95() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_94() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_93() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_92() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_91() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_90() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_89() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_88() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_87() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_86() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_85() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_84() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_83() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_82() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_81() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_80() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_79() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_78() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_77() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_76() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_75() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_74() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_73() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_72() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_71() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_70() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_69() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_68() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_67() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_66() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_65() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_64() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_63() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_62() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_61() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_60() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_59() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_58() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_57() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_56() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_55() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_54() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_53() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_52() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_51() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_50() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_49() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_48() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_47() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_46() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_45() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_44() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_43() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_42() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_41() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_40() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_39() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_38() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_37() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_36() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_35() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_34() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_33() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_32() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_31() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_30() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_29() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_28() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_27() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_26() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_25() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_24() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_23() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_22() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_21() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_20() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_19() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_18() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_17() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_16() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_15() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_14() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_13() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_12() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_11() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_10() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_9() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_8() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_7() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_6() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_5() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_4() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_3() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_2() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_1() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_0() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    private static class Foo {
        @java.lang.SuppressWarnings("unused")
        int b;

        Foo(int b) {
            this.b = b;
        }
    }

    private static class Bar<T> {
        @java.lang.SuppressWarnings("unused")
        T t;

        Bar(T t) {
            this.t = t;
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_100.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.RawSerializationTest", "testTwoLevelParameterizedObject");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}