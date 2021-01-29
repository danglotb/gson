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
public class RawSerializationTest_testTwoLevelParameterizedObject_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testTwoLevelParameterizedObject_9() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_8() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_7() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_6() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_5() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_4() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_3() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_2() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_1() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject_0() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
        junit.framework.Assert.assertEquals(expectedJson, json);
    }

    public void testTwoLevelParameterizedObject() {
        com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>> bar = new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>(new com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo(1)));
        java.lang.String expectedJson = "{\"t\":{\"t\":{\"b\":1}}}";
        // Ensure that serialization works without specifying the type explicitly
        java.lang.String json = gson.toJson(bar);
        junit.framework.Assert.assertEquals(expectedJson, json);
        // Ensure that serialization also works when the type is specified explicitly
        json = gson.toJson(bar, new com.google.gson.reflect.TypeToken<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Bar<com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.Foo>>>() {}.getType());
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
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.RawSerializationTest_testTwoLevelParameterizedObject_10.class) {}) {
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