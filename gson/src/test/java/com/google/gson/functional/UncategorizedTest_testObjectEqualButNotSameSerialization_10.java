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
 * Functional tests that do not fall neatly into any of the existing classification.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class UncategorizedTest_testObjectEqualButNotSameSerialization_10 extends junit.framework.TestCase {
    private com.google.gson.Gson gson = null;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testObjectEqualButNotSameSerialization_9() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_8() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_7() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_6() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_5() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_4() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_3() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_2() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_1() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_0() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    private enum OperationType {

        OP1,
        OP2;}

    private static class Base {
        com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.OperationType opType;
    }

    private static class Derived1 extends com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.Base {
        Derived1() {
            opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.OperationType.OP1;
        }
    }

    private static class Derived2 extends com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.Base {
        Derived2() {
            opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.OperationType.OP2;
        }
    }

    private static class BaseTypeAdapter implements com.google.gson.JsonDeserializer<com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.Base> {
        public com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.Base deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            java.lang.String opTypeStr = json.getAsJsonObject().get("opType").getAsString();
            com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.OperationType opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.OperationType.valueOf(opTypeStr);
            switch (opType) {
                case OP1 :
                    return new com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.Derived1();
                case OP2 :
                    return new com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.Derived2();
            }
            throw new com.google.gson.JsonParseException("unknown type: " + json);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_10.class) {}) {
            protected void setUp() {
                org.powerapi.jjoules.junit4.EnergyTest.beforeTest("com.google.gson.functional.UncategorizedTest", "testObjectEqualButNotSameSerialization");
            }

            protected void tearDown() {
                org.powerapi.jjoules.junit4.EnergyTest.afterTest();
            }
        };
        return setup;
    }
}