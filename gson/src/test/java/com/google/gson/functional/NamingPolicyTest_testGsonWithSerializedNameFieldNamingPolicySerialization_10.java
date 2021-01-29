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
 * Functional tests for naming policies.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NamingPolicyTest_testGsonWithSerializedNameFieldNamingPolicySerialization_10 extends junit.framework.TestCase {
    private com.google.gson.GsonBuilder builder;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        builder = new com.google.gson.GsonBuilder();
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_9() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_8() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_7() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_6() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_5() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_4() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_3() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_2() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_1() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization_0() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    public void testGsonWithSerializedNameFieldNamingPolicySerialization() {
        com.google.gson.Gson gson = builder.create();
        com.google.gson.common.TestTypes.ClassWithSerializedNameFields expected = new com.google.gson.common.TestTypes.ClassWithSerializedNameFields(5, 6);
        java.lang.String actual = gson.toJson(expected);
        junit.framework.Assert.assertEquals(expected.getExpectedJson(), actual);
    }

    private static class UpperCaseNamingStrategy implements com.google.gson.FieldNamingStrategy {
        public java.lang.String translateName(java.lang.reflect.Field f) {
            return f.getName().toUpperCase();
        }
    }

    @java.lang.SuppressWarnings("unused")
    private static class ClassWithDuplicateFields {
        public java.lang.Integer a;

        @com.google.gson.annotations.SerializedName("a")
        public java.lang.Double b;

        public ClassWithDuplicateFields(java.lang.Integer a) {
            this(a, null);
        }

        public ClassWithDuplicateFields(java.lang.Double b) {
            this(null, b);
        }

        public ClassWithDuplicateFields(java.lang.Integer a, java.lang.Double b) {
            this.a = a;
            this.b = b;
        }
    }

    private static class ClassWithComplexFieldName {
        @com.google.gson.annotations.SerializedName("@value\"_s$\\")
        public final long value;

        ClassWithComplexFieldName(long value) {
            this.value = value;
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.NamingPolicyTest_testGsonWithSerializedNameFieldNamingPolicySerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.NamingPolicyTest", "testGsonWithSerializedNameFieldNamingPolicySerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}