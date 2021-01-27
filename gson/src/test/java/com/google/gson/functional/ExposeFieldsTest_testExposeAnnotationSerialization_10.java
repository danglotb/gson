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
 * Unit tests for the regarding functional "@Expose" type tests.
 *
 * @author Joel Leitch
 */
public class ExposeFieldsTest_testExposeAnnotationSerialization_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.GsonBuilder().excludeFieldsWithoutExposeAnnotation().registerTypeAdapter(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.SomeInterface.class, new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.SomeInterfaceInstanceCreator()).create();
    }

    public void testExposeAnnotationSerialization_9() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_8() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_7() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_6() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_5() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_4() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_3() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_2() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_1() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization_0() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testExposeAnnotationSerialization() throws java.lang.Exception {
        com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields target = new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.ClassWithExposedFields(1, 2);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    @java.lang.SuppressWarnings("unused")
    private static class ClassWithExposedFields {
        @com.google.gson.annotations.Expose
        private final java.lang.Integer a;

        private final java.lang.Integer b;

        @com.google.gson.annotations.Expose(serialize = false)
        final long c;

        @com.google.gson.annotations.Expose(deserialize = false)
        final double d;

        @com.google.gson.annotations.Expose(serialize = false, deserialize = false)
        final char e;

        public ClassWithExposedFields(java.lang.Integer a, java.lang.Integer b) {
            this(a, b, 1L, 2.0, 'a');
        }

        public ClassWithExposedFields(java.lang.Integer a, java.lang.Integer b, long c, double d, char e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }

        public java.lang.String getExpectedJson() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
            if (a != null) {
                sb.append("\"a\":").append(a).append(",");
            }
            sb.append("\"d\":").append(d);
            sb.append("}");
            return sb.toString();
        }
    }

    private static class ClassWithNoExposedFields {
        private final int a = 0;

        private final int b = 1;
    }

    // Empty interface
    private static interface SomeInterface {}

    // Do nothing
    private static class SomeObject implements com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.SomeInterface {}

    private static class SomeInterfaceInstanceCreator implements com.google.gson.InstanceCreator<com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.SomeInterface> {
        public com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.SomeInterface createInstance(java.lang.reflect.Type type) {
            return new com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.SomeObject();
        }
    }

    private static class ClassWithInterfaceField {
        @com.google.gson.annotations.Expose
        private final com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.SomeInterface interfaceField;

        public ClassWithInterfaceField(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.SomeInterface interfaceField) {
            this.interfaceField = interfaceField;
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ExposeFieldsTest_testExposeAnnotationSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.ExposeFieldsTest", "testExposeAnnotationSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}