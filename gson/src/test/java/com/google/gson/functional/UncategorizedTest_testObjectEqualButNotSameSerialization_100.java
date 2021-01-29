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
public class UncategorizedTest_testObjectEqualButNotSameSerialization_100 extends junit.framework.TestCase {
    private com.google.gson.Gson gson = null;

    @java.lang.Override
    protected void setUp() throws java.lang.Exception {
        super.setUp();
        gson = new com.google.gson.Gson();
    }

    public void testObjectEqualButNotSameSerialization_99() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_98() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_97() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_96() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_95() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_94() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_93() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_92() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_91() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_90() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_89() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_88() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_87() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_86() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_85() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_84() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_83() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_82() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_81() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_80() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_79() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_78() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_77() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_76() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_75() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_74() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_73() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_72() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_71() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_70() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_69() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_68() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_67() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_66() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_65() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_64() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_63() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_62() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_61() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_60() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_59() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_58() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_57() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_56() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_55() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_54() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_53() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_52() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_51() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_50() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_49() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_48() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_47() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_46() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_45() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_44() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_43() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_42() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_41() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_40() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_39() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_38() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_37() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_36() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_35() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_34() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_33() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_32() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_31() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_30() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_29() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_28() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_27() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_26() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_25() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_24() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_23() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_22() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_21() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_20() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_19() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_18() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_17() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_16() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_15() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_14() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_13() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_12() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_11() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
    }

    public void testObjectEqualButNotSameSerialization_10() throws java.lang.Exception {
        com.google.gson.common.TestTypes.ClassOverridingEquals objA = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        com.google.gson.common.TestTypes.ClassOverridingEquals objB = new com.google.gson.common.TestTypes.ClassOverridingEquals();
        objB.ref = objA;
        java.lang.String json = gson.toJson(objB);
        junit.framework.Assert.assertEquals(objB.getExpectedJson(), json);
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
        com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.OperationType opType;
    }

    private static class Derived1 extends com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.Base {
        Derived1() {
            opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.OperationType.OP1;
        }
    }

    private static class Derived2 extends com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.Base {
        Derived2() {
            opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.OperationType.OP2;
        }
    }

    private static class BaseTypeAdapter implements com.google.gson.JsonDeserializer<com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.Base> {
        public com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.Base deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
            java.lang.String opTypeStr = json.getAsJsonObject().get("opType").getAsString();
            com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.OperationType opType = com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.OperationType.valueOf(opTypeStr);
            switch (opType) {
                case OP1 :
                    return new com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.Derived1();
                case OP2 :
                    return new com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.Derived2();
            }
            throw new com.google.gson.JsonParseException("unknown type: " + json);
        }
    }

    public static junit.framework.Test suite() {
        junit.extensions.TestSetup setup = new junit.extensions.TestSetup(new junit.framework.TestSuite(com.google.gson.functional.UncategorizedTest_testObjectEqualButNotSameSerialization_100.class) {}) {
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