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
 * Functional tests for Json serialization and deserialization of regular classes.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ObjectTest_testNullFieldsSerialization_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testNullFieldsSerialization_9() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_8() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_7() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_6() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_5() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_4() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_3() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_2() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_1() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization_0() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    public void testNullFieldsSerialization() throws java.lang.Exception {
        com.google.gson.common.TestTypes.Nested target = new com.google.gson.common.TestTypes.Nested(new com.google.gson.common.TestTypes.BagOfPrimitives(10, 20, false, "stringValue"), null);
        junit.framework.Assert.assertEquals(target.getExpectedJson(), gson.toJson(target));
    }

    private static class ClassWithCollectionField {
        java.util.Collection<java.lang.String> children = new java.util.ArrayList<java.lang.String>();
    }

    private static class ClassWithObjectField {
        @java.lang.SuppressWarnings("unused")
        java.lang.Object member;
    }

    private static class Parent {
        @java.lang.SuppressWarnings("unused")
        int value1 = 1;

        private class Child {
            int value2 = 2;
        }
    }

    private static class ArrayOfArrays {
        private final com.google.gson.common.TestTypes.BagOfPrimitives[][] elements;

        public ArrayOfArrays() {
            elements = new com.google.gson.common.TestTypes.BagOfPrimitives[3][2];
            for (int i = 0; i < elements.length; ++i) {
                com.google.gson.common.TestTypes.BagOfPrimitives[] row = elements[i];
                for (int j = 0; j < row.length; ++j) {
                    row[j] = new com.google.gson.common.TestTypes.BagOfPrimitives(i + j, i * j, false, (i + "_") + j);
                }
            }
        }

        public java.lang.String getExpectedJson() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"elements\":[");
            boolean first = true;
            for (com.google.gson.common.TestTypes.BagOfPrimitives[] row : elements) {
                if (first) {
                    first = false;
                } else {
                    sb.append(",");
                }
                boolean firstOfRow = true;
                sb.append("[");
                for (com.google.gson.common.TestTypes.BagOfPrimitives element : row) {
                    if (firstOfRow) {
                        firstOfRow = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(element.getExpectedJson());
                }
                sb.append("]");
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    private static class ClassWithPrivateNoArgsConstructor {
        public int a;

        private ClassWithPrivateNoArgsConstructor() {
            a = 10;
        }
    }

    private static class ClassWithEmptyStringFields {
        java.lang.String a = "";

        java.lang.String b = "";

        java.lang.String c = "";
    }

    static final class Department {
        public java.lang.String name = "abc";

        public java.lang.String code = "123";
    }

    static final class Product {
        private java.util.List<java.lang.String> attributes = new java.util.ArrayList<java.lang.String>();

        private java.util.List<com.google.gson.functional.ObjectTest_testNullFieldsSerialization_10.Department> departments = new java.util.ArrayList<com.google.gson.functional.ObjectTest_testNullFieldsSerialization_10.Department>();
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.ObjectTest_testNullFieldsSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.ObjectTest", "testNullFieldsSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}